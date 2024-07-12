package in.co.rays.project_3.controller;

public interface ORSView {

	public String APP_CONTEXT = "/project_3";

	public String PAGE_FOLDER = "/jsp";

	public String JAVA_DOC_VIEW = APP_CONTEXT + "/doc/index.html";

	public String ERROR_VIEW = PAGE_FOLDER + "/ErrorView404.jsp";

	public String MARKSHEET_VIEW = PAGE_FOLDER + "/MarksheetView.jsp";
	public String MARKSHEET_LIST_VIEW = PAGE_FOLDER + "/MarksheetListView.jsp";
	public String GET_MARKSHEET_VIEW = PAGE_FOLDER + "/GetMarksheetView.jsp";
	public String USER_VIEW = PAGE_FOLDER + "/UserView.jsp";
	public String USER_LIST_VIEW = PAGE_FOLDER + "/UserListView.jsp";
	public String COLLEGE_VIEW = PAGE_FOLDER + "/CollegeView.jsp";
	public String COLLEGE_LIST_VIEW = PAGE_FOLDER + "/CollegeListView.jsp";
	public String STUDENT_VIEW = PAGE_FOLDER + "/StudentView.jsp";
	public String STUDENT_LIST_VIEW = PAGE_FOLDER + "/StudentListView.jsp";
	public String ROLE_VIEW = PAGE_FOLDER + "/RoleView.jsp";
	public String ROLE_LIST_VIEW = PAGE_FOLDER + "/RoleListView.jsp";
	public String USER_REGISTRATION_VIEW = PAGE_FOLDER + "/UserRegistrationView.jsp";
	public String LOGIN_VIEW = PAGE_FOLDER + "/LoginView.jsp";
	public String WELCOME_VIEW = PAGE_FOLDER + "/Welcome.jsp";
	public String CHANGE_PASSWORD_VIEW = PAGE_FOLDER + "/ChangePasswordView.jsp";
	public String MY_PROFILE_VIEW = PAGE_FOLDER + "/MyProfileView.jsp";
	public String FORGET_PASSWORD_VIEW = PAGE_FOLDER + "/ForgetPasswordView.jsp";
	public String MARKSHEET_MERIT_LIST_VIEW = PAGE_FOLDER + "/MarksheetMeritListView.jsp";

	public String FACULTY_VIEW = PAGE_FOLDER + "/FacultyView.jsp";
	public String FACULTY_LIST_VIEW = PAGE_FOLDER + "/FacultyListView.jsp";
	public String COURSE_VIEW = PAGE_FOLDER + "/CourseView.jsp";
	public String COURSE_LIST_VIEW = PAGE_FOLDER + "/CourseListView.jsp";
	public String TIMETABLE_VIEW = PAGE_FOLDER + "/TimeTableView.jsp";
	public String TIMETABLE_LIST_VIEW = PAGE_FOLDER + "/TimeTableListView.jsp";
	public String SUBJECT_VIEW = PAGE_FOLDER + "/SubjectView.jsp";
	public String SUBJECT_LIST_VIEW = PAGE_FOLDER + "/SubjectListView.jsp";
	public String ISSUE_VIEW = PAGE_FOLDER + "/IssueView.jsp";
	public String ISSUE_LIST_VIEW = PAGE_FOLDER + "/IssueListView.jsp";
	public String VEHICLE_TRACKING_VIEW = PAGE_FOLDER + "/VehicleTrackingView.jsp";
	public String VEHICLE_TRACKING_LIST_VIEW = PAGE_FOLDER + "/VehicleTrackingListView.jsp";
	public String DOCTOR_VIEW = PAGE_FOLDER + "/DoctorView.jsp";
	public String DOCTOR_LIST_VIEW = PAGE_FOLDER + "/DoctorListView.jsp";
	public String INVENTORY_VIEW = PAGE_FOLDER + "/InventoryView.jsp";
	public String INVENTORY_LIST_VIEW = PAGE_FOLDER + "/InventoryListView.jsp";
	public String ORDER_VIEW = PAGE_FOLDER + "/OrderView.jsp";
	public String ORDER_LIST_VIEW = PAGE_FOLDER + "/OrderListView.jsp";
	public String TRANSPORTATION_VIEW = PAGE_FOLDER + "/TransportationView.jsp";
	public String TRANSPORTATION_LIST_VIEW = PAGE_FOLDER + "/TransportationListView.jsp";
	public String SUPPLIER_VIEW = PAGE_FOLDER + "/SupplierView.jsp";
	public String SUPPLIER_LIST_VIEW = PAGE_FOLDER + "/SupplierListView.jsp";
	public String TRANSACTIONS_VIEW = PAGE_FOLDER + "/TransactionsView.jsp";
	public String TRANSACTIONS_LIST_VIEW = PAGE_FOLDER + "/TransactionsListView.jsp";
	public String ROUTE_VIEW = PAGE_FOLDER + "/RouteView.jsp";
	public String ROUTE_LIST_VIEW = PAGE_FOLDER + "/RouteListView.jsp";

	public String ERROR_CTL = APP_CONTEXT + "/ErrorCtl";

	public String MARKSHEET_CTL = APP_CONTEXT + "/ctl/MarksheetCtl";
	public String MARKSHEET_LIST_CTL = APP_CONTEXT + "/ctl/MarksheetListCtl";
	public String USER_CTL = APP_CONTEXT + "/ctl/UserCtl";
	public String USER_LIST_CTL = APP_CONTEXT + "/ctl/UserListCtl";
	public String COLLEGE_CTL = APP_CONTEXT + "/ctl/CollegeCtl";
	public String COLLEGE_LIST_CTL = APP_CONTEXT + "/ctl/CollegeListCtl";
	public String STUDENT_CTL = APP_CONTEXT + "/ctl/StudentCtl";
	public String STUDENT_LIST_CTL = APP_CONTEXT + "/ctl/StudentListCtl";
	public String ROLE_CTL = APP_CONTEXT + "/ctl/RoleCtl";
	public String ROLE_LIST_CTL = APP_CONTEXT + "/ctl/RoleListCtl";
	public String USER_REGISTRATION_CTL = APP_CONTEXT + "/UserRegistrationCtl";
	public String LOGIN_CTL = APP_CONTEXT + "/LoginCtl";
	public String WELCOME_CTL = APP_CONTEXT + "/WelcomeCtl";

	public String FACULTY_CTL = APP_CONTEXT + "/ctl/FacultyCtl";
	public String FACULTY_LIST_CTL = APP_CONTEXT + "/ctl/FacultyListCtl";
	public String COURSE_CTL = APP_CONTEXT + "/ctl/CourseCtl";
	public String COURSE_LIST_CTL = APP_CONTEXT + "/ctl/CourseListCtl";
	public String SUBJECT_CTL = APP_CONTEXT + "/ctl/SubjectCtl";
	public String SUBJECT_LIST_CTL = APP_CONTEXT + "/ctl/SubjectListCtl";
	public String TIMETABLE_CTL = APP_CONTEXT + "/ctl/TimeTableCtl";
	public String TIMETABLE_LIST_CTL = APP_CONTEXT + "/ctl/TimeTableListCtl";
	public String ISSUE_CTL = APP_CONTEXT + "/ctl/IssueCtl";
	public String ISSUE_LIST_CTL = APP_CONTEXT + "/ctl/IssueListCtl";
	public String VEHICLE_TRACKING_CTL = APP_CONTEXT + "/ctl/VehicleTrackingCtl";
	public String VEHICLE_TRACKING_LIST_CTL = APP_CONTEXT + "/ctl/VehicleTrackingListCtl";
	public String DOCTOR_CTL = APP_CONTEXT + "/ctl/DoctorCtl";
	public String DOCTOR_LIST_CTL = APP_CONTEXT + "/ctl/DoctorListCtl";
	public String INVENTORY_CTL = APP_CONTEXT + "/ctl/InventoryCtl";
	public String INVENTORY_LIST_CTL = APP_CONTEXT + "/ctl/InventoryListCtl";
	public String ORDER_CTL = APP_CONTEXT + "/ctl/OrderCtl";
	public String ORDER_LIST_CTL = APP_CONTEXT + "/ctl/OrderListCtl";
	public String TRANSPORTATION_CTL = APP_CONTEXT + "/ctl/TransportationCtl";
	public String TRANSPORTATION_LIST_CTL = APP_CONTEXT + "/ctl/TransportationListCtl";
	public String SUPPLIER_CTL = APP_CONTEXT + "/ctl/SupplierCtl";
	public String SUPPLIER_LIST_CTL = APP_CONTEXT + "/ctl/SupplierListCtl";
	public String TRANSACTIONS_CTL = APP_CONTEXT + "/ctl/TransactionsCtl";
	public String TRANSACTIONS_LIST_CTL = APP_CONTEXT + "/ctl/TransactionsListCtl";
	public String ROUTE_CTL = APP_CONTEXT + "/ctl/RouteCtl";
	public String ROUTE_LIST_CTL = APP_CONTEXT + "/ctl/RouteListCtl";

	public String GET_MARKSHEET_CTL = APP_CONTEXT + "/ctl/GetMarksheetCtl";
	public String CHANGE_PASSWORD_CTL = APP_CONTEXT + "/ctl/ChangePasswordCtl";
	public String MY_PROFILE_CTL = APP_CONTEXT + "/ctl/MyProfileCtl";
	public String FORGET_PASSWORD_CTL = APP_CONTEXT + "/ForgetPasswordCtl";
	public String MARKSHEET_MERIT_LIST_CTL = APP_CONTEXT + "/ctl/MarksheetMeritListCtl";
}
