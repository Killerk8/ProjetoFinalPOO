package Projeto;

public class SemaforoVeiculo extends Semaforo{
	String status;
	
	GerarAleatorio aleat = new GerarAleatorio();
	Camera camera = new Camera();
	
	boolean result = camera.ehPessoa();
	
	public String estahAberto() {
		if(aleat.gerar() == 0) {
			return "Verde";
		} else {
			return "Vermelho";
		}
	}
}
