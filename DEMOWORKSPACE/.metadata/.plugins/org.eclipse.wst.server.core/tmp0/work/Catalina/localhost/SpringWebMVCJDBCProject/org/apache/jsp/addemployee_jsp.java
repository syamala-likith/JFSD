/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.26
 * Generated at: 2023-09-29 09:00:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addemployee_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/D:/3rd%20year/JFSD/DEMOWORKSPACE/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/SpringWebMVCJDBCProject/WEB-INF/lib/jstl-1.2.jar!/META-INF/c-1_0.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1693150884989L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Add Employee</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("body\r\n");
      out.write("{\r\n");
      out.write("\tbackground-color: lightgrey;\r\n");
      out.write("}\r\n");
      out.write(".button {\r\n");
      out.write("  background-color: black;\r\n");
      out.write("  border: none;\r\n");
      out.write("  color: white;\r\n");
      out.write("  padding: 15px 32px;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("  display: inline-block;\r\n");
      out.write("  font-size: 16px;\r\n");
      out.write("  margin: 4px 2px;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=text],input[type=password],input[type=number],input[type=email],\r\n");
      out.write("select,input[type=date]\r\n");
      out.write("{\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  padding: 12px 20px;\r\n");
      out.write("  margin: 8px 0;\r\n");
      out.write("  display: inline-block;\r\n");
      out.write("  border: 1px solid #ccc;\r\n");
      out.write("  border-radius: 4px;\r\n");
      out.write("  box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("label \r\n");
      out.write("{\r\n");
      out.write("  padding: 12px 12px 12px 0;\r\n");
      out.write("  display: inline-block;\r\n");
      out.write("  font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h2 align=center>Spring Web MVC CRUD Operation with JDBC</h2><br>\r\n");
      out.write("<a href=\"home\">Home</a>&nbsp;&nbsp;&nbsp;\r\n");
      out.write("<a href=\"addemp\">Add Employee</a>&nbsp;&nbsp;&nbsp;\r\n");
      out.write("<a href=\"viewallemps\">View All Employees</a>&nbsp;&nbsp;&nbsp;\r\n");
      out.write("<a href=\"updateemp\">Update Employee</a>&nbsp;&nbsp;&nbsp;\r\n");
      out.write("<a href=\"deleteemp\">Delete Employee</a>&nbsp;&nbsp;&nbsp;\r\n");
      out.write("<br><br>\r\n");
      out.write("\r\n");
      out.write("<form method=\"post\"  action=\"insertemp\">\r\n");
      out.write("\r\n");
      out.write("<table align=center>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td><label>ID</label></td>\r\n");
      out.write("<td><input type=\"number\" name=\"id\" required></td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr><td></td></tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td><label>Name</label></td>\r\n");
      out.write("<td><input type=\"text\" name=\"name\" required></td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr><td></td></tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td><label>Gender</label></td>\r\n");
      out.write("<td>\r\n");
      out.write("<input type=\"radio\" name=\"gender\" value=\"male\" required>MALE\r\n");
      out.write("<input type=\"radio\" name=\"gender\" value=\"female\" required>FEMALE\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr><td></td></tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td><label>Department</label></td>\r\n");
      out.write("<td>\r\n");
      out.write("<select name=\"dept\" required>\r\n");
      out.write("<option value=\"\">---Select---</option>\r\n");
      out.write("<option value=\"Development\">Development</option>\r\n");
      out.write("<option value=\"Testing\">Testing</option>\r\n");
      out.write("<option value=\"Design\">Design</option>\r\n");
      out.write("</select>\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr><td></td></tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td><label>Salary</label></label></td>\r\n");
      out.write("<td><input type=\"number\" name=\"salary\"  step=\"0.01\"  required></td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr><td></td></tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td><label>Location</label></td>\r\n");
      out.write("<td><input type=\"text\" name=\"location\" required></td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr><td></td></tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td><label>Contact No</label></td>\r\n");
      out.write("<td><input type=\"number\" name=\"contactno\" required></td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr><td></td></tr>\r\n");
      out.write("<tr><td></td></tr>\r\n");
      out.write("\r\n");
      out.write("<tr align=center>\r\n");
      out.write("<td><input type=\"submit\" value=\"Add\" class=\"button\"></td>\r\n");
      out.write("<td><input type=\"submit\" value=\"Clear\" class=\"button\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
