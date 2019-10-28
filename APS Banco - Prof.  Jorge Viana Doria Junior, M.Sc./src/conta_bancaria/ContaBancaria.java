package conta_bancaria;

public abstract class ContaBancaria {
	private long numeroConta;
	private double saldo;

	public ContaBancaria(long numeroConta, double saldo) {
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	
	//Getters and Setters
	public long getNumeroConta() {return numeroConta;}
	public void setNumeroConta(long numeroConta) {this.numeroConta = numeroConta;}
	public double getSaldo() {return saldo;}
	public void setSaldo(double saldo) {this.saldo = saldo;}
	
	//abstract methods
	public abstract void sacar(double valor);
	public abstract void depositar(double valor);
}
