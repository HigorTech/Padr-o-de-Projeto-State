
public class HolyAngemon implements DigimonState{

	@Override
	public DigimonState evolucao() {
		// TODO Auto-generated method stub
		System.out.println("Mega Evolu��o! Seraphimon!");
		return new Seraphimon();
	}

	@Override
	public DigimonState voltaNormal() {
		// TODO Auto-generated method stub
		System.out.println("Desfazendo Evolu��o!");
		System.out.println("\n Forma Atual: Patamon.");
		return new Patamon();
	}

	@Override
	public DigimonState atacar() {
		// TODO Auto-generated method stub
		System.out.println("Habilidade Ativada: Heaven's Gate!!");
		return this;
	}

	@Override
	public DigimonState tomarDano() {
		// TODO Auto-generated method stub
		System.out.println("Voce tomou Muito Dano. Desfazendo Evolu��o.");
		System.out.println("\n Forma Atual: Patamon.");
		return new Patamon();
	}

	@Override
	public DigimonState tomarDanoGrave() {
		// TODO Auto-generated method stub
		System.out.println("Voce Tmou um Dano muito Grave! Seu Digimon Morreu. :( ");
		System.out.println("\n Ele ir� Renascer do Ovo Um dia.");
		return new DigimonOvo();
	}

}
