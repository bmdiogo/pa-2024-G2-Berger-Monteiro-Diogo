package pa.servlets;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import pa.peliculas.*;
@WebServlet(name="nombre1",urlPatterns="/servletMasVotos")
public class Servlet1 extends HttpServlet {
	public final static long serialversion=1L;
	public Servlet1(){
		super();
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
	ListadosPeliculas listado=new ListadosPeliculas();
	String[] masVotadas=listado.peliculasMasVotadas(listado.peliculasDisponibles());
	request.setAttribute("primera", masVotadas[0]);
	request.setAttribute("segunda", masVotadas[1]);
	request.setAttribute("tercera", masVotadas[2]);
	request.setAttribute("votadas", "más votadas");
	response.setContentType("text/html;charset=UTF-8");
	request.getRequestDispatcher("/WEB-INF/listadoPeliculas.jsp")
	.forward(request,response);
	}
	

}
