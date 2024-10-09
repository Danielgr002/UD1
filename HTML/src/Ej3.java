import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ej3 {
    public static void main(String[] args) {
        try (FileReader ar = new FileReader("index.html");
             BufferedReader buffer = new BufferedReader(ar)) {
            String line;
            String contenido="";
            while ((line = buffer.readLine()) != null) {
                contenido+=line;
            }
            String regex = "-?\\d+(\\.\\d+)?";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(contenido);
            double suma=0;
            while (matcher.find()){
                String numero = matcher.group();
                suma+=Double.parseDouble(numero);
            }
            System.out.println("Resulatdo: "+suma);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
