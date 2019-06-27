package AnnyServlet5;

public class Conversor {
	
	public Integer cInt(String valorString) {
		
		int valorInt = Integer.parseInt(valorString);
		
		return valorInt;
	}

	public Long cLong(String valorString) {
		
		long valorLong = Long.parseLong(valorString);
		
		return valorLong;
	}
}
