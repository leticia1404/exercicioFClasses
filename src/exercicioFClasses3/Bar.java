/*O dono de uma rede de bares da cidade nos encomendou um sistema em Java para rodar em tablets,
 * para controlar o acesso de clientes ao bar. O proprietário deseja que, ao entrar no bar,
 * cliente informe seu nome, cpf, idade e gênero. A qualquer momento,
 * ele deseja ser capaz de consultar quem são as pessoas que estão no bar,
 * se alguém com um determinado CPF está no bar, quantas são as pessoas 
 * e qual a distribuição por gênero (percentual de clientes masculinos e femininos).
 * Ao sair, o cliente deve informar seu CPF, para registrar sua saída. 
 * Modele e implemente este sistema (defina classes, com seus atributos e métodos)*/

package exercicioFClasses3;

import java.util.HashMap;
import java.util.Set;

public class Bar {
	
	private HashMap <String,Cliente> bar = new HashMap<String,Cliente>();

	public HashMap <String,Cliente> getBar() {
		return bar;
	}

	public void novoCliente(Cliente cliente) {
		bar.put(cliente.getCpf(),cliente);		
	}
	public void setBar(HashMap <String,Cliente> bar) {
		this.bar = bar;
	}
	
	public void consultaClientesBar(){
		Set<String> aux = bar.keySet();
		for (String s : aux) {
			System.out.println("CPF: "+bar.get(s).getCpf()+"/nNome: "+bar.get(s).getNome());
		}
		
	}
	
	public String clienteNoBar(String cpf) {
		if(bar.containsKey(cpf)) {
			return bar.get(cpf).exibeCliente();
		}else {
			return "Cliente não esta no bar";
		}
		
	}
	
	public int quantClientes(){
		return bar.size();
	}
	
	//terminar
	public void percentualGenero() {
		Set<String> aux = bar.keySet();
		char gen;
		int percF = 0;
		int percM = 0;
		for (String s : aux) {
			gen = bar.get(s).getGenero();
			if(gen == 'F') {
				percF++;
			}else {
				percM++;
			}
	
		}
		
		
	}
	
	
	
	
}
