package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ListIterator;
import java.util.List;
import dao.admin_operation;
import bean.restaurant;

public final class manager_002dregister_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Book Your Table</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta name=\"keywords\" content=\"Glance Design Dashboard Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("              SmartPhone Compatible web template, free WebDesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap Core CSS -->\n");
      out.write("        <link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' />\n");
      out.write("\n");
      out.write("        <!-- Custom CSS -->\n");
      out.write("        <link href=\"css/style.css\" rel='stylesheet' type='text/css' />\n");
      out.write("\n");
      out.write("        <!-- font-awesome icons CSS -->\n");
      out.write("        <link href=\"css/font-awesome.css\" rel=\"stylesheet\"> \n");
      out.write("        <!-- //font-awesome icons CSS -->\n");
      out.write("\n");
      out.write("        <!-- side nav css file -->\n");
      out.write("        <link href='css/SidebarNav.min.css' media='all' rel='stylesheet' type='text/css'/>\n");
      out.write("        <!-- side nav css file -->\n");
      out.write("\n");
      out.write("        <!-- js-->\n");
      out.write("        <script src=\"js/jquery-1.11.1.min.js\"></script>\n");
      out.write("        <script src=\"js/modernizr.custom.js\"></script>\n");
      out.write("\n");
      out.write("        <!--webfonts-->\n");
      out.write("        <link href=\"//fonts.googleapis.com/css?family=PT+Sans:400,400i,700,700i&amp;subset=cyrillic,cyrillic-ext,latin-ext\" rel=\"stylesheet\">\n");
      out.write("        <!--//webfonts--> \n");
      out.write("\n");
      out.write("        <!-- Metis Menu -->\n");
      out.write("        <script src=\"js/metisMenu.min.js\"></script>\n");
      out.write("        <script src=\"js/custom.js\"></script>\n");
      out.write("        <link href=\"css/custom.css\" rel=\"stylesheet\">\n");
      out.write("        <!--//Metis Menu -->\n");
      out.write("        <style>\n");
      out.write("            .cbp-spmenu-push div#page-wrapper {\n");
      out.write("                margin: 0 0 0 0px;\n");
      out.write("                transition: .5s all;\n");
      out.write("                -webkit-transition: .5s all;\n");
      out.write("                -moz-transition: .5s all;\n");
      out.write("            }\n");
      out.write("            .element-style\n");
      out.write("            {\n");
      out.write("                height:-webkit-fill-available;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head> \n");
      out.write("    <body class=\"cbp-spmenu-push\">\n");
      out.write("        <div class=\"main-content\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- main content start-->\n");
      out.write("            <div id=\"page-wrapper\" style=\"height:-webkit-fill-available;\">\n");
      out.write("                <div class=\"main-page signup-page\">\n");
      out.write("                    <h2 class=\"title1\">SignUp Here</h2>\n");
      out.write("                    <div class=\"sign-up-row widget-shadow\">\n");
      out.write("\n");
      out.write("                        <form action=\"managerRegisterController\" method=\"post\">\n");
      out.write("                            <div class=\"sign-u\">\n");
      out.write("                                <input type=\"text\" name=\"manager_name\" placeholder=\"Name\" required=\"\">\n");
      out.write("                                <div class=\"clearfix\"> </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"sign-u\">\n");
      out.write("                                <input type=\"email\" name=\"manager_email\" placeholder=\"Email Address\" required=\"\">\n");
      out.write("                                <div class=\"clearfix\"> </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"sign-u\">\n");
      out.write("                                <input type=\"password\" name=\"manager_password\" placeholder=\"Password\" required=\"\">\n");
      out.write("                                <div class=\"clearfix\"> </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"sign-u\">\n");
      out.write("                                <select class=\"form-control\" name=\"restaurant\" placeholder=\"restaurant\">\n");
      out.write("                                    <option>Select Your Restaurant</option>\n");
      out.write("                                    ");

                                        restaurant resObj;
                                        admin_operation adObj=new admin_operation();
                                        List li=adObj.selectAllRestaurant();
                                        ListIterator lit=li.listIterator();
                                        while(lit.hasNext())
                                        {
                                            resObj=(restaurant)lit.next();
                                    
      out.write("\n");
      out.write("                                    <option value=\"");
      out.print( resObj.getRestaurant_id() );
      out.write('"');
      out.write('>');
      out.print( resObj.getRestaurant_name() );
      out.write("</option>\n");
      out.write("                                    ");

                                        }
                                    
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                                <div class=\"clearfix\"> </div>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"clearfix\"> </div>\n");
      out.write("                            <div class=\"sub_home\">\n");
      out.write("                                <input type=\"submit\" value=\"Register\">\n");
      out.write("                                <div class=\"clearfix\"> </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"registration\">\n");
      out.write("                                Already Registered.\n");
      out.write("                                <a class=\"\" href=\"manager-login.jsp\">\n");
      out.write("                                    Login\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- side nav js -->\n");
      out.write("        <script src='js/SidebarNav.min.js' type='text/javascript'></script>\n");
      out.write("        <script>\n");
      out.write("            $('.sidebar-menu').SidebarNav()\n");
      out.write("        </script>\n");
      out.write("        <!-- //side nav js -->\n");
      out.write("\n");
      out.write("        <!-- Classie --><!-- for toggle left push menu script -->\n");
      out.write("        <script src=\"js/classie.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            var menuLeft = document.getElementById('cbp-spmenu-s1'),\n");
      out.write("                    showLeftPush = document.getElementById('showLeftPush'),\n");
      out.write("                    body = document.body;\n");
      out.write("\n");
      out.write("            showLeftPush.onclick = function () {\n");
      out.write("                classie.toggle(this, 'active');\n");
      out.write("                classie.toggle(body, 'cbp-spmenu-push-toright');\n");
      out.write("                classie.toggle(menuLeft, 'cbp-spmenu-open');\n");
      out.write("                disableOther('showLeftPush');\n");
      out.write("            };\n");
      out.write("\n");
      out.write("            function disableOther(button) {\n");
      out.write("                if (button !== 'showLeftPush') {\n");
      out.write("                    classie.toggle(showLeftPush, 'disabled');\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <!-- //Classie --><!-- //for toggle left push menu script -->\n");
      out.write("\n");
      out.write("        <!--scrolling js-->\n");
      out.write("        <script src=\"js/jquery.nicescroll.js\"></script>\n");
      out.write("        <script src=\"js/scripts.js\"></script>\n");
      out.write("        <!--//scrolling js-->\n");
      out.write("\n");
      out.write("        <!-- Bootstrap Core JavaScript -->\n");
      out.write("        <script src=\"js/bootstrap.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
