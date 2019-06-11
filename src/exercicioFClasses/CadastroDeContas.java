/*2.Crie uma classe CadastroDeContas com os seguintes métodos:
 * a.boolean novaContaCorrente(ContaCorrente c)-> acrescenta a nova conta c no cadastro. 
 * Retorna true se a operação foi bem-sucedida, false caso contrário;
 * b.ContaCorrente getConta(int nroCta)-> retorno a conta corrente de número nroConta,
 * null caso a conta não exista;
 * c.double  getSaldoTotal()-> retorna a soma dos saldos de todas as contas cadastradas;
 * d.int  qtdContas(double  noMinimo) -> retorna a quantidade de contas que tem saldo maior 
 * ou igual a noMinimo*\
 * 
 */
package exercicioFClasses;

import java.util.HashMap;
import java.util.Set;

public class CadastroDeContas extends ContaCorrente{
	
	private HashMap <Integer,ContaCorrente> conta = new HashMap<Integer,ContaCorrente>();
	
	public boolean novaContaCorrente(ContaCorrente c) {
		
		if(c instanceof ContaCorrente) {
			conta.put(c.getNroConta(),c);
			return true;
		}else {
			return false;
		}
	}
	
	public ContaCorrente getConta(int nroConta) {
		ContaCorrente aux = conta.get(nroConta);
		return aux;
	}
	
	public double getSaldoTotal() {
		Set<Integer> aux = conta.keySet();
		double saldo = 0;
		for (Integer integer : aux) {
			saldo += conta.get(integer).getSaldo();
		}
		return saldo; 
	}
	
	public int qtdContas() {
		
		return conta.size();
	}
	
	
	
}
