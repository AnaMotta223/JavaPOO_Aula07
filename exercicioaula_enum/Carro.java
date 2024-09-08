package exercicioaula_enum;

import java.time.LocalDate;

public class Carro extends Veiculo{
	private String categoria;
	
	public Carro(String categoria, String modelo, LocalDate dataConserto, Proprietario proprietario) {
		super(modelo, dataConserto, proprietario);
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}


	public double lavarVeiculo() {
		return valorCobrado = valorCobrado + TipoServico.LAVAGEM.getValorPorServico();	
	}
	
	public double trocarOleo() {	
		if (dataConserto.getDayOfWeek().getValue() == 6) {
			System.out.println("Parabéns, você ganhou um desconto de 50 reais!");
			return valorCobrado = valorCobrado + TipoServico.OLEO.getValorPorServico() - 50;
		}
		else {
			return valorCobrado = valorCobrado + TipoServico.OLEO.getValorPorServico();	
		}
	}
	
	public double revisao(){
		if (dataConserto.getMonthValue() == 8) {
			System.out.println("Parabéns, você ganhou um desconto de 10% por fazer sua revisão em agosto!");
			return valorCobrado = valorCobrado + TipoServico.REVISAO.getValorPorServico() - 20;
		}
		else {
			return valorCobrado = valorCobrado + TipoServico.REVISAO.getValorPorServico();
		}
	}
	
}
