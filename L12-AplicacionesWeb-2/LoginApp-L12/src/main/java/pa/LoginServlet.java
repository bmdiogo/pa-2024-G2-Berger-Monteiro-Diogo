package pa;
import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servicioDeLogin") //mirar el login.html
public class LoginServlet extends HttpServlet {
	private static String usuario="Ricardo";
	private static String contraseña="password";
	private static final long serialVersionuID = 0;
	public LoginServlet() {
		super();
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String usuarioreq=req.getParameter("fname"); //campos del login.html
	
	String passreq=req.getParameter("contra");
	RequestDispatcher dispatcher;
	
	if ((usuarioreq.equals(usuario))&&(passreq.equals(contraseña))){
	 dispatcher=req.getRequestDispatcher("/welcome.jsp");
	 dispatcher.forward(req, resp);
	}
	else {
		dispatcher=req.getRequestDispatcher("examen.html");
		dispatcher.include(req, resp);
		resp.getWriter().println("<p style='color.red'>Falta el nombre o la contraseña</p>");
	}
	}
}
