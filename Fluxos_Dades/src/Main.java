import java.io.File;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        File archivo = new File("fitxerito");
        try {
            System.out.println(archivo.createNewFile());
        } catch (IOException ex){
            System.out.println("Error");
        }
    }
}