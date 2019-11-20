package Model;
import java.util.List;
import java.util.ArrayList;

public class Banco {
	private List<ContaBancaria> contas = new ArrayList<ContaBancaria>();
	
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