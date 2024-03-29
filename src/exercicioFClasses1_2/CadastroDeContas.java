/*2.Crie uma classe CadastroDeContas com os seguintes m�todos:
 * a.boolean novaContaCorrente(ContaCorrente c)-> acrescenta a nova conta c no cadastro. 
 * Retorna true se a opera��o foi bem-sucedida, false caso contr�rio;
 * b.ContaCorrente getConta(int nroCta)-> retorno a conta corrente de n�mero nroConta,
 * null caso a conta n�o exista;
 * c.double  getSaldoTotal()-> retorna a soma dos saldos de todas as contas cadastradas;
 * d.int  qtdContas(double  noMinimo) -> retorna a quantidade de contas que tem saldo maior 
 * ou igual a noMinimo*\
 * 
 */
package exercicioFClasses1_2;

import java.util.HashMap;
import java.util.Set;

public class CadastroDeContas {
	
	private HashMap <Integer,ContaCorrente> conta = new HashMap<Integer,ContaCorrente>();
	
	//a
	public boolean novaContaCorrente(ContaCorrente c) {
		
		if(c instanceof ContaCorrente) {
			conta.put(c.getNroConta(),c);
			return true;
		}else {
			return false;
		}
	}
	
	//b
	public ContaCorrente getConta(int nroConta) {
		ContaCorrente aux = conta.get(nroConta);
		return aux;
	}
	
	//c
	public double getSaldoTotal() {
		Set<Integer> aux = conta.keySet();
		double saldo = 0;
		for (Integer integer : aux) {
			saldo += conta.get(integer).getSaldo();
		}
		return saldo; 
	}
	
	//d
	public int qtdContas(double noMinimo) {
		Set<Integer> aux = conta.keySet();
		int cont = 0;
		for (Integer integer : aux) {
			if(conta.get(integer).getSaldo() >= noMinimo) {
				cont++;
			}
		}
		return cont;
	}
	
	
	
}
