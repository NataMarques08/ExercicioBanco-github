package setup;

public class contaCliente {
	private String nome;
	private int numConta;
	private double saldo;
	
	
	


	public contaCliente(String nome, int conta,double saldo) {
		setNome(nome);
		setNumConta(conta);
		setSaldo(saldo);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	// -- Método para saque da conta corrente
	public void saqueConta(double value) {
		if(getSaldo() <= 0.0f) {
			System.out.println("Voce não possue saldo para saque, Efetue um novo deposito!");
		}else {
			value = getSaldo() - value;
			setSaldo(value);
		}
	}
	

	public String toString() {
		return "Cliente: "
				+getNome()
				+", conta: "
				+getNumConta()
				+". Saldo em conta: "
				+String.format("%.2f",getSaldo());
	}
	
}
