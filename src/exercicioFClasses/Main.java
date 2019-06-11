package exercicioFClasses;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CadastroDeContas nova = new CadastroDeContas();
		ContaCorrente conta = new ContaCorrente();
		
		System.out.println(nova.novaContaCorrente(conta));
		System.out.println(nova.getConta(1));
		
	}

}
