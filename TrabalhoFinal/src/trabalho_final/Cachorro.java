package trabalho_final;

public class Cachorro extends Animal{

	private String nome;
		
	public Cachorro(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	void emitirSom() {
		System.out.println("Som de cachorro");	
	}
}