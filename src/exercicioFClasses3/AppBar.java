/*O dono de uma rede de bares da cidade nos encomendou um sistema em Java para rodar em tablets,
 * para controlar o acesso de clientes ao bar. O propriet�rio deseja que, ao entrar no bar,
 * cliente informe seu nome, cpf, idade e g�nero. A qualquer momento,
 * ele deseja ser capaz de consultar quem s�o as pessoas que est�o no bar,
 * se algu�m com um determinado CPF est� no bar, quantas s�o as pessoas 
 * e qual a distribui��o por g�nero (percentual de clientes masculinos e femininos).
 * Ao sair, o cliente deve informar seu CPF, para registrar sua sa�da.
 * Modele e implemente este sistema (defina classes, com seus atributos e m�todos)*/


package exercicioFClasses3;

public class AppBar {

	public static void main(String[] args) {
		
		Bar bar = new Bar();
		Cliente cliente = new Cliente("Let�cia", "02774156084", 22, 'F');
		bar.novoCliente(cliente);
		Cliente cliente1 = new Cliente("Ana", "01234567890", 18, 'F');
		bar.novoCliente(cliente1);
		Cliente cliente2 = new Cliente("Joao", "11111111111", 25, 'M');
		bar.novoCliente(cliente2);
		
		//Lista clientes no bar (CPF e nome)
		bar.consultaClientesBar();
		
		//Verifica se um cliente com determinado CPF esta no bar,
		//caso esteja: Exibe o cliente, 
		//caso n�o esteja: retorna mensagem "Cliente n�o est� no bar"
		System.out.println(bar.clienteNoBar("12354"));
		
		//Informa a quantidade de cliente no bar
		System.out.println(bar.quantClientes());
		
		//Informa a distribui��o por g�nero
		System.out.println(bar.percentualGenero());
		
		//Registra a sa�da do bar
		System.out.println(bar.saidaBar("02774156084"));
		
		
	}

}
