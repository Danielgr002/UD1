import java.io.*;
import java.util.Dictionary;
import java.util.Scanner;

public class eJ1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Titul de la pagina: ");
        String titul = leer.nextLine();
        System.out.println("Titul principal de la pagina: ");
        String titul_prin = leer.nextLine();
        System.out.println("Contenido: ");
        String cont = leer.nextLine();
        System.out.println("Primer elemento1 de la linea 1: ");
        String element1 = leer.nextLine();
        System.out.println("Primer elemento2 de la linea 1: ");
        String element2 = leer.nextLine();
        System.out.println("Primer elemento3 de la linea 1: ");
        String element3 = leer.nextLine();

        File ar = new File("Pagina.html");
         try {
             FileWriter esc = new FileWriter(ar);
             BufferedWriter buffer = new BufferedWriter(esc);
             buffer.write("<html>");
             buffer.write("<head>");
             buffer.write("<Title>"+titul+"</Title>");
             buffer.write("</head>");
             buffer.write("<body>");
             buffer.write("<h1>"+titul_prin+"</h1>");
             buffer.write("<p>"+cont+"</p>");
             buffer.write("<ol>");
             buffer.write("<li>"+element1+"</li>");
             buffer.write("<li>"+element2+"</li>");
             buffer.write("<li>"+element3+"</li>");
             buffer.write("</ol>");
             buffer.write("</body>");
             buffer.write("</html>");
             buffer.close();
         } catch (IOException e){
             e.printStackTrace();
         }


    }
}
