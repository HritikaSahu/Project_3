/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.48
 * Generated at: 2024-04-16 09:58:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import in.co.rays.project_3.util.HTMLUtility;
import in.co.rays.project_3.dto.SubjectDTO;
import java.util.Iterator;
import in.co.rays.project_3.util.DataUtility;
import java.util.List;
import in.co.rays.project_3.util.ServletUtility;
import in.co.rays.project_3.controller.SubjectListCtl;
import in.co.rays.project_3.controller.LoginCtl;
import in.co.rays.project_3.controller.ORSView;
import in.co.rays.project_3.controller.LoginCtl;
import in.co.rays.project_3.dto.RoleDTO;
import in.co.rays.project_3.dto.UserDTO;
import in.co.rays.project_3.controller.ORSView;

public final class SubjectListView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/jsp/Header.jsp", Long.valueOf(1713174185287L));
    _jspx_dependants.put("/jsp/FooterView.jsp", Long.valueOf(1712914442223L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("in.co.rays.project_3.util.HTMLUtility");
    _jspx_imports_classes.add("java.util.Iterator");
    _jspx_imports_classes.add("in.co.rays.project_3.dto.SubjectDTO");
    _jspx_imports_classes.add("in.co.rays.project_3.util.ServletUtility");
    _jspx_imports_classes.add("in.co.rays.project_3.dto.RoleDTO");
    _jspx_imports_classes.add("in.co.rays.project_3.util.DataUtility");
    _jspx_imports_classes.add("in.co.rays.project_3.controller.LoginCtl");
    _jspx_imports_classes.add("in.co.rays.project_3.dto.UserDTO");
    _jspx_imports_classes.add("in.co.rays.project_3.controller.SubjectListCtl");
    _jspx_imports_classes.add("in.co.rays.project_3.controller.ORSView");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Subject List View</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<script src=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/js/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("	src=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/js/CheckBox11.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write("body{\r\n");
      out.write("	background-image: url('");
      out.print(ORSView.APP_CONTEXT);
      out.write("/img/List.jpg');\r\n");
      out.write("	background-size: 100%;\r\n");
      out.write("			  background-attachment: fixed;\r\n");
      out.write("	\r\n");
      out.write("} \r\n");
      out.write("\r\n");
      out.write(".p1 {\r\n");
      out.write("	padding: 8px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<nav class=\"fixed-top\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Header</title>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://use.fontawesome.com/releases/v5.6.3/css/all.css\"\r\n");
      out.write("	integrity=\"sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".reg {\r\n");
      out.write("  background: #a370d7;\r\n");
      out.write("  \r\n");
      out.write("    /* Chrome 10-25, Safari 5.1-6 */\r\n");
      out.write("    background: -webkit-linear-gradient(to right, rgba(163,112,215,1), rgba(202,40,204,1));\r\n");
      out.write("  \r\n");
      out.write("    /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */\r\n");
      out.write("    background: linear-gradient(to right, rgba(163,112,215,1), rgba(202,40,204,1))\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");

		UserDTO userDto = (UserDTO) session.getAttribute("user");

		boolean userLoggedIn = userDto != null;

		String welcomeMsg = "Hi, ";

		if (userLoggedIn) {
			String role = (String) session.getAttribute("role");
			welcomeMsg += userDto.getFirstName() + " (" + role + ")";
		} else {
			welcomeMsg += "Guest";
		}
	
      out.write("\r\n");
      out.write("	<div class=\"header\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<nav class=\"navbar navbar-expand-lg reg fixed-top\"> <a\r\n");
      out.write("			class=\"navbar-brand\" href=\"");
      out.print(ORSView.WELCOME_CTL);
      out.write("\"><img\r\n");
      out.write("			src=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/img/custom.png\" width=\"190px\"\r\n");
      out.write("			height=\"50px\"></a>\r\n");
      out.write("\r\n");
      out.write("		<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n");
      out.write("			data-target=\"#navbarNav\" aria-controls=\"navbarNav\"\r\n");
      out.write("			aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("\r\n");
      out.write("			<span class=\"navbar-toggler-icon\"> <i class=\"fas fa-bars\"\r\n");
      out.write("				style=\"color: #fff; font-size: 28px;\"></i></span>\r\n");
      out.write("\r\n");
      out.write("		</button>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"collapse navbar-collapse\" id=\"navbarNav\">\r\n");
      out.write("\r\n");
      out.write("			<ul class=\"nav navbar-nav ml-auto\">\r\n");
      out.write("\r\n");
      out.write("				<a class=\"nav-link\" href=\"#\"> <span class=\"sr-only\">(current)</span>\r\n");
      out.write("				</a>\r\n");
      out.write("				");

					if (userLoggedIn) {
				
      out.write("\r\n");
      out.write("				");

					if (userDto.getRoleId() == RoleDTO.STUDENT) {
				
      out.write("\r\n");
      out.write("\r\n");
      out.write("				<li class=\"nav-item dropdown\"><a\r\n");
      out.write("					class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("					role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("					aria-expanded=\"false\"> <font style=\"color: white;\">Marksheet</font>\r\n");
      out.write("\r\n");
      out.write("				</a>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\r\n");
      out.write("						<li><a class=\"dropdown-item\"\r\n");
      out.write("							href=\"");
      out.print(ORSView.MARKSHEET_MERIT_LIST_CTL);
      out.write("\"><i\r\n");
      out.write("								class=\" far fa-file-alt\"></i>Marksheet Merit List</a>\r\n");
      out.write("					</div></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("				<li class=\"nav-item dropdown\"><a\r\n");
      out.write("					class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("					role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("					aria-expanded=\"false\"> <font style=\"color: white;\">User</font>\r\n");
      out.write("\r\n");
      out.write("				</a>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\r\n");
      out.write("						<li><a class=\"dropdown-item\"\r\n");
      out.write("							href=\"");
      out.print(ORSView.MY_PROFILE_CTL);
      out.write("\"><i class=\"fas fa-user-tie\"></i>My\r\n");
      out.write("\r\n");
      out.write("								Profile</a> <a class=\"dropdown-item\"\r\n");
      out.write("							href=\"");
      out.print(ORSView.CHANGE_PASSWORD_CTL);
      out.write("\"><i\r\n");
      out.write("								class=\" fa fa-file-alt\"></i>Change Password</a>\r\n");
      out.write("					</div></li>\r\n");
      out.write("\r\n");
      out.write("				");

					} else if (userDto.getRoleId() == RoleDTO.ADMIN) {
				
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("				<li class=\"nav-item dropdown\" style=\"padding-left: 5px;\"><a\r\n");
      out.write("					class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("					role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("					aria-expanded=\"false\"> <font style=\"color: white;\">User</font>\r\n");
      out.write("\r\n");
      out.write("				</a>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\r\n");
      out.write("						<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.USER_CTL);
      out.write("\"><i\r\n");
      out.write("							class=\"fas fa-user-circle\"></i>Add User</a> <a class=\"dropdown-item\"\r\n");
      out.write("							href=\"");
      out.print(ORSView.USER_LIST_CTL);
      out.write("\"><i\r\n");
      out.write("							class=\"fas fa-user-friends\"></i>User List</a>\r\n");
      out.write("					</div></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("				<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\r\n");
      out.write("					class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("					role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("					aria-expanded=\"false\"> <font style=\"color: white;\">Marksheet\r\n");
      out.write("\r\n");
      out.write("					</font></a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("					<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("						<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.MARKSHEET_CTL);
      out.write("\"><i\r\n");
      out.write("							class=\"far fa-file\"></i>Add Marksheet</a> <a class=\"dropdown-item\"\r\n");
      out.write("							href=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\"><i\r\n");
      out.write("							class=\"fas fa-paste\"></i>Marksheet List</a> <a class=\"dropdown-item\"\r\n");
      out.write("							href=\"");
      out.print(ORSView.MARKSHEET_MERIT_LIST_CTL);
      out.write("\"><i\r\n");
      out.write("							class=\" far fa-file-alt\"></i>Marksheet Merit List </a> <a\r\n");
      out.write("							class=\"dropdown-item\" href=\"");
      out.print(ORSView.GET_MARKSHEET_CTL);
      out.write("\"><i\r\n");
      out.write("							class=\"far fa-copy\"></i>Get Marksheet</a>\r\n");
      out.write("\r\n");
      out.write("					</div></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("				<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\r\n");
      out.write("					class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("					role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("					aria-expanded=\"false\"> <font style=\"color: white;\">Role</font>\r\n");
      out.write("\r\n");
      out.write("				</a>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\r\n");
      out.write("						<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.ROLE_CTL);
      out.write("\"><i\r\n");
      out.write("							class=\"fas fa-user-tie\"></i>Add Role</a> <a class=\"dropdown-item\"\r\n");
      out.write("							href=\"");
      out.print(ORSView.ROLE_LIST_CTL);
      out.write("\"><i\r\n");
      out.write("							class=\"fas fa-user-friends\"></i>Role List</a>\r\n");
      out.write("\r\n");
      out.write("					</div></li>\r\n");
      out.write("\r\n");
      out.write("				<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\r\n");
      out.write("					class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("					role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("					aria-expanded=\"false\"> <font style=\"color: white;\">College</font>\r\n");
      out.write("\r\n");
      out.write("				</a>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\r\n");
      out.write("						<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.COLLEGE_CTL);
      out.write("\"><i\r\n");
      out.write("							class=\"fas fa-university\"></i>Add College</a> <a\r\n");
      out.write("							class=\"dropdown-item\" href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\"><i\r\n");
      out.write("							class=\"fas fa-building\"></i>College List </a>\r\n");
      out.write("\r\n");
      out.write("					</div></li>\r\n");
      out.write("\r\n");
      out.write("				<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\r\n");
      out.write("					class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("					role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("					aria-expanded=\"false\"> <font style=\"color: white;\">Course\r\n");
      out.write("\r\n");
      out.write("					</font></a>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\r\n");
      out.write("						<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.COURSE_CTL);
      out.write("\"><i\r\n");
      out.write("							class=\"fas fa-book-open\"></i>Add Course</a> <a class=\"dropdown-item\"\r\n");
      out.write("							href=\"");
      out.print(ORSView.COURSE_LIST_CTL);
      out.write("\"><i\r\n");
      out.write("							class=\"fas fa-sort-amount-down\"></i>Course List </a>\r\n");
      out.write("\r\n");
      out.write("					</div></li>\r\n");
      out.write("\r\n");
      out.write("				<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\r\n");
      out.write("					class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("					role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("					aria-expanded=\"false\"> <font style=\"color: white;\">Student</font>\r\n");
      out.write("\r\n");
      out.write("				</a>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\r\n");
      out.write("						<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.STUDENT_CTL);
      out.write("\"><i\r\n");
      out.write("							class=\"far fa-user-circle\"></i>Add Student</a> <a\r\n");
      out.write("							class=\"dropdown-item\" href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\"><i\r\n");
      out.write("							class=\"fas fa-users\"></i>Student List</a>\r\n");
      out.write("\r\n");
      out.write("					</div></li>\r\n");
      out.write("\r\n");
      out.write("				<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\r\n");
      out.write("					class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("					role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("					aria-expanded=\"false\"> <font style=\"color: white;\">Faculty\r\n");
      out.write("\r\n");
      out.write("					</font></a>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\r\n");
      out.write("						<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.FACULTY_CTL);
      out.write("\"><i\r\n");
      out.write("							class=\"fas fa-user-tie\"></i>Add Faculty</a> <a class=\"dropdown-item\"\r\n");
      out.write("							href=\"");
      out.print(ORSView.FACULTY_LIST_CTL);
      out.write("\"><i class=\" fas fa-users\"></i>Faculty\r\n");
      out.write("\r\n");
      out.write("							List</a>\r\n");
      out.write("\r\n");
      out.write("					</div></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("				<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\r\n");
      out.write("					class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("					role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("					aria-expanded=\"false\"> <font style=\"color: white;\">Time\r\n");
      out.write("\r\n");
      out.write("							Table</font>\r\n");
      out.write("\r\n");
      out.write("				</a>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\r\n");
      out.write("						<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.TIMETABLE_CTL);
      out.write("\"><i\r\n");
      out.write("							class=\"fas fa-clock\"></i>Add TimeTable</a> <a class=\"dropdown-item\"\r\n");
      out.write("							href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL);
      out.write("\"><i\r\n");
      out.write("							class=\"far fa-clock\"></i>TimeTable List</a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("					</div></li>\r\n");
      out.write("\r\n");
      out.write("				<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\r\n");
      out.write("					class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("					role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("					aria-expanded=\"false\"> <font style=\"color: white;\">Subject</font>\r\n");
      out.write("\r\n");
      out.write("				</a>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\r\n");
      out.write("						<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.SUBJECT_CTL);
      out.write("\"><i\r\n");
      out.write("							class=\"fas fa-calculator\"></i>Add Subject</a> <a\r\n");
      out.write("							class=\"dropdown-item\" href=\"");
      out.print(ORSView.SUBJECT_LIST_CTL);
      out.write("\"> <i\r\n");
      out.write("							class=\"fas fa-sort-amount-down\"></i>Subject List\r\n");
      out.write("\r\n");
      out.write("						</a>\r\n");
      out.write("\r\n");
      out.write("					</div></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("				");

					}
					}
				
      out.write("\r\n");
      out.write("				<li class=\"nav-item dropdown\"\r\n");
      out.write("					style=\"padding-left: 5px; padding-right: 67px\"><a\r\n");
      out.write("					class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("					role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("					aria-expanded=\"false\"><font style=\"color: white;\">");
      out.print(welcomeMsg);
      out.write("\r\n");
      out.write("					</font></a>\r\n");
      out.write("					<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("						");

							if (userLoggedIn) {
						
      out.write("\r\n");
      out.write("						<a class=\"dropdown-item\"\r\n");
      out.write("							href=\"");
      out.print(ORSView.LOGIN_CTL);
      out.write("?operation=");
      out.print(LoginCtl.OP_LOG_OUT);
      out.write("\"><i\r\n");
      out.write("							class=\"fas fa-sign-out-alt\"></i>Logout </a> <a class=\"dropdown-item\"\r\n");
      out.write("							href=\"");
      out.print(ORSView.MY_PROFILE_CTL);
      out.write("\"><i class=\"fas fa-user-tie\"></i>My\r\n");
      out.write("							Profile</a> <a class=\"dropdown-item\"\r\n");
      out.write("							href=\"");
      out.print(ORSView.CHANGE_PASSWORD_CTL);
      out.write("\"> <i\r\n");
      out.write("							class=\"fas fa-edit\"></i>Change Password\r\n");
      out.write("						</a> <a class=\"dropdown-item\" target=\"blank\"\r\n");
      out.write("							href=\"");
      out.print(ORSView.JAVA_DOC_VIEW);
      out.write("\"><i class=\"fas fa-clone\"></i>Java\r\n");
      out.write("							Doc </a>\r\n");
      out.write("						");

							} else {
						
      out.write("\r\n");
      out.write("						<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.LOGIN_CTL);
      out.write("\"><i\r\n");
      out.write("							class=\"fas fa-sign-in-alt\"><b> Login</b></i> <a\r\n");
      out.write("							class=\"dropdown-item\" href=\"");
      out.print(ORSView.USER_REGISTRATION_CTL);
      out.write("\"><i\r\n");
      out.write("								class=\"fas fa-registered\"><b> User Registration</b></i></a>\r\n");
      out.write("					</div></li>\r\n");
      out.write("				");

					}
				
      out.write("\r\n");
      out.write("			</ul>\r\n");
      out.write("		</div>\r\n");
      out.write("		</nav>\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("</nav>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	\r\n");
      out.write("	<div>\r\n");
      out.write("		<form action=\"");
      out.print(ORSView.SUBJECT_LIST_CTL);
      out.write("\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			");
      in.co.rays.project_3.dto.SubjectDTO dto = null;
      dto = (in.co.rays.project_3.dto.SubjectDTO) _jspx_page_context.getAttribute("dto", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (dto == null){
        dto = new in.co.rays.project_3.dto.SubjectDTO();
        _jspx_page_context.setAttribute("dto", dto, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write("\r\n");
      out.write("			");

				List list2 = (List) request.getAttribute("courseList");
			
      out.write("\r\n");
      out.write("			");

				int pageNo = ServletUtility.getPageNo(request);
				int pageSize = ServletUtility.getPageSize(request);
				int index = ((pageNo - 1) * pageSize) + 1;
				int nextPageSize = DataUtility.getInt(request.getAttribute("nextListSize").toString());
				List list = ServletUtility.getList(request);
				Iterator<SubjectDTO> it = list.iterator();
				if (list.size() != 0) {
			
      out.write("\r\n");
      out.write("			<center>\r\n");
      out.write("						<h1 class=\"text-primary font-weight-bold pt-3\">Subject\r\n");
      out.write("							List</h1>\r\n");
      out.write("					</center>\r\n");
      out.write("					</br>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"row\">\r\n");
      out.write("				<div class=\"col-md-4\"></div>\r\n");
      out.write("				\r\n");
      out.write("					");

						if (!ServletUtility.getSuccessMessage(request).equals("")) {
					
      out.write("\r\n");
      out.write("\r\n");
      out.write("					<div class=\"col-md-4 alert alert-success alert-dismissible\" style=\"background-color: #80ff80\">\r\n");
      out.write("						<button type=\"button\" class=\"close\" data-dismiss=\"alert\">&times;</button>\r\n");
      out.write("						<h4><font color=\"#008000\">");
      out.print(ServletUtility.getSuccessMessage(request));
      out.write("</font></h4>\r\n");
      out.write("					</div>\r\n");
      out.write("					");

						}
					
      out.write("\r\n");
      out.write("				\r\n");
      out.write("				<div class=\"col-md-4\"></div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<div class=\"col-md-4\"></div>\r\n");
      out.write("				\r\n");
      out.write("					");

						if (!ServletUtility.getErrorMessage(request).equals("")) {
					
      out.write("\r\n");
      out.write("					<div class=\" col-md-4 alert alert-danger alert-dismissible\">\r\n");
      out.write("						<button type=\"button\" class=\"close\" data-dismiss=\"alert\">&times;</button>\r\n");
      out.write("					<h4>	<font color=\"red\">");
      out.print(ServletUtility.getErrorMessage(request));
      out.write("</font></h4>\r\n");
      out.write("					</div>\r\n");
      out.write("					");

						}
					
      out.write("\r\n");
      out.write("					<div class=\"col-md-4\"></div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("				<div class=\"col-sm-3\"></div>\r\n");
      out.write("				<div class=\"col-sm-2\">\r\n");
      out.write("					<input type=\"text\" name=\"name\" placeholder=\"Enter SubjectName\" class=\"form-control\"\r\n");
      out.write("							value=\"");
      out.print(ServletUtility.getParameter("name", request));
      out.write("\">\r\n");
      out.write("				</div>\r\n");
      out.write("				\r\n");
      out.write("				<div class=\"col-sm-2\">");
      out.print(HTMLUtility.getList("courseId", String.valueOf(dto.getCourseId()), list2));
      out.write("</div>\r\n");
      out.write("				<div class=\"col-sm-2\">\r\n");
      out.write("					<input type=\"submit\" class=\"btn btn-primary btn-md\"\r\n");
      out.write("						style=\"font-size: 17px\" name=\"operation\"\r\n");
      out.write("						value=\"");
      out.print(SubjectListCtl.OP_SEARCH);
      out.write("\">&emsp;\r\n");
      out.write("						<input type=\"submit\" class=\"btn btn-warning btn-md\"\r\n");
      out.write("						style=\"font-size: 17px\" name=\"operation\"\r\n");
      out.write("						value=\"");
      out.print(SubjectListCtl.OP_RESET);
      out.write("\">\r\n");
      out.write("				</div>\r\n");
      out.write("				\r\n");
      out.write("			\r\n");
      out.write("				<div class=\"col-sm-3\"></div>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			</br>\r\n");
      out.write("			<div style=\"margin-bottom: 20px;\" class=\"table-responsive\">\r\n");
      out.write("				<table class=\"table table-hover\">\r\n");
      out.write("					<thead>\r\n");
      out.write("						<tr style=\"background-color: #8C8C8C;\">\r\n");
      out.write("\r\n");
      out.write("							<th width=\"10%\"><input type=\"checkbox\" id=\"select_all\"\r\n");
      out.write("								name=\"Select\" class=\"text\"> Select All</th>\r\n");
      out.write("							<th class=\"text\">S.NO</th>\r\n");
      out.write("							<th class=\"text\">Subject Name</th>\r\n");
      out.write("							<th class=\"text\">Course Name</th>\r\n");
      out.write("							<th class=\"text\">Description</th>\r\n");
      out.write("							<th class=\"text\">Edit</th>\r\n");
      out.write("						</tr>\r\n");
      out.write("					</thead>\r\n");
      out.write("					");

						while (it.hasNext()) {
								dto = it.next();
					
      out.write("\r\n");
      out.write("\r\n");
      out.write("					<tbody>\r\n");
      out.write("						<tr>\r\n");
      out.write("							<td align=\"center\"><input type=\"checkbox\" class=\"checkbox\" \r\n");
      out.write("								name=\"ids\" value=\"");
      out.print(dto.getId());
      out.write("\" ></td>\r\n");
      out.write("							<td bgcolor=\"white\">");
      out.print(index++);
      out.write("</td>\r\n");
      out.write("							<td bgcolor=\"white\">");
      out.print(dto.getSubjectName());
      out.write("</td>\r\n");
      out.write("							<td bgcolor=\"white\">");
      out.print(dto.getCourseName());
      out.write("</td>\r\n");
      out.write("							<td bgcolor=\"white\">");
      out.print(dto.getDescription());
      out.write("</td>\r\n");
      out.write("							<td bgcolor=\"white\"><a href=\"SubjectCtl?id=");
      out.print(dto.getId());
      out.write("\">Edit</a></td>\r\n");
      out.write("						</tr>\r\n");
      out.write("					</tbody>\r\n");
      out.write("					");

						}
					
      out.write("\r\n");
      out.write("				</table>\r\n");
      out.write("</div>\r\n");
      out.write("				<table width=\"100%\">\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td><input type=\"submit\" name=\"operation\"\r\n");
      out.write("							class=\"btn btn-secondary btn-md\" style=\"font-size: 17px\"\r\n");
      out.write("							value=\"");
      out.print(SubjectListCtl.OP_PREVIOUS);
      out.write("\"\r\n");
      out.write("							");
      out.print(pageNo > 1 ? "" : "disabled");
      out.write("></td>\r\n");
      out.write("						<td><input type=\"submit\" name=\"operation\"\r\n");
      out.write("							class=\"btn btn-primary btn-md\" style=\"font-size: 17px\"\r\n");
      out.write("							value=\"");
      out.print(SubjectListCtl.OP_NEW);
      out.write("\"></td>\r\n");
      out.write("						<td><input type=\"submit\" name=\"operation\"\r\n");
      out.write("							class=\"btn btn-danger btn-md\" style=\"font-size: 17px\"\r\n");
      out.write("							value=\"");
      out.print(SubjectListCtl.OP_DELETE);
      out.write("\"></td>\r\n");
      out.write("\r\n");
      out.write("						<td align=\"right\"><input type=\"submit\" name=\"operation\"\r\n");
      out.write("							class=\"btn btn-secondary btn-md\" style=\"font-size: 17px\"\r\n");
      out.write("							style=\"padding: 5px;\" value=\"");
      out.print(SubjectListCtl.OP_NEXT);
      out.write("\"\r\n");
      out.write("							");
      out.print((nextPageSize != 0) ? "" : "disabled");
      out.write("></td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr></tr>\r\n");
      out.write("				</table>\r\n");
      out.write("				</br>\r\n");
      out.write("			\r\n");
      out.write("			");

				}
				if (list.size() == 0) {
					System.out.println("user list view list.size==0");
			
      out.write("\r\n");
      out.write("			<center>\r\n");
      out.write("						<h1 class=\"text-primary font-weight-bold pt-3\">Subject\r\n");
      out.write("							List</h1>\r\n");
      out.write("					</center>\r\n");
      out.write("					</br>\r\n");
      out.write("					<div class=\"row\">\r\n");
      out.write("				<div class=\"col-md-4\"></div>\r\n");
      out.write("				\r\n");
      out.write("					");

						if (!ServletUtility.getErrorMessage(request).equals("")) {
					
      out.write("\r\n");
      out.write("					<div class=\" col-md-4 alert alert-danger alert-dismissible\">\r\n");
      out.write("						<button type=\"button\" class=\"close\" data-dismiss=\"alert\">&times;</button>\r\n");
      out.write("					<h4>	<font color=\"red\">");
      out.print(ServletUtility.getErrorMessage(request));
      out.write("</font></h4>\r\n");
      out.write("					</div>\r\n");
      out.write("					");

						}
					
      out.write("\r\n");
      out.write("					<div class=\"col-md-4\"></div>\r\n");
      out.write("			</div>\r\n");
      out.write("					</br>\r\n");
      out.write("			<div style=\"padding-left: 48%;\">\r\n");
      out.write("				<input type=\"submit\" name=\"operation\" class=\"btn btn-primary btn-md\"\r\n");
      out.write("					style=\"font-size: 17px\" value=\"");
      out.print(SubjectListCtl.OP_BACK);
      out.write("\">\r\n");
      out.write("			</div>\r\n");
      out.write("			");

				}
			
      out.write("\r\n");
      out.write("			<input type=\"hidden\" name=\"pageNo\" value=\"");
      out.print(pageNo);
      out.write("\"> <input\r\n");
      out.write("				type=\"hidden\" name=\"pageSize\" value=\"");
      out.print(pageSize);
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		</form>\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("</br>\r\n");
      out.write("</br>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write(".footer {\r\n");
      out.write(" position: fixed;\r\n");
      out.write("   left: 0;\r\n");
      out.write("   bottom: 0;\r\n");
      out.write("   width: 100%;\r\n");
      out.write("/*      background-color: #343a40;\r\n");
      out.write(" */      color: white;\r\n");
      out.write("   text-align: center;\r\n");
      out.write("  background: #a370d7;\r\n");
      out.write("  \r\n");
      out.write("    /* Chrome 10-25, Safari 5.1-6 */\r\n");
      out.write("    background: -webkit-linear-gradient(to right, rgba(163,112,215,1), rgba(202,40,204,1));\r\n");
      out.write("  \r\n");
      out.write("    /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */\r\n");
      out.write("    background: linear-gradient(to right, rgba(163,112,215,1), rgba(202,40,204,1))\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body >\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("<center>\r\n");
      out.write("\r\n");
      out.write("<h5>&copy; RAYS Technologies</h5></center>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
