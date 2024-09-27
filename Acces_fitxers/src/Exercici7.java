import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Exercici7 {
    public static void main(String[] args) {
        try {
            FileReader leer = new FileReader("Acces_fitxers/src/quijote_cervantes.txt");
            BufferedReader entrada = new BufferedReader(leer);
            String line;
            int cont=0;
            int cont_pal=0;
            int cont_car=0;
            HashMap<String, Integer> repeticiones = new HashMap<>();
            while ((line = entrada.readLine()) != null) {
                cont++;
                String[] palabras = line.split(" ");
                cont_pal = cont_pal + palabras.length;
                String[] caracteres = line.split("");
                cont_car = cont_car + caracteres.length;
                for (String pal : palabras) {
                    if (repeticiones.containsKey(pal)) {
                        repeticiones.put(pal, repeticiones.get(pal) + 1);
                    } else {
                        repeticiones.put(pal, 1);
                    }
                }
            }
            ArrayList<Integer> lista = new ArrayList<>(repeticiones.values());
            lista.sort(Comparator.reverseOrder());
            int[] los10masgrandes = new int[10];

            for (int i=0;i<los10masgrandes.length;i++){
                los10masgrandes[i]=lista.get(i);
            }
            for (Map.Entry num: repeticiones.entrySet()){
                for (int i=0;i< los10masgrandes.length;i++){
                    int n=(int) num.getValue();
                    if (n==los10masgrandes[i]){
                            System.out.println("Palabra: "+num.getKey()+ ", Numero: "+num.getValue());
                    }
                }
            }

            System.out.println("Numero de lineas: "+ cont);
            System.out.println("Numero de palabras: "+ cont_pal);
            System.out.println("Numero de caracters: "+ cont_car);
        }catch (FileNotFoundException e){
            System.out.println("archivo no encontrado");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
