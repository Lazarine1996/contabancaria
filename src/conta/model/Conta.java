package conta.model;

public abstract class Conta {
// implemento o codigo da Classe Conta
	private int numero;
	private int agencia;
	private int tipo;
	private String titular;
	private float saldo;

	// criando o metodo construtor: Generate Constructor using fields clicando com o
	// botao direito e Source
	public Conta(int numero, int agencia, int tipo, String titular, float saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;

		// criando o metodo get e set: Generate getters and setters clicando com o botao
		// direito e Source
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	// criando os metodos de retorno
	public boolean sacar(float valor) {

		if (this.getSaldo() < valor) {
			System.out.println("\n Saldo insuficiente! ");
			return false;
		}
		this.setSaldo(this.getSaldo() - valor);
		return true;

	}

	public void depositar(float valor) {

		this.setSaldo(this.getSaldo() + valor);
	}

	public void visualizador() {

		String tipo = "";

		switch (this.tipo) {

		case 1:
			tipo = "Conta Corrente";
			break;
		case 2:
			tipo = "Conta Poupança";
			break;
		}

		System.out.println("\n\n******************************************************");
		System.out.println("\nDados da Conta: ");
		System.out.println("\n******************************************************");
		System.out.println("\nNúmero da Conta: " + this.numero);
		System.out.println("Agência da Conta: " + this.agencia);
		System.out.println("Tipo de Conta: " + tipo);
		System.out.println("Titular: " + this.titular);
		System.out.println("Saldo: " + this.saldo);

	}

}
