import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exercici1 {
    public static void main(String[] args) {
        int minimo=1000000000;
        int maximo=0;
        try {
            FileReader fr = new FileReader("/home/dangonric/Baixades/Documentos/numeros.txt");
            BufferedReader entrada = new BufferedReader(fr);
            String linia;
            while ((linia = entrada.readLine())!= null){
                int numero = Integer.parseInt(linia);
                if (minimo>numero){
                    minimo=numero;
                }
                if (maximo<numero){
                    maximo=numero;
                }
            }
            System.out.println("NUmero mas grande: "+maximo);
            System.out.println("NUmero mas pequeño: "+minimo);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
