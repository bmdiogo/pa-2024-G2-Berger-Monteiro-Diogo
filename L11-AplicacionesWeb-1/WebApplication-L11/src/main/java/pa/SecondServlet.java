package pa;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet(name="miServlet2",urlPatterns="/UrlServlet2")
public class SecondServlet extends HttpServlet {
	private static final long serialVersion=1L;
	public SecondServlet() {
		super();
	}
	@Override
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.getRequestDispatcher("/WEB-INF/consultarHorarios.html")
		.forward(request,response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException  { 
		response.setContentType("text/html;charset=UTF-8");
		String asignaturaElegida = request.getParameter("asignatura");
		if (asignaturaElegida=="PA") {
			request.getRequestDispatcher("/WEB-INF/horarioPA.html").forward(request,response);
		}
		else {
			request.getRequestDispatcher("/WEB-INF/errorHorarios.html")
			.forward(request,response);
		}
	}
	
}
