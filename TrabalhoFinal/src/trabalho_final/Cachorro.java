package trabalho_final;

public class Cachorro extends Animal{

	public Cachorro(String nome) {
		super(nome);
	}

	@Override
	void emitirSom() {
		System.out.println("Som de cachorro");	
	}

	@Override
	public String toString() {
		return "Oi, eu sou um cachorro e meu nome é " + getNome();
	}
}