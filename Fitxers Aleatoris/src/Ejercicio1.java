import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void anadir_prin(RandomAccessFile ar) throws IOException{
        try {
            Scanner leer = new Scanner(System.in);
            ar.seek(0);
            System.out.print("Dime el numero: ");
            double a = leer.nextDouble();
            if (ar==null){
                ar.writeDouble(a);
            } else{
                double viejo = ar.readDouble();
                ar.seek(ar.length());
                ar.writeDouble(viejo);
                ar.seek(0);
                ar.writeDouble(a);
            }
        }catch (InputMismatchException e){
            System.out.println("Tiene que ser un double.");
        }
    }

    public static void anadir_fin(RandomAccessFile ar) throws IOException{
        try {
            Scanner leer= new Scanner(System.in);
            ar.seek(ar.length());
            System.out.print("Dime el numero: ");
            double a = leer.nextDouble();
            ar.writeDouble(a);
        }catch (InputMismatchException e){
            System.out.println("Tiene que ser un double.");
        }
    }

    public static void llegir(RandomAccessFile ar) throws IOException{
       try {
            for (int i=0;i<ar.length();){
                ar.seek(i);
                System.out.println("Pos: "+i+" Valor: "+ar.readDouble());
                i=i+8;
            }
        }catch (InputMismatchException e){
            System.out.println("Tiene que ser un double.");
        }
    }

    public static boolean sustituir(RandomAccessFile ar) throws IOException {
        try {
            Scanner leer = new Scanner(System.in);
            System.out.print("Numero a sustituir: ");
            double num_sus = leer.nextDouble();
            System.out.print("Numero nuevo: ");
            double num_nu = leer.nextDouble();
            for (int i = 0; i < ar.length(); ) {
                ar.seek(i);
                if (ar.readDouble() == num_sus) {
                    ar.seek(i);
                    ar.writeDouble(num_nu);
                    return true;
                }
                i = i + 8;
            }
        } catch (InputMismatchException e) {
            System.out.println("Tiene que ser un double.");
        }
        return false;
    }

    public static void mostrar_menu(){
        System.out.println("Menu: ");
        System.out.println("1.Afegir numeros double al principi");
        System.out.println("2.Afegir numeros double al final");
        System.out.println("3.Mostrar fitxer");
        System.out.println("4.Sustituir numero");
        System.out.println("5.Salir");
        System.out.println("----------------------------------------------");
        System.out.print("Opcion: ");
    }

    public static void main(String[] args)throws IOException {
        RandomAccessFile archivo = new RandomAccessFile("prueba.txt","rw");
        Scanner leer = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("==============================================");
            System.out.println("Tamaño del archivo en byts " + archivo.length());
            System.out.println("==============================================");
            mostrar_menu();
            opcion = leer.nextInt();

            switch (opcion) {
                    case 1:
                        anadir_prin(archivo);
                        break;
                    case 2:
                        anadir_fin(archivo);
                        break;
                    case 3:
                        llegir(archivo);
                        break;
                    case 4:
                        System.out.println(sustituir(archivo));
                        break;
                    case 5:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opcion incorrecta.");

            }
        }while (opcion!=5);
    }
}