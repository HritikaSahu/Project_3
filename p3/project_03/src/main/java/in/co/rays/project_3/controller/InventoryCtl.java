package in.co.rays.project_3.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.project_3.dto.BaseDTO;
import in.co.rays.project_3.dto.InventoryDTO;
import in.co.rays.project_3.exception.ApplicationException;
import in.co.rays.project_3.exception.DuplicateRecordException;
import in.co.rays.project_3.model.InventoryModelInt;
import in.co.rays.project_3.model.ModelFactory;
import in.co.rays.project_3.util.DataUtility;
import in.co.rays.project_3.util.DataValidator;
import in.co.rays.project_3.util.PropertyReader;
import in.co.rays.project_3.util.ServletUtility;

@WebServlet(name = "InventoryCtl", urlPatterns = { "/ctl/InventoryCtl" })

public class InventoryCtl extends BaseCtl {

	@Override
	protected void preload(HttpServletRequest request) {

		HashMap map = new HashMap();
		map.put("Organic Almonds", "Organic Almonds");
		map.put("Organic Apples", "Organic Apples");
		map.put("Organic Whole Wheat Bread", "Organic Whole Wheat Bread");
		map.put("Organic Green Tea", "Organic Green Tea");
		map.put(" Organic Olive Oil", " Organic Olive Oil");
		map.put("Organic Honey", "Organic Honey");
		map.put("Organic Coconut Milk", "Organic Coconut Milk");
		map.put("Organic Spinach", "Organic Spinach");
		map.put(" Organic Dark Chocolate", " Organic Dark Chocolate");
		map.put("Organic Quinoa", "Organic Quinoa");

		request.setAttribute("productt", map);
		super.preload(request);
	}

	protected boolean validate(HttpServletRequest request) {
		boolean pass = true;

		if (DataValidator.isNull(request.getParameter("supplierName"))) {
			request.setAttribute("supplierName", PropertyReader.getValue("error.require", "supplierName"));
			pass = false;
		} /*
			 * else if (!DataValidator.isInteger(request.getParameter("supplierName"))) {
			 * request.setAttribute("supplierName",
			 * "supplierName must contains digit only"); System.out.println(pass); pass =
			 * false;
			 * 
			 * }
			 */
		if (DataValidator.isNull(request.getParameter("product"))) {
			request.setAttribute("product", PropertyReader.getValue("error.require", "product"));
			pass = false;
		} /*
			 * else if (!DataValidator.isInteger(request.getParameter("product"))) {
			 * request.setAttribute("product", "product must contains digit only");
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

		if (DataValidator.isNull(request.getParameter("lastUpdatedDate"))) {
			request.setAttribute("lastUpdatedDate", PropertyReader.getValue("error.require", "lastUpdatedDate"));

			pass = false;
		} /*
			 * else if (!DataValidator.isDate(request.getParameter("lastUpdatedDate"))) {
			 * request.setAttribute("lastUpdatedDate",
			 * "Last Updated Date must contains Date only"); System.out.println(pass); pass
			 * = false;
			 * 
			 * }
			 */
		return pass;

	}

	protected BaseDTO populateDTO(HttpServletRequest request) {
		InventoryDTO dto = new InventoryDTO();

		System.out.println(request.getParameter("lastUpdatedDate"));

		dto.setId(DataUtility.getLong(request.getParameter("id")));
		dto.setSupplierName(DataUtility.getString(request.getParameter("supplierName")));
		dto.setLastUpdatedDate(DataUtility.getDate(request.getParameter("lastUpdatedDate")));
		dto.setProduct(DataUtility.getString(request.getParameter("product")));
		dto.setQuantity(DataUtility.getInt(request.getParameter("quantity")));

		populateBean(dto, request);

		return dto;

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String op = DataUtility.getString(request.getParameter("operation"));
		InventoryModelInt model = ModelFactory.getInstance().getInventoryModel();

		long id = DataUtility.getLong(request.getParameter("id"));
		if (id > 0 || op != null) {
			InventoryDTO dto;
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
		InventoryModelInt model = ModelFactory.getInstance().getInventoryModel();
		long id = DataUtility.getLong(request.getParameter("id"));
		if (OP_SAVE.equalsIgnoreCase(op) || OP_UPDATE.equalsIgnoreCase(op)) {
			InventoryDTO dto = (InventoryDTO) populateDTO(request);
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

			InventoryDTO dto = (InventoryDTO) populateDTO(request);
			try {
				model.delete(dto);
				ServletUtility.redirect(ORSView.INVENTORY_LIST_CTL, request, response);
				return;
			} catch (ApplicationException e) {
				ServletUtility.handleException(e, request, response);
				return;
			}

		} else if (OP_CANCEL.equalsIgnoreCase(op)) {

			ServletUtility.redirect(ORSView.INVENTORY_LIST_CTL, request, response);
			return;
		} else if (OP_RESET.equalsIgnoreCase(op)) {

			ServletUtility.redirect(ORSView.INVENTORY_CTL, request, response);
			return;
		}
		ServletUtility.forward(getView(), request, response);

	}

	@Override
	protected String getView() {
		// TODO Auto-generated method stub
		return ORSView.INVENTORY_VIEW;
	}

}
