import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exercici2 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("/home/dangonric/Baixades/Documentos/alumnos_notas.txt");
            BufferedReader entrada = new BufferedReader(fr);
            String linia;
            while ((linia = entrada.readLine())!= null){
                String[] palabras = linia.split(" ");
                int cont=0;
                double sum=0;
                for (int i=2;i<palabras.length;i++){
                    cont++;
                    double nota=Double.parseDouble(palabras[i]);
                    sum +=nota;
                }
                double media = sum/cont;
                System.out.println("El nombre es: "+palabras[0]+ " apellido: "+palabras[1]+ " Nota media: "+media);
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
