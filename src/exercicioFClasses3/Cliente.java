package exercicioFClasses3;

public class Cliente {
	
	private String nome;
	private String cpf;
	private int idade;
	private char genero;
	
	
	public Cliente(String nome, String cpf, int idade, char genero) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		if(genero == 'M' || genero =='F') {
			this.genero = genero;
		}
	}

	public char getGenero() {
		return genero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String listaCliente() {
		return "CPF  = " + cpf + " Nome = " + nome;
	}
	
	public String exibeCliente() {
		return "CPF  = " + cpf + "\nNome = " + nome + "\nIdade = " + idade + "\nGênero = " +genero;
	}
	
	
	
	
}
