package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.EmpresaProveedoraVO;
import ModeloDAO.EmpresaProveedoraDAO;

public final class registrarProveedor_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("z\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\t<title>Login Page</title>\n");
      out.write("   <!--Made with love by Mutiullah Samim -->\n");
      out.write("   \n");
      out.write("\t<!--Bootsrap 4 CDN-->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n");
      out.write("    \n");
      out.write("    <!--Fontawesome CDN-->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.3.1/css/all.css\" integrity=\"sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("\t<!--Custom styles-->\n");
      out.write("      \n");
      out.write("      <link href=\"Estilos/estilos2.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("</head>\n");
      out.write("  \n");
      out.write("<center>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div class=\"contenedor\">      \n");
      out.write("\n");
      out.write("        <center>\n");
      out.write("            <h1 class=\"titulo\">Registrar Empresas Proveedoras</h1>\n");
      out.write("        <form method=\"post\" action=\"EmpresaProveedora\">\n");
      out.write("            <table>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                   \n");
      out.write("                <div class=\"campos\">Nit Empresa</div>\n");
      out.write("                <input type=\"number\" name=\"txtNit\"><br><br>\n");
      out.write("                        \n");
      out.write("                    <div class=\"campos\"> Razon social Empresa </div>\n");
      out.write("                    \n");
      out.write("                    <input type=\"text\" name=\"txtRazon\"><br><br>\n");
      out.write("                    \n");
      out.write("                    <div class=\"campos\">Nombre Comercial Empresa</div>\n");
      out.write("                    \n");
      out.write("                <input type=\"text\" name=\"txtNombreC\"><br><br>\n");
      out.write("                    \n");
      out.write("                    <div class=\"campos\">Direccion De empresa</div>\n");
      out.write("                    \n");
      out.write("                    <input type=\"text\" name=\"txtDireccion\"><br><br>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                      <div class=\"campos\">Telefono Empresa</div>\n");
      out.write("                <input type=\"number\" name=\"txtTelefono\"><br><br>\n");
      out.write("                   \n");
      out.write("                <div class=\"campos\">Numero de pago</div>\n");
      out.write("                <input type=\"text\" name=\"txtNumero\"><br><br>\n");
      out.write("                \n");
      out.write("                <div class=\"campos\"> Estado del Provedor</div>\n");
      out.write("                     <select name=\"txtEstado\">\n");
      out.write("                        <option>Seleccione una opci??n</option>\n");
      out.write("                       <option>Activo</option>\n");
      out.write("                       <option>Inactivo</option>\n");
      out.write("                    </select> <br> <br>\n");
      out.write("                   \n");
      out.write("\n");
      out.write("                \n");
      out.write("                    </select> <br> <br>\n");
      out.write("\n");
      out.write("                   \n");
      out.write("\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                 </div>\n");
      out.write("                    \n");
      out.write("                \n");
      out.write("            </table><br>\n");
      out.write("                                         <div class=\"form-group\">\t\n");
      out.write("                                         <input type=\"hidden\" value=\"1\" name=\"opcion\" class=\"btn float-right login_btn\">\n");
      out.write("                                         <button type=\"submit\" class=\"btn float-right login_btn\" > Registrar Producto</button>\n");
      out.write("            \n");
      out.write("                                         \n");
      out.write("                                         <button type=\"submit\"  class=\"btn float-right login_btn\"> <a href=\"ConsultarProveedor.jsp\"> Ver Empresas registrados </a> </button>\n");
      out.write("                                         <button type=\"submit\"  class=\"btn float-right login_btn\"> <a href=\"Menu.jsp\"> Volver al men?? </a> </button>\n");
      out.write("                                        \n");
      out.write("                                        </div>\n");
      out.write("        </form>\n");
      out.write("                    <div class=\"tres\"> \n");
      out.write("                         \n");
      out.write("                                         ");
 
                                         if  (request.getAttribute("MensajeError") !=null) {
      out.write("\n");
      out.write("                                         ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("           \n");
      out.write("               \n");
      out.write("                                         ");
}else {
      out.write("\n");
      out.write("                                        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("  \n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        \n");
      out.write("                    </div>\n");
      out.write("      \n");
      out.write("        </center>\n");
      out.write("      \n");
      out.write("        </div>\n");
      out.write("      \n");
      out.write("    </body>\n");
      out.write("    </center>\n");
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
