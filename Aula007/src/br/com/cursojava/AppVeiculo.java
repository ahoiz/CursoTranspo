package br.com.cursojava;

public class AppVeiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Veiculo v1 = new Veiculo();
		v1.setMarca("Honda");
		v1.setModelo("Civic");
		v1.setId(1);
		v1.setAnoFabricacao(2018);
		v1.setAnoModelo(2019);
		System.out.println(v1.toString());
		System.out.println(v1); // mesmo sem toString ele chama o metodo

		Veiculo v2 = new Veiculo();
		v2.setMarca("Honda");
		v2.setModelo("Civic");
		v2.setId(1);
		v2.setAnoFabricacao(2018);
		v2.setAnoModelo(2019);
		System.out.println(v1.equals(v2));
		
		System.out.println(v1.hashCode());

	}

}
