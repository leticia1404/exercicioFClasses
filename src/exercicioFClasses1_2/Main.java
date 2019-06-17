package exercicioFClasses1_2;

public class Main {

	public static void main(String[] args) {
		
		CadastroDeContas nova = new CadastroDeContas();
		ContaCorrente conta = new ContaCorrente(200,1);
		
		ContaCorrente conta1= new ContaCorrente(100,2);
		
		System.out.println(nova.novaContaCorrente(conta));
		System.out.println(nova.getConta(1));

		System.out.println(nova.novaContaCorrente(conta1));
		System.out.println(nova.getConta(2));
		
		System.out.println(nova.getSaldoTotal());
		System.out.println(nova.qtdContas(200));
		
	}

}
