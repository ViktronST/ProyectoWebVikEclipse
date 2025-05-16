package es.cursojava.web.servlets;

import java.io.IOException;

import es.cursojava.web.dto.CalculadoraDTO;
import es.cursojava.web.services.CalculadoraService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/calculadora")
public class CalculadoraServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Llamando al doGet");
		
		String numero1 = req.getParameter("num1");
		int number1 = req.getParameter("num1")!=null?Integer.parseInt(numero1):0;
		
		// int number1 = req.getParameter("num1")!=null?Integer.parseInt(req.getParameter("num1")):0;
		
		String numero2 = req.getParameter("num2");
		int number2 = req.getParameter("num2")!=null?Integer.parseInt(numero2):0;
		
		String operacion = req.getParameter("operacion");
		
		System.out.println("num1 " + numero1);
		System.out.println("num2 " + numero2);
		System.out.println("operacion " + operacion);
		
		CalculadoraDTO dto = new CalculadoraDTO(number1, number2, operacion);
		CalculadoraService service = new CalculadoraService();
		service.ejecutaOperacion2(dto);
		
		System.out.println(dto.getResultado());
		
		resp.sendRedirect("calculadoraServlet.jsp?mensaje=" + dto.getMensaje() + dto.getResultado());
		
//		if (numero1==null || numero2==null || operacion==null) {
//			resp.getWriter().append("<h1>ha habido un error</h1>");
//		} else {
//			int resultado = 0;
//			String mensaje = "";
//			switch(operacion) {
//			case "suma":
//                resultado = number1 + number2;
//                mensaje = "Resultado de la suma: " + resultado;
//                break;
//            case "resta":
//                resultado = number1 - number2;
//                mensaje = "Resultado de la resta: " + resultado;
//                break;
//            case "multiplica":
//                resultado = number1 * number2;
//                mensaje = "Resultado de la multiplicación: " + resultado;
//                break;
//            case "divide":
//                if (number2 == 0) {
//                    mensaje = "Error: División por cero";
//                } else {
//                    resultado = number1 / number2;
//                    mensaje = "Resultado de la división: " + resultado;
//                }
//                break;
//            default:
//                mensaje = "Operación no válida.";
//                break;
//			}
//			
//			resp.sendRedirect("calculadoraServlet.jsp?resultado=" + resultado);
			
//			resp.sendRedirect("prueba.jsp?repeticiones=" + number1);
			
//			resp.sendRedirect("calculadoraServlet.html");
			
//			resp.getWriter().append("El número es" + numero1);
//			System.out.println(numero1.toLowerCase());
//		}
	}


}
