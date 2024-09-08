package exercicioaula_enum;

import java.time.LocalDate;

public class TesteOficina {
	public static void main(String[] args) {
		Proprietario p1 = new Proprietario("fulano");
		Carro carro = new Carro("x","xyz",LocalDate.of(2024,8,03),p1);
		carro.trocarOleo();
		carro.revisao();
		
		System.out.println(carro.toString());
		
	}
}
