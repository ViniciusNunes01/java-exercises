package exercicio_classe_abstrata.entities;

public class PessoaFisica extends Pessoa {

	private Double gastosSaude;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public Double imposto() {

		Double valor = 0.0;

		if (getRendaAnual() < 20000.00) {
			valor = getRendaAnual() * 0.15 - gastosSaude * 0.50;
		} else {
			valor = getRendaAnual() * 0.25 - gastosSaude * 0.50;
		}

		return valor;
	}

}
