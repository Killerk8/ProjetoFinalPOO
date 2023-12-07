package Projeto;

public class Camera {
String descricao, ip;
	
	GerarAleatorio aleat = new GerarAleatorio();
	
	public Camera() {
	}

	public Camera(String descricao, String ip) {
		this.descricao = descricao;
		this.ip = ip;
	}

	public boolean ehPessoa() {
		int result = aleat.gerar();
		
		if(result == 0) {
			return true;
		} else {
			return false;
		}
	}
}