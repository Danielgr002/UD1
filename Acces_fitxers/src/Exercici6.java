import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exercici6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Dime un numero: ");
        String numero = leer.nextLine();
        try {
            FileReader numeros = new FileReader("pi-million");
            BufferedReader entrada = new BufferedReader(numeros);
            String line;
            boolean encontrado=false;
            while ((line = entrada.readLine()) != null){
                if (line.equals(numero)){
                    System.out.println("Numero encontrado.");
                    encontrado=true;
                    break;
                }
            }
            if (!encontrado){
                System.out.println("No encontrado.");
            }
            entrada.close();
        } catch (FileNotFoundException e){
            System.out.println("archivo no encontrado");
        } catch (IOException e){
            System.out.println("ERROR");
        }

    }
}
