package interfaces;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RadioRelogio r = new RadioRelogio();
		
		r.ligar(); //interface radio
		//r.horas();
		System.out.println("Hora: " + r.horas()); //interface: relogio
		r.estacao(101.5);
		System.out.println("Estacao: " + r.obterEstacao()); //interface radio
		r.desligar();

	}

}
