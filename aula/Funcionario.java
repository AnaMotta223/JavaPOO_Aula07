package aula;

public class Funcionario {
	private EstadoCivil estadocivil; //cria uma variavel estadocivil do tipo enum
	private String nome;
	
	//enum so vai ser visivel para essa classe
	enum EstadoCivil{
		CASADO('C'),SOLTEIRO('S'),VIUVO('V'),DIVORCIADO('D');
		
		private char valor;

		private EstadoCivil(char valor) {
			this.valor = valor;
		}

		public char getValor() {
			return valor;
		}

		public void setValor(char valor) {
			this.valor = valor;
		}
		
	}

	public Funcionario(String nome, EstadoCivil estadocivil) {
		super();
		this.estadocivil = estadocivil;
		this.nome = nome;
	}

	public EstadoCivil getEstadocivil() {
		return estadocivil;
	}

	public void setEstadocivil(EstadoCivil estadocivil) {
		this.estadocivil = estadocivil;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
}
