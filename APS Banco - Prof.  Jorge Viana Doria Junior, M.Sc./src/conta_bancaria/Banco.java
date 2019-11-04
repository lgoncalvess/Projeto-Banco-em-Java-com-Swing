package model;
import java.util.List;

public class Banco {
	private List<ContaBancaria> contas;
	
	public void inserir(ContaBancaria objeto) {
		contas.add(objeto);
	}
	
	public void remover(long numConta) {
		for(ContaBancaria c : contas) {
			if(c.getNumeroConta() == numConta) {
				contas.remove(c);
				break;
			}
		}
	}
	
	public ContaBancaria procurarConta(long numConta) {
		for(ContaBancaria c : contas) {
			if(c.getNumeroConta() == numConta) {
				return c;
			}
		}
		return null;
	}
}
