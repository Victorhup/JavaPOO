package herança;

public class Fornecedor extends Pessoa { 
	private double valorCredito; 
	private double valorDivida; 
	private double obterSaldo; 
	
	public Fornecedor (String nome, String endereço,String telefone, float valorCredito, float valorDivida, float obterSaldo) 
	{ 
		super (nome,endereço, telefone); 
		this.valorCredito = valorCredito;			
		this.valorDivida = valorDivida; 
		this.obterSaldo = obterSaldo; 
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(float valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(float valorDivida) {
		this.valorDivida = valorDivida;
	}

	public double getObterSaldo() {
		obterSaldo = valorCredito-valorDivida; 
		return obterSaldo;
		
	}

	public void setObterSaldo(double obterSaldo) {
		this.obterSaldo = obterSaldo;
	}

	
  
}
