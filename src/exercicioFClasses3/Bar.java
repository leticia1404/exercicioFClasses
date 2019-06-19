/*O dono de uma rede de bares da cidade nos encomendou um sistema em Java para rodar em tablets,
 * para controlar o acesso de clientes ao bar. O propriet�rio deseja que, ao entrar no bar,
 * cliente informe seu nome, cpf, idade e g�nero. A qualquer momento,
 * ele deseja ser capaz de consultar quem s�o as pessoas que est�o no bar,
 * se algu�m com um determinado CPF est� no bar, quantas s�o as pessoas 
 * e qual a distribui��o por g�nero (percentual de clientes masculinos e femininos).
 * Ao sair, o cliente deve informar seu CPF, para registrar sua sa�da. 
 * Modele e implemente este sistema (defina classes, com seus atributos e m�todos)*/

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
	
	//Lista clientes no bar (CPF e nome)
	public void consultaClientesBar(){
		Set<String> aux = bar.keySet();
		for (String s : aux) {
			System.out.println("\nNome: "+bar.get(s).getNome()+"\nCPF: "+bar.get(s).getCpf());
		}
		
	}
	
	//Verifica se um cliente com determinado CPF esta no bar,
	//caso esteja: Exibe o cliente, 
	//caso n�o esteja: retorna mensagem "Cliente n�o est� no bar"
	public String clienteNoBar(String cpf) {
		if(bar.containsKey(cpf)) {
			return bar.get(cpf).exibeCliente();
		}else {
			return "Cliente n�o esta no bar";
		}
		
	}
	
	//Informa a quantidade de cliente no bar
	public int quantClientes(){
		return bar.size();
	}
	
	//Informa a distribui��o por g�nero
	public String percentualGenero() {
		Set<String> aux = bar.keySet();
		char gen;
		int f = 0, m = 0;
		double percF, percM;
		
		for (String s : aux) {
			gen = bar.get(s).getGenero();
			if(gen == 'F') {
				f++;
			}else {
				m++;
			}	
		}
		percF = (f*100)/bar.size();
		percM = (m*100)/bar.size();
		
		return "Percentual de clientes do gen�ro feminino: "+percF
				+"\nPercentual de clientes do gen�ro feminino: "+percM;
		
	}
	
	//Remove um cliente do bar
	public String saidaBar(String cpf) {
		if(bar.containsKey(cpf)) {
			bar.remove(cpf);
		}
		return "Sa�da registrada com sucesso!";
	}
	
	
	
	
}
