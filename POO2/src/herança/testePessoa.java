package heranša;

public class testePessoa { 
	public static void main (String args[]) {
		Pessoa Victor = new Pessoa ("Victor", "rua xis", "(11) 999-999"); 
		Fornecedor Lucas = new Fornecedor ("Lucas", "Rua frei", "(11) 555-555", 500, 250, 0); 
		System.out.println(Victor.getNome()); 
		System.out.println(Victor.getEnderešo()); 
		System.out.println(Victor.getTelefone()); 
		
		System.out.println (Lucas.getNome()); 
		System.out.println (Lucas.getEnderešo()); 
		System.out.println (Lucas.getObterSaldo());
		
	}

}
