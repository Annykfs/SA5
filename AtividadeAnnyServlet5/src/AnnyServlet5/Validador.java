package AnnyServlet5;

public class Validador {

	public String validaEmail(String email) {
		
		if(email.indexOf(".com") > 0 && email.indexOf("@") > 0) 
			return email;
		else
			return null;
		
	}
	
	public String validaMatricula(String matricula) {
		
		if(matricula.matches("\\d+"))
			return matricula;
		else
			return null;
		
	}
	
	public String validaIdade(String idade) {
		
		if(idade.matches("\\d+"))
			return idade;
		else
			return null;
		
	}
	
}
