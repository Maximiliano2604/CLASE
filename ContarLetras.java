/*
 * Programa que recibe una cadena de texto y devuelve el numero
 * de letras, digitos y espacios que contiene. 
 */
package contarletrasydigitos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author shaoran
 */
public class ContarLetras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(isr);
		System.out.print("Introduce una cadena: ");
		String cadena = bf.readLine();
		Conteo(cadena);
        // TODO code application logic here
    }
    static void Conteo(String s) {
		int letras=0;
		int digitos=0;
		int espacios=0;		
		for( char c: s.toCharArray() ) {	
			if( Character.isLetter(c) )
				letras++;
			else
				if( Character.isDigit(c) )
					digitos++;
				else
					if( Character.isWhitespace(c) )
						espacios++;
		}
		System.out.println("Número de letras: "+letras);
		System.out.println("Número de digitos: "+digitos);
		System.out.println("Número de espacios: "+espacios);
	}
}
