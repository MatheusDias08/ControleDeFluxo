import java.util.Scanner;

public class Contador {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = sc.nextInt();
		System.out.println("Digite o seu segundo parâmetro");
		int parametroDois = sc.nextInt();
		
		
		try {
			contar(parametroUm, parametroDois);
		}
		catch(ParametrosInvalidosExcepition e) {
			extracted(e);
		}
		
		
		
	}

    private static void extracted(ParametrosInvalidosExcepition e) {
        System.out.println(e.getMessage());
    }
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosExcepition{
		
		
		if(parametroUm > parametroDois) {
			throw new Exception("O segundo parâmetro deve ser maior que o primeiro");
		}
			
			int contagem = parametroDois - parametroUm;
			for(int i = 1; i <= contagem; i++) {
				System.out.println("Imprimindo o número " + i);
			}
			

	}

}