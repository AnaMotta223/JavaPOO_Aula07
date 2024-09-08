package aula;

import aula.Funcionario.EstadoCivil;

public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario f = new Funcionario("Carla",EstadoCivil.CASADO);
		System.out.println("Nome: " + f.getNome() + " " + "\nEstado Civil: " + f.getEstadocivil());

	}
	
	
	
}
