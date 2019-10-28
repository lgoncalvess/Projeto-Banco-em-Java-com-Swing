package conta_bancaria;

public class ContaCorrente extends ContaBancaria{
	private double taxaDeOperacao;

	public double getTaxaDeOperacao() {return taxaDeOperacao;}
	public void setTaxaDeOperacao(double taxaDeOperacao) {this.taxaDeOperacao = taxaDeOperacao;}
	
	public ContaCorrente(double taxaDeOp, long numConta, double saldo) {
		super(numConta,saldo);
		this.taxaDeOperacao = taxaDeOp;
	}
	
	public void sacar(double valor) {
		this.setSaldo(this.getSaldo() - valor - this.taxaDeOperacao);
	}
	
	public void depositar(double valor) {
		this.setSaldo((this.getSaldo() + valor) - this.taxaDeOperacao);
	}
}
