package Projeto;

public  class AutoFalante {
	
	private int id;
	private String som;
	
	AutoFalante(){
	}
	
	AutoFalante(int id){
		this.id = id;
	}
	
	public  String emitirSom(String som) {
		return som;
	}
}
