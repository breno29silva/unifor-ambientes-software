package trabalho_final;

public class Cachorro extends Animal{

	public Cachorro(String nome) {
		super(nome);
	}

	@Override
	void emitirSom() {
		System.out.println("Som de cachorro");	
	}
}