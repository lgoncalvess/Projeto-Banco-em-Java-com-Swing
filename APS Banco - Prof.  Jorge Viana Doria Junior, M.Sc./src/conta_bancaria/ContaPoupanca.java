package model;

public class ContaPoupanca extends ContaBancaria implements Imprimivel{

	private double limite;
	
	public double getLimite() {return limite;}
	public void setLimite(double limite) {this.limite = limite;}
	
	public ContaPoupanca(long numConta, double saldo, double limite) {
		super(numConta,saldo);
		this.limite = limite;
	}
	
	public void sacar(double valor) {
		if((valor + this.getSaldo()) <= limite) {
			this.setSaldo(this.getSaldo() - valor);
		}else {
			//lançar exceção
		}
	}
	
	public void depositar(double valor) {
		this.setSaldo(this.getSaldo() + valor);
	}
	
	public void mostrarDados() {
		System.out.println("Saldo: " + this.getSaldo() + "\nNumero da Conta: " + this.getNumeroConta() + "\nLimite: " + this.getLimite());
	}
	
}
