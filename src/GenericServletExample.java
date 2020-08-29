import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GenericServletExample extends GenericServlet {

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException{
		
		// media type
		response.setContentType("text/html");		
		// generate response
		PrintWriter outRes = response.getWriter();
		
		outRes.print("<html>");
		outRes.print("<body>");		
		outRes.print("<h1> Hello , Generic Servlet Example </h1>");		
		outRes.print("<p> Not a protocol risticted request</p>");
		outRes.print("</body>");
		outRes.print("</html>");		
		
	}
}
