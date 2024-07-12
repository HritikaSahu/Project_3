package in.co.rays.project_3.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.project_3.dto.BaseDTO;
import in.co.rays.project_3.dto.OrderDTO;
import in.co.rays.project_3.exception.ApplicationException;
import in.co.rays.project_3.exception.DuplicateRecordException;
import in.co.rays.project_3.model.ModelFactory;
import in.co.rays.project_3.model.OrderModelInt;
import in.co.rays.project_3.util.DataUtility;
import in.co.rays.project_3.util.DataValidator;
import in.co.rays.project_3.util.PropertyReader;
import in.co.rays.project_3.util.ServletUtility;

@WebServlet(name = "OrderCtl", urlPatterns = { "/ctl/OrderCtl" })

public class OrderCtl extends BaseCtl {

	@Override
	protected void preload(HttpServletRequest request) {

		HashMap map = new HashMap();
		map.put("Hritika Sahu", "Hritika Sahu");
		map.put("Sagar Mehwal", "Sagar Mehwal");
		map.put("Dipesh Gocher", "Dipesh Gocher");
		map.put("Surbhi Mehwal", "Surbhi Mehwal");
		map.put("Shivanshi Gupta", "Shivanshi Gupta");
		map.put("Shubham Nagwanshi", "Shubham Nagwanshi");
		map.put("Gopal Malviya", "Gopal Malviya");
		map.put("Srajal Singh", "Srajal Singh");
		map.put("Hardeep Siddhu", "Hardeep Siddhu");
		map.put("Suyash Singh", "Suyash Singh");
		map.put("Kapil Dudhe", "Kapil Dudhe");

		request.setAttribute("customere", map);
		super.preload(request);
	}

	protected boolean validate(HttpServletRequest request) {
		boolean pass = true;

		if (DataValidator.isNull(request.getParameter("productName"))) {
			request.setAttribute("productName", PropertyReader.getValue("error.require", "productName"));
			pass = false;
		} /*
			 * else if (!DataValidator.isInteger(request.getParameter("productName"))) {
			 * request.setAttribute("productName", "productName must contains digit only");
			 * System.out.println(pass); pass = false;
			 * 
			 * }
			 */
		if (DataValidator.isNull(request.getParameter("customer"))) {
			request.setAttribute("customer", PropertyReader.getValue("error.require", "customer"));
			pass = false;
		} /*
			 * else if (!DataValidator.isInteger(request.getParameter("customer"))) {
			 * request.setAttribute("customer", "customer must contains digit only");
			 * System.out.println(pass); pass = false;
			 * 
			 * }
			 */
		if (DataValidator.isNull(request.getParameter("quantity"))) {
			request.setAttribute("quantity", PropertyReader.getValue("error.require", "quantity"));
			pass = false;
		} else if (!DataValidator.isInteger(request.getParameter("quantity"))) {
			request.setAttribute("quantity", "Please Enter quantity");
			pass = false;
		}

		if (DataValidator.isNull(request.getParameter("orderDate"))) {
			request.setAttribute("orderDate", PropertyReader.getValue("error.require", "orderDate"));

			pass = false;
		} /*
			 * else if (!DataValidator.isDate(request.getParameter("orderDate"))) {
			 * request.setAttribute("orderDate", "Order Date must contains Date only");
			 * System.out.println(pass); pass = false;
			 * 
			 * }
			 */
		return pass;

	}

	protected BaseDTO populateDTO(HttpServletRequest request) {
		OrderDTO dto = new OrderDTO();

		System.out.println(request.getParameter("orderDate"));

		dto.setId(DataUtility.getLong(request.getParameter("id")));
		dto.setProductName(DataUtility.getString(request.getParameter("productName")));
		dto.setOrderDate(DataUtility.getDate(request.getParameter("orderDate")));
		dto.setCustomer(DataUtility.getString(request.getParameter("customer")));
		dto.setQuantity(DataUtility.getInt(request.getParameter("quantity")));

		populateBean(dto, request);

		return dto;

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String op = DataUtility.getString(request.getParameter("operation"));
		OrderModelInt model = ModelFactory.getInstance().getOrderModel();

		long id = DataUtility.getLong(request.getParameter("id"));
		if (id > 0 || op != null) {
			OrderDTO dto;
			try {
				dto = model.findByPK(id);
				ServletUtility.setDto(dto, request);
			} catch (Exception e) {
				e.printStackTrace();
				ServletUtility.handleException(e, request, response);
				return;
			}
		}
		ServletUtility.forward(getView(), request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String op = DataUtility.getString(request.getParameter("operation"));
		OrderModelInt model = ModelFactory.getInstance().getOrderModel();
		long id = DataUtility.getLong(request.getParameter("id"));
		if (OP_SAVE.equalsIgnoreCase(op) || OP_UPDATE.equalsIgnoreCase(op)) {
			OrderDTO dto = (OrderDTO) populateDTO(request);
			try {
				if (id > 0) {
					model.update(dto);

					ServletUtility.setSuccessMessage("Data is successfully Update", request);
				} else {

					try {
						model.add(dto);
						ServletUtility.setDto(dto, request);
						ServletUtility.setSuccessMessage("Data is successfully saved", request);
					} catch (ApplicationException e) {
						ServletUtility.handleException(e, request, response);
						return;
					} catch (DuplicateRecordException e) {
						ServletUtility.setDto(dto, request);
						ServletUtility.setErrorMessage("Login id already exists", request);
					}

				}
				ServletUtility.setDto(dto, request);

			} catch (ApplicationException e) {
				ServletUtility.handleException(e, request, response);
				return;
			} catch (DuplicateRecordException e) {
				ServletUtility.setDto(dto, request);
				ServletUtility.setErrorMessage("Login id already exists", request);
			}
		} else if (OP_DELETE.equalsIgnoreCase(op)) {

			OrderDTO dto = (OrderDTO) populateDTO(request);
			try {
				model.delete(dto);
				ServletUtility.redirect(ORSView.ORDER_LIST_CTL, request, response);
				return;
			} catch (ApplicationException e) {
				ServletUtility.handleException(e, request, response);
				return;
			}

		} else if (OP_CANCEL.equalsIgnoreCase(op)) {

			ServletUtility.redirect(ORSView.ORDER_LIST_CTL, request, response);
			return;
		} else if (OP_RESET.equalsIgnoreCase(op)) {

			ServletUtility.redirect(ORSView.ORDER_CTL, request, response);
			return;
		}
		ServletUtility.forward(getView(), request, response);

	}

	@Override
	protected String getView() {
		// TODO Auto-generated method stub
		return ORSView.ORDER_VIEW;
	}

}
