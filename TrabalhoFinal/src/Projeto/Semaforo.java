package Projeto;

public abstract class Semaforo {
	private String descricao, local;

	public Semaforo() {}

	public Semaforo(String descricao, String local) {
		this.descricao = descricao;
		this.local = local;
	}

	public abstract  String estahAberto();
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}
	
}
