package Projeto;

public class GerarAleatorio {
	public int gerar() {
		int max = 1, min = 0, randomInteger = (int) Math.floor(Math.random() * (max - min + 1)) + min;
	
		return randomInteger;
	}
}
