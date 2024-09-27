package Exercici5;

import java.io.File;

public class Exercici5 {
    public static void main(String[] args) {
        File fotografias = new File("/home/dangonric/Baixades/Documentos/Fotografias");
        File libros = new File("/home/dangonric/Baixades/Documentos/Libros");
        File documentos = new File("/home/dangonric/Baixades/Documentos");
        try {
            borraTodo(fotografias);
            borraTodo(libros);
            borraTodo(documentos);
        } catch (Exception e){
            System.out.println("El archivo o directorio no existe.");
        }
    }
    public static void borraTodo(File f) throws Exception{
        if (f.exists()){
            if (f.isFile()){
                System.out.println(f.delete());
            } else {
                File[] lista = f.listFiles();
                for(File ar: lista){
                    System.out.println(ar.delete());
                }
                System.out.println(f.delete());
            }
        } else{
            throw new Exception();
        }
    }
}
