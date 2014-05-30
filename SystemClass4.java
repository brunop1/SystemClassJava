import java.util.Scanner;


public class SystemClass4 {

	public static void main(String[] args) {
		
	      String s = "Ol�� Mundo! 3 + 5.0 = 8.0 true ";
	      
	      // Cria����o do Scanner com a string s
	      Scanner scanner = new Scanner(s);
	      
	      // Encontra o pr��ximo int e imprime-o
	      // Continua o loop do Scanner
	      while (scanner.hasNext()) {
	          
	          // Se o texto seguinde for um int, imprime "Encontrado" e o int
	          if (scanner.hasNextInt()) {
	              System.out.println("Encontrado :" + scanner.nextInt());
	          }
	          // Se o texto n��o for um int, imprime n��o encontrado e o argumento encontrado
	          System.out.println("N��o encontrado :" + scanner.next());
	      }
	      
	      // Termina o scanner
	      scanner.close();
	  

	}

}
