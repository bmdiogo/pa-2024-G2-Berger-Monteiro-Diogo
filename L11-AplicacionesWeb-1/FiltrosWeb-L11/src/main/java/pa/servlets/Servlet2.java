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
@WebServlet(name="nombre2",urlPatterns="/servletMenosVotos")
public class Servlet2 extends HttpServlet {
	public final static long serialversion=1L;
	public Servlet2(){
		super();
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
	ListadosPeliculas listado=new ListadosPeliculas();
	String[] menosVotadas=listado.peliculasMenosVotadas(listado.peliculasDisponibles());
	request.setAttribute("primera", menosVotadas[0]);
	request.setAttribute("segunda", menosVotadas[1]);
	request.setAttribute("tercera", menosVotadas[2]);
	request.setAttribute("votadas", "menos votadas");
	response.setContentType("text/html;charset=UTF-8");
	request.getRequestDispatcher("/WEB-INF/listadoPeliculas.jsp")
	.forward(request,response);
	}
	
}

 


