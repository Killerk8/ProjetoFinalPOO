package Projeto;

public class SemaforoVeiculo extends Semaforo{
	private String status;
	
	SemaforoVeiculo(){}
	
	public SemaforoVeiculo(String descricao, String local) {
		super(descricao,local);
	}
	
	GerarAleatorio aleat = new GerarAleatorio();
	
	
	@Override
	public String estahAberto() {
		
		if(aleat.gerar() == 1) 		
			return status = "Aberto.";
	
		else 		
			return status = "Fechado.";
		
	}
}
 