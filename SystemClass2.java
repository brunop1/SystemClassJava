import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;


public class SystemClass2 {

	public static void main(String[] args) throws FileNotFoundException {
		
	      
	      
	      // Cria����o do Ficheiro
	      FileOutputStream f = new FileOutputStream("file.txt");
	      
	      System.setOut(new PrintStream(f));
	      
	      // Texto que vai ser escrito no ficheiro
	      System.out.println("This is System class!!!");
	      System.out.println("Bruno Lourenço e João Batista");
	      
	      
	      
		

	}

}
