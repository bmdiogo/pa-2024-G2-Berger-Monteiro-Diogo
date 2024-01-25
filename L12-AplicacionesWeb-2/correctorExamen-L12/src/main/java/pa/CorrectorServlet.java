package pa;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name="Examen",urlPatterns="/correctorExamen")
public class CorrectorServlet extends HttpServlet {
	CorrectorServlet(){
		super();
	}
	
	private static final long serialversion=1L;
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		response.setContentType("text/html");
		
		String name=request.getParameter("user_name");
		String dni=request.getParameter("user_dni");
		 if (name == null || dni == null || name.trim().isEmpty() || dni.trim().isEmpty()) {
	            // Si falta el nombre o el DNI, redirige a examen.html con un mensaje
	            response.sendRedirect("examen.html?mensaje=Debes rellenar tus datos");
	            return;
	        }

	        // Obtén respuestas del usuario
	        String[] respuestasUsuario = new String[10];
	        for (int i = 1; i <= 10; i++) {
	            respuestasUsuario[i - 1] = request.getParameter("pregunta" + i);
	        }

	        // Respuestas correctas
	        String[] respuestasCorrectas = {"c", "a", "d", "d", "a", "b", "b", "c", "a", "c"};

	        // Evaluar el examen
	        double notaFinal = 0;
	        for (int i = 0; i < respuestasCorrectas.length; i++) {
	            if (respuestasCorrectas[i].equalsIgnoreCase(respuestasUsuario[i])) {
	                notaFinal += 1;
	            } else if (respuestasUsuario[i] != null && !respuestasUsuario[i].trim().isEmpty()) {
	                notaFinal -= 0.3;
	            }
	        }

	        // Mensaje según la puntuación
	        String mensaje;
	        if (notaFinal >= 5) {
	            mensaje = "Enhorabuena, has aprobado";
	       
	}
	
	

}
}
