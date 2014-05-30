import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SystemClass5 {

	public static void main(String[] args) {
		
		System.out.println("Insira aqui alguma coisa: ");

		try{
			InputStreamReader isr = new InputStreamReader (System.in);
			BufferedReader teclado2 = new BufferedReader(isr);
		    String s = teclado2.readLine();
	 
		    System.out.println(s);
	   
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	 
	  }

}


