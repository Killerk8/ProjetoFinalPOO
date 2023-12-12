package Projeto;

public class Camera extends SemaforoVeiculo{
String descricao, ip;
	
	GerarAleatorio aleat = new GerarAleatorio();
	AutoFalante aut = new AutoFalante();
	SemaforoVeiculo x = new SemaforoVeiculo();
	
	public Camera() {}

	public Camera(String descricao, String ip) {
		this.descricao = descricao;
		this.ip = ip;
	}

	public boolean ehPessoa(){
		int result = aleat.gerar();
		
		if(result == 0) 
			return true;
		
		else 
			throw new RuntimeException("Não foi identificado algum pedestre."); 
	}
	
	public void comunicarSemVeic() {
		
			if (x.estahAberto().equals("Fechado.")) 	
				System.out.println(aut.emitirSom("Pode atravessar.")); 
									
			else 				 			
				System.out.println(aut.emitirSom("Aguarde para atravessar.")); 	
	}

}
	
	