import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MySearcher extends HttpServlet {
	static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		response.sendRedirect("https://www.facebook.com/#q=" + name);
	}
}//q=hello&oq=hello&aqs=chrome..69i57j69i61l2j0l3.986j0j7&sourceid=chrome&ie=UTF-8
//http://localhost:9998/MySearcher?name=hello
