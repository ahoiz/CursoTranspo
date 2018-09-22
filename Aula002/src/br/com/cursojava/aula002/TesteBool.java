package br.com.cursojava.aula002;

public class TesteBool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String oi = null;
		Boolean oibool = Boolean.parseBoolean(oi);
		String oioi = Boolean.toString(oibool);
		System.out.println(oioi);
		
		boolean bool = false;
		
		if (bool == Boolean.valueOf(oibool)) {
			System.out.println("AE caraio");
		} else {
			System.out.println("Aff cara");
		}

	}

}
