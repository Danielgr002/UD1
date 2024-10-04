package Ejercicio1;

import Ejercicio2.Estudiant;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        Estudiant asig1 = new Estudiant();
        System.out.println("Nota Ingles: ");
        asig1.setNota(leer.nextInt());
        Estudiant asig2 = new Estudiant();
        System.out.println("Nota Programacio: ");
        asig2.setNota(leer.nextInt());
        Estudiant asig3 = new Estudiant();
        System.out.println("Nota Llenguatge: ");
        asig3.setNota(leer.nextInt());
        Estudiant asig4 = new Estudiant();
        System.out.println("Nota Entorns: ");
        asig4.setNota(leer.nextInt());
        Estudiant asig5 = new Estudiant();
        System.out.println("Nota Fol: ");
        asig5.setNota(leer.nextInt());
        Estudiant asig6 = new Estudiant();
        System.out.println("Nota bd: ");
        asig6.setNota(leer.nextInt());
        ArrayList<Estudiant> Notas = new ArrayList<>();
        Notas.add(asig1);
        Notas.add(asig2);
        Notas.add(asig3);
        Notas.add(asig4);
        Notas.add(asig5);
        Notas.add(asig6);

        try (ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream("Notas1.dat"))){
            oss.writeObject(Notas);
        } catch (IOException e){
            e.printStackTrace();
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Notas1.dat"))){
            ArrayList<Estudiant> deserialitzat = (ArrayList<Estudiant>) ois.readObject();
            int suma=0;
            int cont=0;
            for (Estudiant des: deserialitzat){
                cont++;
                suma+=des.getNota();
            }
            double media=(double) suma/cont;
            System.out.println("La media es: "+media);
        } catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }


    }
}
