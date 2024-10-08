import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio2 {
    public static void main(String[] args) {
        String text = "Eres un datil i un abobat.";
        String regex = "datil|abobat";
        Pattern pattern1 = Pattern.compile(regex);
        Matcher matcher = pattern1.matcher(text);

        if (matcher.find()){
            System.out.println(matcher.replaceAll("guapo"));
        } else {
            System.out.println("No hi han paraules ofensives");
        }
    }
}
