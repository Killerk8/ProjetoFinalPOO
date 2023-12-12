package Projeto;

public class Main {

	public static void main(String[] args) {
		
		SemaforoVeiculo sem1 = new SemaforoVeiculo("teste1","rua2");
		SemaforoPedestre sem2 = new SemaforoPedestre("teste", "rua 10");
		Camera cam = new Camera();
		
		try {
		
		System.out.println("É pessoa: " + cam.ehPessoa());

		System.out.println("Status Semaforo Veiculo: " + sem1.estahAberto());
		
		System.out.println("Status Semaforo Pedeste: " + sem2.estahAberto());
		System.out.print("Auto Falante: "); 
		cam.comunicarSemVeic();

		}
		catch (RuntimeException e){
			System.out.println(e.getMessage());
		}
	}

}
