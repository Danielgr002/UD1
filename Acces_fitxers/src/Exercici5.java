import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Exercici5 {
    public static void main(String[] args) {
        File direccion = new File("Diccionario");
        System.out.println(direccion.mkdir());

        for (int i=65;i<=90;i++){
            char a = (char) i;
            File ar = new File(direccion, a +".txt");
            try {
                System.out.println(ar.createNewFile());
                FileWriter writer = new FileWriter(ar);
                writer.write(a);
                writer.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
