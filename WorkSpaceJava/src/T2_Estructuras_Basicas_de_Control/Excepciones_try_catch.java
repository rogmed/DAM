package T2_Estructuras_Basicas_de_Control;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Excepciones_try_catch {

    public static void main(String[] args)  {
        System.out.println("Introduce un numero != 0");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
 String numeroEscrito = br.readLine();  
int numero = Integer.parseInt(numeroEscrito);
        	double resultado = 10/numero;
        } catch(IOException e){
            System.out.println("Error al intentar acceder al teclado");
        }  catch(ArithmeticException e){
            System.out.println("El número no puede ser 0");
        } catch(NumberFormatException e){
            System.out.println("No has indicado un valor numérico");
        } finally{
            System.out.println("Se ha producido algún error");
        }
    }
}