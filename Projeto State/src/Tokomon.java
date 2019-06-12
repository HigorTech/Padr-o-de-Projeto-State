
public class Tokomon implements DigimonState {

	@Override
	public DigimonState evolucao() {
		// TODO Auto-generated method stub
		
		System.out.println("Evolução! Patamon!");
		return new Patamon();
	}

	@Override
	public DigimonState voltaNormal() {
		// TODO Auto-generated method stub
		System.out.println("Digimon já na forma Normal deste nivel.");
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
		System.out.println("\n Ele irá Renascer do Ovo Um dia.");
		return new DigimonOvo();
	}

	@Override
	public DigimonState tomarDanoGrave() {
		// TODO Auto-generated method stub
		System.out.println("Voce Tmou um Dano muito Grave! Seu Digimon Morreu. :( ");
		System.out.println("\n Ele irá Renascer do Ovo Um dia.");
		return new DigimonOvo();
	}
	

}
