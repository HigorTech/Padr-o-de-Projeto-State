
public class Angemon implements DigimonState{

	@Override
	public DigimonState evolucao() {
		// TODO Auto-generated method stub
		System.out.println("Super Evolução! HolyAngemon!");
		return new HolyAngemon();
	}

	@Override
	public DigimonState voltaNormal() {
		// TODO Auto-generated method stub
		System.out.println("Desfazendo Evolução!");
		System.out.println("\n Forma Atual: Patamon.");
		return new Patamon();
	}

	@Override
	public DigimonState atacar() {
		// TODO Auto-generated method stub
		System.out.println("Habilidade Ativada: heaven's kunacle!!");
		return this;
	}

	@Override
	public DigimonState tomarDano() {
		// TODO Auto-generated method stub
		System.out.println("Voce tomou Muito Dano. Desfazendo Evolução.");
		System.out.println("\n Forma Atual: Patamon.");
		return new Patamon();
	}

	@Override
	public DigimonState tomarDanoGrave() {
		// TODO Auto-generated method stub
		System.out.println("Voce Tmou um Dano muito Grave! Seu Digimon Morreu. :( ");
		System.out.println("\n Ele irá Renascer do Ovo Um dia.");
		return new DigimonOvo();
	}

	
}
