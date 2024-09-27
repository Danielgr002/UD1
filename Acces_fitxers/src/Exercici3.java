import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercici3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Nombre del archivo a: ");
        File ar_a = new File(leer.nextLine());
        System.out.println("Nombre del archivo b: ");
        File ar_b = new File(leer.nextLine());
        try {
            FileReader lectura = new FileReader(ar_a);
            BufferedReader entrada = new BufferedReader(lectura);
            FileWriter writer = new FileWriter(ar_b);
            String line;
            ArrayList<String> lista = new ArrayList<>();
            while ((line = entrada.readLine()) != null){
                lista.add(line);
            }
            Collections.sort(lista);
            for (String l: lista){
                writer.write(l+"\n");
            }
            writer.close();
            entrada.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
