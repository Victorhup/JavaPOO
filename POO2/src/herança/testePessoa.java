package herança;

public class testePessoa { 
	public static void main (String args[]) {
		Pessoa Victor = new Pessoa ("Victor", "rua xis", "(11) 999-999"); 
		Fornecedor Lucas = new Fornecedor ("Lucas", "Rua frei", "(11) 555-555", 500, 250, 0); 
		System.out.println(Victor.getNome()); 
		System.out.println(Victor.getEndereço()); 
		System.out.println(Victor.getTelefone()); 
		
		System.out.println (Lucas.getNome()); 
		System.out.println (Lucas.getEndereço()); 
		System.out.println (Lucas.getObterSaldo());
		
	}

}
