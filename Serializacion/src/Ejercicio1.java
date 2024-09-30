import java.io.*;
import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        Estudiant asig1 = new Estudiant("Ingles",7);
        Estudiant asig2 = new Estudiant("Llenguatge de maques",6);
        Estudiant asig3 = new Estudiant("FOL",5);
        Estudiant asig4 = new Estudiant("Programacion",5);
        Estudiant asig5 = new Estudiant("Bases de datos",9);
        Estudiant asig6 = new Estudiant("Entornos",6);
        Estudiant asig7 = new Estudiant("Sistemas Informaticos",8);
        Estudiant[] Notas = new Estudiant[]{asig1,asig2,asig3,asig4,asig5,asig6,asig7};

        String nom_fix = "Notas.txt";

        try {
            FileOutputStream file = new FileOutputStream(nom_fix);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(Notas);
            out.close();
            file.close();
        } catch (IOException e){
            e.printStackTrace();
        }

        try{
            FileInputStream file = new FileInputStream(nom_fix);
            ObjectInputStream in = new ObjectInputStream(file);
            Estudiant[] object = (Estudiant[]) in.readObject();
            in.close();
            file.close();

            System.out.println(object);
        } catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }



    }
}
