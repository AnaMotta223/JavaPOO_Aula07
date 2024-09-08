package exercicioaula_enum;

import java.time.LocalDate;

public class Moto extends Veiculo{
	private int cilindradas;
	
	public Moto(String modelo, LocalDate dataConserto, Proprietario proprietario, int cilindradas) {
		super(modelo, dataConserto, proprietario);
		this.cilindradas = cilindradas;
	}

	public double lavarVeiculo() {
		return valorCobrado = valorCobrado + TipoServico.LAVAGEM.getValorPorServico();
	}
	
	public double trocarOleo() {
		return valorCobrado = valorCobrado + TipoServico.OLEO.getValorPorServico();
	}
	
	public double revisao(){
		return valorCobrado = valorCobrado + TipoServico.REVISAO.getValorPorServico();
	}
}
