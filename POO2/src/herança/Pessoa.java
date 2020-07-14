package heranša;

public class Pessoa {
   private String nome; 
   private String enderešo; 
   private String telefone; 
   
   public Pessoa (String nome, String enderešo, String telefone)
   {
	   this.nome = nome; 
	   this.telefone = telefone; 
	   this.enderešo = enderešo;	   
   }

   public String getNome() {
	return nome;
}

   public void setNome(String nome) {
	this.nome = nome;
}

   public String getEnderešo() {
	return enderešo;
}

   public void setEnderešo(String enderešo) {
	this.enderešo = enderešo;
}

   public String getTelefone() {
	return telefone;
}

   public void setTelefone(String telefone) {
	this.telefone = telefone;
}

}
