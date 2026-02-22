package exercicio_banco;

public class Account {

	private int numeroConta;
	private String titularConta;
	private double saldo;
	private double depositoInicial;

	public Account(int numeroConta, String titularConta, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.titularConta = titularConta;
		deposit(depositoInicial);
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getTitularConta() {
		return titularConta;
	}

	public void setTitularConta(String titularConta) {
		this.titularConta = titularConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getDepositoInicial() {
		return depositoInicial;
	}

	public void setDepositoInicial(double depositoInicial) {
		this.depositoInicial = depositoInicial;
	}

	public void deposit(double money) {
		this.saldo += money;
	}

	public void withdraw(double money) {
		this.saldo -= money + 5.00;
	}

	@Override
	public String toString() {
		return "Account " + numeroConta + ", Holder: " + titularConta + ", Balance: $" + saldo;
	}

}
