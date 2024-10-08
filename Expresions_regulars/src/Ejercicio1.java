import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio1 {
    public static void main(String[] args) {
        String text = "El numero movil es 123-456-789. El de casa es 964-123-456";
        String regex = "\\d{3}-\\d{3}-\\d{3}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            String num = matcher.group();
            System.out.println("Telefon: "+num);
        }
    }
}
