
public class Patamon implements DigimonState{

	@Override
	public DigimonState evolucao() {
		// TODO Auto-generated method stub
		System.out.println("Evolu��o! Angemon!");
		return new Angemon();
	}

	@Override
	public DigimonState voltaNormal() {
		// TODO Auto-generated method stub
		System.out.println("Digimon j� na forma Normal");
		return this;
	}

	@Override
	public DigimonState atacar() {
		// TODO Auto-generated method stub
		System.out.println("Habilidade Ativada: Air Shot!!");
		return this;
	}

	@Override
	public DigimonState tomarDano() {
		// TODO Auto-generated method stub
		System.out.println("Voce Tomou dano na Forma normal. Regredindo para Forma Inferior.");
		System.out.println("\n Forma Atual: Tokomon.");
		return new Tokomon();
	}

	@Override
	public DigimonState tomarDanoGrave() {
		// TODO Auto-generated method stub
		System.out.println("Voce Tmou um Dano muito Grave! Seu Digimon Morreu. :( ");
		System.out.println("\n Ele ir� Renascer do Ovo Um dia.");
		return new DigimonOvo();
	}

}
