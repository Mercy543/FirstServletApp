import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GenericServletExample2 extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		// media type
		res.setContentType("text/html");
		// generate response
		PrintWriter outRes = res.getWriter();

		outRes.print("<html>");
		outRes.print("<body>");
		outRes.print("<h1> This is another request </h1>");
		outRes.print("<p> Not a protocol risticted request 2</p>");
		outRes.print("</body>");
		outRes.print("</html>");

	}

}
