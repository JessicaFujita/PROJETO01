public class Pessoa{
	private String nome;
	private Endereco endereco;
	public Pessoa() {}
	
	public Pessoa(String nome, Endereco endereco){
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public Endereco getEndereco(){
		return this.endereco;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setEndereco(Endereco endereco){
		this.endereco = endereco;
	}

	@Override
	public String toString(){
	return "Nome: " +this.nome+ "\nEndereco: \n" + this.endereco.toString();
	}	
	
	@Override
	public boolean equals (Object o){
		if (this == o){
			return true;
		}
		if (o instanceof Pessoa){
			
			Pessoa aux= (Pessoa)o;
		
			if(this.nome.equals(aux.nome) && this.endereco.equals(aux.endereco)){
				return true;
			}
		}
		return false;	
	}
}