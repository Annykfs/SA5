package AnnyServlet5;

import java.util.ArrayList;
import java.util.List;

public class ArmazenaDado {
	
	private static List<String> listaServidores = new ArrayList<String>();
	
	public void setNome(String nome) {
		ArmazenaDado.listaServidores.add(nome);
	}
	
	public List<String> getNome(){
		return ArmazenaDado.listaServidores;
}
	
	
}
