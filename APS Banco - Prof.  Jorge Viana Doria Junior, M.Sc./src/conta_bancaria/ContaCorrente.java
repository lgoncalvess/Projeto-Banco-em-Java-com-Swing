package model;

public class ContaCorrente extends ContaBancaria implements Imprimivel{
	private double taxaDeOperacao;

	public double getTaxaDeOperacao() {return taxaDeOperacao;}
	public void setTaxaDeOperacao(double taxaDeOperacao) {this.taxaDeOperacao = taxaDeOperacao;}
	
	public ContaCorrente(double taxaDeOp, long numConta, double saldo) {
		super(numConta,saldo);
		this.taxaDeOperacao = taxaDeOp;
	}
	
	public void sacar(double valor) {
		if((valor + getTaxaDeOperacao()) <= this.getSaldo()) {
			this.setSaldo(this.getSaldo() - valor - getTaxaDeOperacao());
		}else {
			//lançar uma exceção
		}
	}
	
	public void depositar(double valor) {
		this.setSaldo((this.getSaldo() + valor) - this.taxaDeOperacao);
	}
	
	public void mostrarDados() {
		System.out.println("Saldo: " + this.getSaldo() + "\nNumero da Conta: " + this.getNumeroConta() + "\nTaxa de Operação: " + this.getTaxaDeOperacao());	
	}
}
