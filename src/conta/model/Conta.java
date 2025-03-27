package conta.model;



public class Conta {
	
	private int 	numero, agencia, tipo;
	private String 	titular;
	private float 	saldo;
	
	
	
	
	public Conta(int numero, int agencia, int tipo, String titular, float saldo) {
		
		this.numero  = 	numero;
		this.agencia = 	agencia;
		this.tipo    = 	tipo;
		this.titular = 	titular;
		this.saldo   = 	saldo;  
		}


	
	//numero get set
	public int getNumero() {
		return numero;}
	public void setNumero(int numero) {
		this.numero = numero;}



	//agencia get set
	public int getAgencia() {
		return agencia;}
	public void setAgencia(int agencia) {
		this.agencia = agencia;}



	//tipo get set
	public int getTipo() {
		return tipo;}
	public void setTipo(int tipo) {
		this.tipo = tipo;}



	//titular get set
	public String getTitular() {
		return titular;}
	public void setTitular(String titular) {
		this.titular = titular;}



	//saldo get set
	public float getSaldo() {
		return saldo;}
	public void setSaldo(float saldo) {
		this.saldo = saldo;}
	
	
	
	//METODOS
	
	
	public boolean sacar(float valor) {
		
		if(this.getSaldo() < valor) {
			System.out.println("\n Saldo Insuficiente!");
			return false;
		}
		
		this.setSaldo(this.getSaldo() - valor);
		return true;
	}
	
	
	
	
	public void depositar(float valor) {
		
		this.setSaldo(this.getSaldo() + valor);
	}
	
	
	
	public void visualizar() {
		
		String tipo = "";
		
		switch (this.tipo) {
		case 1: 
			tipo = "Conta Corrente";
			break;
			
		case 2: 
			tipo = " Conta Poupança";
			break;
		}
		
		
		System.out.println("\n\n***********************************");
		System.out.println("Dados da Conta:");
		System.out.println("***********************************");
		System.out.println("Numero da Conta: " + this.numero);
		System.out.println("Agencia: "+ this.agencia);
		System.out.println("Tupo da Conta: " + tipo);
		System.out.println("Titular: " + this.titular);
		System.out.println("saldo: " + this.saldo);

	}
	
	
	
	
	
	
	
}