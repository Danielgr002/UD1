import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercici4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        File ar_a = new File("C:\\Users\\danie\\Downloads\\Documentos\\usa_nombres");
        File ar_b = new File("C:\\Users\\danie\\Downloads\\Documentos\\usa_apellidos");
        System.out.println("Nombre del archivo b: ");
        File ar_c = new File(leer.nextLine());
        try {
            FileReader lectura1 = new FileReader(ar_a);
            FileReader lectura2 = new FileReader(ar_b);
            BufferedReader entrada = new BufferedReader(lectura1);
            FileWriter writer = new FileWriter(ar_c);
            String line;
            ArrayList<String> lista_nom = new ArrayList<>();
            ArrayList<String> lista_ap = new ArrayList<>();
            while ((line = entrada.readLine()) != null){
                lista_nom.add(line);
            }
            BufferedReader entrada2 = new BufferedReader(lectura2);
            while ((line = entrada2.readLine()) != null){
                lista_ap.add(line);
            }
            System.out.println("Cunatos quieres generar: ");
            int num_max = leer.nextInt();
            for (int i=0;i<num_max;i++){
                int rand_nom = (int) (Math.random()*lista_nom.size());
                int rand_ap = (int) (Math.random()*lista_nom.size());
                String nom_al = lista_nom.get(rand_nom);
                String ap_al = lista_ap.get(rand_ap);
                writer.write(nom_al+", "+ap_al+"\n");
            }
            writer.close();
            entrada2.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
