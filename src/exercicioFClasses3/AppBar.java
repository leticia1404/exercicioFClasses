/*O dono de uma rede de bares da cidade nos encomendou um sistema em Java para rodar em tablets,
 * para controlar o acesso de clientes ao bar. O proprietário deseja que, ao entrar no bar,
 * cliente informe seu nome, cpf, idade e gênero. A qualquer momento,
 * ele deseja ser capaz de consultar quem são as pessoas que estão no bar,
 * se alguém com um determinado CPF está no bar, quantas são as pessoas 
 * e qual a distribuição por gênero (percentual de clientes masculinos e femininos).
 * Ao sair, o cliente deve informar seu CPF, para registrar sua saída.
 * Modele e implemente este sistema (defina classes, com seus atributos e métodos)*/


package exercicioFClasses3;

public class AppBar {

	public static void main(String[] args) {
		
		Bar bar = new Bar();
		Cliente cliente = new Cliente("Letícia", "02774156084", 22, 'F');
		bar.novoCliente(cliente);
		Cliente cliente1 = new Cliente("Ana", "01234567890", 18, 'F');
		bar.novoCliente(cliente1);
		Cliente cliente2 = new Cliente("Joao", "11111111111", 25, 'M');
		bar.novoCliente(cliente2);
		
		//Lista clientes no bar (CPF e nome)
		bar.consultaClientesBar();
		
		//Verifica se um cliente com determinado CPF esta no bar,
		//caso esteja: Exibe o cliente, 
		//caso não esteja: retorna mensagem "Cliente não está no bar"
		System.out.println(bar.clienteNoBar("12354"));
		
		//Informa a quantidade de cliente no bar
		System.out.println(bar.quantClientes());
		
		//Informa a distribuição por gênero
		System.out.println(bar.percentualGenero());
		
		//Registra a saída do bar
		System.out.println(bar.saidaBar("02774156084"));
		
		
	}

}
