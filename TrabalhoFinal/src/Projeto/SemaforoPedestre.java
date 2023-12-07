package Projeto;

public class SemaforoPedestre extends Semaforo{
	SemaforoVeiculo semVeic = new SemaforoVeiculo();
	
	public String receberSinalDoSemVeic() {
		if(semVeic.estahAberto().equals("Verde")) {
			return "Vermelho";
		} else {
			return "Verde";
		}
	}
	
}
