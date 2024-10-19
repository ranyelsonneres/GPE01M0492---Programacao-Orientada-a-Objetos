package interfaces;

public class RadioRelogio implements Radio, Relogio{
	
	private boolean ligado;
	private double estacaoAtual;
	
	public RadioRelogio() {
		this.ligado = false;
		this.estacaoAtual = 0.0;
	}
	
	//interface radio
	public void ligar() {
		ligado = true;
		System.out.println("Ligado!!");
	}
	
	public void desligar() {
		ligado = false;
		System.out.println("Desligado!!");
	}
	
	public void estacao(double estacaoAtual) {
		this.estacaoAtual = estacaoAtual;
	}
	
	//interface relogio
	public String horas() {
		java.time.LocalTime agora = java.time.LocalTime.now();
		return agora.toString();
	}
	
	public double obterEstacao() {
		return estacaoAtual;
	}

}
