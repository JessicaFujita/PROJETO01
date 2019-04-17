public class Endereco{
	private String rua;
	private int numero;
	
	public Endereco(){}
	public Endereco (String rua, int numero){
		this.rua = rua;
		this.setNumero(numero);
	}
	public String getRua(){
		return this.rua;
	}
	public void setRua(String rua){
		this.rua = rua;
	}
	public int getNumero(){
		return this.numero;
	}
	public void setNumero(int numero){
		if (numero < 0 )
			this.numero = 0;
		else
			this.numero = numero;
	}
	
	@Override
	public String toString(){
		return "Rua: "+this.rua+ ",n. "+this.numero;
	}
	
	@Override
	public boolean equals (Object o){
		if (this == o)
			return true;
		if (o instanceof Endereco){
			Endereco aux = (Endereco) o;
			if (this.numero == aux.numero && this.rua.equals(aux.rua)){
				return true;
			}
		}
	return false;
	}
}
	