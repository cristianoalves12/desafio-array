import java.util.Scanner;
import classes.Quarto;

public class ExercícioFixação {
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		Quarto[] vetorQuartos = new Quarto[10];
		
		
		System.out.println("QUANTOS ESTUDANTES IRÃO ALUGAR OS QUARTOS DA POUSADA ?");
		int estudantes = sc.nextInt();
		while (estudantes < 1 || estudantes > 10) {
			System.out.print("iNFORME UMA QUANTIDADE ENTRE 1 E 10");
			System.out.println("QUANTOS ESTUDANTES IRÃO ALUGAR OS QUARTOS DA POUSADA ?"); 
			estudantes = sc.nextInt();
		}
		
		for (int i = 0; i < estudantes; i++) {
			System.out.printf("ALUGUEL: %dº %n", i + 1);
			System.out.printf("INFORME O NOME DO %dº ESTUDANTE: ", i + 1);
            String nome = sc.next();
            System.out.printf("INFORME O EMAIL DO %dº ESTUDANTE: ", i + 1);
            String email = sc.next();
            System.out.printf("INFORME QUAL O QUARTO O %dº ESTUDANTE DESEJA: ", i + 1);
            int nQuarto = sc.nextInt();
   
            while (vetorQuartos[nQuarto] != null) {
            
           	System.out.println("ESSE QUARTO JÁ SE ENCONTRA OCUPADO");
            System.out.println("INFORME OUTRO QUARTO: ");
            nQuarto = sc.nextInt();
            }
         
        	vetorQuartos[nQuarto] = new Quarto(nome, email, nQuarto);
		}
		System.out.println("LISTA DE QUARTOS OCUPADOS: ");
        for (int i = 0; i < 10; i++) {
        	if(vetorQuartos[i] != null) {
            System.out.print(i);
            System.out.println(vetorQuartos[i]);
            }
		}
	}
}