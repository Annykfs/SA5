package AnnyServlet5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Servlet implementation class AnnyServlet5
 
@WebServlet("/AnnyServlet5")
public class AnnyServlet5 extends HttpServlet {

	private static final long serialVersionUID = 6415798494413702039L;

	public AnnyServlet5() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		PrintWriter out = response.getWriter();
		
		
		String nome = request.getParameter("nome");
		String senha = request.getParameter("senha");	
		String emailServidor = request.getParameter("email");
		String matriculaServidor = request.getParameter("matricula");
		String idadeServidor = request.getParameter("idade");
		
		Servidor servidor = new Servidor();
		Conversor conversor = new Conversor();
		Validador validador = new Validador();
		
		String emailS = validador.validaEmail(emailServidor);
		String idadeS = validador.validaIdade(idadeServidor);
		String matriculaS = validador.validaMatricula(matriculaServidor);
		
		if(emailS == null || idadeS == null || matriculaS == null)
			out.println("Há informações incoerentes.");
		
		String email = emailS;
		int idade = conversor.cInt(idadeS);
		long matricula = conversor.cLong(matriculaS);
		
		servidor.setNome(nome);
		servidor.setEmail(email);
		servidor.setSenha(senha);
		servidor.setMatricula(matricula);
		servidor.setIdade(idade);
		
		ArmazenaDado armazena = new ArmazenaDado();
		
		armazena.setNome( nome + " - " + matricula + " - " + idade + " anos" + " - " + email );	
		
		out.println("Servidor cadastrado com êxito!");	
	
	}

}
