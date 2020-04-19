package pak;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloWorld implements Servlet {

	
	ServletConfig servletConfig=null;
	@Override
	public void destroy() {
		
      
	}

	@Override
	public ServletConfig getServletConfig() {
		
		return servletConfig;
	}

	@Override
	public String getServletInfo() {
		
		return null;
	}

	@Override
	public void init(ServletConfig servletConfig) throws ServletException {
	 this.servletConfig=servletConfig;
	}

	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		//response.setLocale(Locale.CANADA);
		PrintWriter pw=response.getWriter();
		ServletContext servletContext=servletConfig.getServletContext();
		System.out.println(servletContext.getInitParameter("userName"));	
		pw.println("<HTML><HEAD><TITLE>Hello World</TITLE></HEAD>");
		pw.println("<BODY BGCOLOR=PINK><HR COLOR=RED>");
		pw.println("<CENTER><H1>Welcome To Servlet World</H1></CENTER>");
		pw.println("<FORM ACTION=submitAction METHOD=POST >");
		pw.println("<INPUT TYPE=TEXTFIELD NAME=userName>");
		pw.println("<INPUT TYPE=SUBMIT VALUE=Submit>");
		pw.println("<HR COLOR=BLUE>");
		pw.println("</BODY></HTML>");
	}

}
