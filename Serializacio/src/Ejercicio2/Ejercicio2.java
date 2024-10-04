package Ejercicio2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        HashMap<String, Double> notas = new HashMap<>();
        notas.put("Ingles",0.0);
        notas.put("Fol",0.0);
        notas.put("Programacion",0.0);
        notas.put("Entornos",0.0);
        notas.put("Lenguaje de marcas",0.0);

        for (Map.Entry<String,Double> nota: notas.entrySet()){
            System.out.print("Nota de "+nota.getKey()+": ");
            nota.setValue(leer.nextDouble());
        }

        try (ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream("Notas2.dat"))) {
            oss.writeObject(notas);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Notas2.dat"))) {
            HashMap<String, Double> deserialitzat = (HashMap<String, Double>) ois.readObject();
            double suma = 0;
            int cont = 0;
            for (Map.Entry<String,Double> des: deserialitzat.entrySet()){
                cont++;
                suma+=des.getValue();
            }
            System.out.println("La suma"+suma);
            double media = suma / cont;
            System.out.println("La media es: " + media);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
