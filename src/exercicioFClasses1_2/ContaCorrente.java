/*Exercícios de FixaçãoClasses
1.Crie uma classe ContaCorrente com os seguntes métodos:
 * a.void deposito(double valor)
 * b.double retirada(double valor)
 * c.double getSaldo()
 * d.int getNroConta()*/

package exercicioFClasses1_2;

public class ContaCorrente {
	
	private double saldo;
	private int nroConta;
	
	public ContaCorrente(double saldo, int nroConta){
		
		this.saldo = saldo;
		this.nroConta = nroConta;
		
	}
	public ContaCorrente(int nroConta){
		
		this.saldo = 0;
		this.nroConta = nroConta;
		
	}
	
	
	public void deposito(double valor) {
		saldo = saldo + valor;
	}
		
	public double retirada(double valor) {
		return (saldo - valor);
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNroConta() {
		return this.nroConta;
	}
	
	@Override
	public String toString() {
		return "ContaCorrente saldo = " + saldo + ", Número da conta = " + nroConta;
	}
	
	

	
}
