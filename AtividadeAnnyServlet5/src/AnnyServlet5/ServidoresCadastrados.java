package AnnyServlet5;

import java.util.List;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servidoresCadastrados")
public class ServidoresCadastrados extends HttpServlet {
   
	private static final long serialVersionUID = -1276302826103737020L;


	public ServidoresCadastrados() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
		ArmazenaDado armazena = new ArmazenaDado();
		PrintWriter out = response.getWriter();
		
		List<String> listaServidores = armazena.getNome();
	
		if(listaServidores == null)
			out.println("Não existem dados para serem exibidos.");
		else {
			out.println(listaServidores);
			
		}
		
	}

}
