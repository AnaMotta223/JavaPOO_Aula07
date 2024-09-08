package enumeradores;

//classe final imutavel
//nao pode ter filhos
public class Escola {
	private String cnpj;
	private String razaoSocial;
	
	public Escola(String cnpj, String razaoSocial) {
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}
	
	//final nao permite o override
	public final void gerarRelatorio() {
		System.out.println("Relatório!");
	}
}
