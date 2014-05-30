import java.util.Scanner;


public class SystemClass3 {

	public static void main(String[] args) {


		Scanner teclado = new Scanner (System.in); ////inicia teclado
	      
		System.out.println("Escreva aqui o seu nome: ");
		String nome = teclado.nextLine(); //faz a leitura da linha escrita pelo utilizador
		  
		System.out.println("O seu nome ��: " + nome);
		

	}

}
