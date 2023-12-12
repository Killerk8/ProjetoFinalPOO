package Projeto;

public class SemaforoPedestre extends SemaforoVeiculo{
	private String status;
	
	SemaforoVeiculo t = new SemaforoVeiculo();
	
	SemaforoPedestre(){
		status ="";
	}
	
	SemaforoPedestre(String descricao, String local){
		super(descricao,local);
		
	}
	
	@Override
	public String estahAberto() {
		if (t.estahAberto().equals("Aberto.")) 		
			return status = "Fechado.";
		
		else		
			return status = "Aberto.";
		
	}
}
