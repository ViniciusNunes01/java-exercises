package lista05_introducao_POO.ExercicioEstatico;

public class CurrencyConverter {

	public static final double IMPOSTO = 0.06;

	private double dollarPrice;
	private double dollarQuantity;
	private double emReais;

	public CurrencyConverter() {

	}

	public CurrencyConverter(double dollarPrice, double dollarQuantity) {
		this.dollarPrice = dollarPrice;
		this.dollarQuantity = dollarQuantity;
		this.emReais = (dollarPrice * dollarQuantity) + ((dollarPrice * dollarQuantity) * IMPOSTO);
	}

	public double getDollarPrice() {
		return dollarPrice;
	}

	public void setDollarPrice(double dollarPrice) {
		this.dollarPrice = dollarPrice;
	}

	public double getDollarQuantity() {
		return dollarQuantity;
	}

	public void setDollarQuantity(double dollarQuantity) {
		this.dollarQuantity = dollarQuantity;
	}

	public double getEmReais() {
		return emReais;
	}
}
