
public class Digimon {
	
	protected DigimonState estado;
	
	Digimon(){
		estado = new Tokomon();
		System.out.println("Olá, Sou um Tokomon!");
	}
	
	public void evolucao() {
		estado = estado.evolucao();
	}

	
	public void voltaNormal() {
		estado = estado.voltaNormal();
	}
	
	public void atacar() {
		estado = estado.atacar();
	}
	
	public void tomarDano() {
		estado = estado.tomarDano();
	}
	public void tomarDanoGrave() {
		estado = estado.tomarDanoGrave();
	}
}

