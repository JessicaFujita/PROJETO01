public class TesteEndereco{

	public static void main (String args[]){
	
		Endereco e1 = new Endereco("Frei Joao", 56);
		Endereco e2 = new Endereco("Vergueiro", 2700);
		Endereco e3 = e1;
		Endereco e4 = new Endereco("Vergueiro", 2700);
	
	//realizar Teste com equals
		System.out.println(e2);
		Pessoa p1 = new Pessoa("Jao", e2);
		Pessoa p2 = new Pessoa("Jao", e4);
		
		Pessoa p3 = new Pessoa("Ze", e1);
		Pessoa p4 = new Pessoa("Ze", e3);
	
		System.out.println(p3);
		
	//realizar Teste com equals	
	
	}
}