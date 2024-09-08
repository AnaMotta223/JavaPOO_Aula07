package enumeradores;

public class TestaTurma {

	public static void main(String[] args) {
		Turma t = new Turma(123,PeriodoCurso.INTEGRAL);
		System.out.println("N° curso: " + t.getNumero());
		System.out.println("Dias: " + t.getPeriodoCurso().getDias());
		System.out.println("Carga horária: " + t.getPeriodoCurso().getCargaHoraria() + " horas");
		System.out.println("Valor: " + t.getPeriodoCurso().getValor() + " reais");

	}

}
