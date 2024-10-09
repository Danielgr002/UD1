import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Fluxos_de_dades {
    public static void main(String[] args) {
        File archivo = new File("fitxerito");
        try {
            System.out.println(archivo.createNewFile());
            PrintWriter fileOutput = new PrintWriter(archivo);
            fileOutput.print("Les classes de fitxers en java són un jaleo.");
            fileOutput.flush();
        } catch (IOException ex){
            System.out.println("Erro");
        }

        try {
            FileWriter fw = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter outfile = new PrintWriter(bw);
            outfile.print("Les classes de fitxers en java són un jaleo.");
            outfile.flush();
        } catch (IOException e){
            e.printStackTrace();
        }

        try {
            FileOutputStream file = new FileOutputStream(archivo);
            OutputStreamWriter ar = new OutputStreamWriter(file);
            String s = "Les classes de fitxers en java són un jaleo.";
            ar.write(s);
            ar.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

        try {
            FileOutputStream fw = new FileOutputStream(archivo);
            OutputStreamWriter outfile = new OutputStreamWriter(fw);
            BufferedWriter bw = new BufferedWriter(outfile);
            bw.write("Les classes de fitxers en java són un jaleo.");
            bw.flush();
        } catch (IOException e){
            e.printStackTrace();
        }


        try {
            FileWriter fw = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Les classes de fitxers en java són un jaleo.");
            bw.flush();
        } catch (IOException e){
            e.printStackTrace();
        }

        try {
            PrintWriter fw = new PrintWriter(archivo);
            fw.print("Les classes de fitxers en java són un jaleo.");
            fw.close();
        } catch (IOException e){
            e.printStackTrace();
        }


    }
}