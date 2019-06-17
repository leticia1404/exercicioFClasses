package exercicioFClasses3;

public class Cliente {
	
	private String nome;
	private String cpf;
	private int idade;
	private char sexo;
	
	
	public Cliente(String nome, String cpf, int idade, char sexo) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		if(sexo == 'M' || sexo =='F') {
			this.sexo = sexo;
		}
	}

	public char getSexo() {
		return sexo;
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
	
	
	
	
	
}
