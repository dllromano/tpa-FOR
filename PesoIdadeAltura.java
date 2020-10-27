import java.util.Scanner;

public class PesoIdadeAltura {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		float maior50 = 0, mediaAltura = 0, pesoMenor40 = 0, media40 = 0, pesoVelho = 0, pesoNovo = 0;
		float altura = (float) 0.0, peso = (float) 0.0;
		int i, idade;
		
		for (i = 1; i < 26; i++) {
			System.out.println(i+ "****  Pessoa: ");
			
			System.out.println("Idade: ");
			idade = leia.nextInt();
			
			System.out.println("Peso:");
			peso = leia.nextFloat();
			
			System.out.println("Altura:");
			altura = leia.nextFloat();
			
			pesoVelho = peso;			
			pesoNovo = peso;						
			if (idade < pesoNovo) {				
				pesoNovo = peso;			
				}						
			if (idade > pesoVelho) {				
				pesoVelho = peso;			
				}						
			if (idade > 50) {				
				maior50++;			
				}						
			if (idade <= 20 && idade >= 10) {				
				mediaAltura = (mediaAltura + altura);			
				}					
			if (peso < 40) {				
				pesoMenor40++;			
				}				
			}		
		leia.close();				
		mediaAltura = mediaAltura/25;		
		media40 = (pesoMenor40*100)/25;				
		System.out.println("Maiores de 50 anos: " +maior50);		
		System.out.println("A média da altura de 10 a 20 anos é de: " +mediaAltura);		
		System.out.println("Porcentagem pessoas com menos de 40 quilos é de: " +media40+ "% do total");		
		System.out.println("Pesso da pessoa mais velha: " +pesoVelho);		
		System.out.println("Pesso da pessoa mais nova: " +pesoNovo);		
		System.out.println("Total de participantes: " + (i-1));	
		
		}
	}
