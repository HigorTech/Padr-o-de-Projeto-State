
public class Tokomon implements DigimonState {

	@Override
	public DigimonState evolucao() {
		// TODO Auto-generated method stub
		
		System.out.println("Evolu��o! Patamon!");
		return new Patamon();
	}

	@Override
	public DigimonState voltaNormal() {
		// TODO Auto-generated method stub
		System.out.println("Digimon j� na forma Normal deste nivel.");
		return this;
	}

	@Override
	public DigimonState atacar() {
		// TODO Auto-generated method stub
		System.out.println("Habilidade Ativada: Bite!!");
		return this;
	}

	@Override
	public DigimonState tomarDano() {
		// TODO Auto-generated method stub
		System.out.println("Seu Digimon Morreu. :( ");
		System.out.println("\n Ele ir� Renascer do Ovo Um dia.");
		return new DigimonOvo();
	}

	@Override
	public DigimonState tomarDanoGrave() {
		// TODO Auto-generated method stub
		System.out.println("Voce Tmou um Dano muito Grave! Seu Digimon Morreu. :( ");
		System.out.println("\n Ele ir� Renascer do Ovo Um dia.");
		return new DigimonOvo();
	}
	

}
