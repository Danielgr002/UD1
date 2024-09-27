package Exercici3;

import java.io.File;

public class Exercici3 {
    public static void main(String[] args){
        File documentos = new File("/home/dangonric/Baixades/Documentos/");
        File fotografias = new File("/home/dangonric/Baixades/Documentos/Fotografias/");
        File libros = new File("/home/dangonric/Baixades/Documentos/Libros/");

        File docs = new File("/home/dangonric/Baixades/DOCS");
        File fotos = new File("/home/dangonric/Baixades/DOCS/FOTOS/");
        File lectures = new File("/home/dangonric/Baixades/DOCS/LECTURES");
        System.out.println(documentos.renameTo(docs));
        System.out.println(fotografias.renameTo(fotos));
        System.out.println(libros.renameTo(lectures));

        llistar(docs);
        llistar(fotos);
        llistar(lectures);
    }

    public static void llistar(File carpeta){
        String[] lista = carpeta.list();
        System.out.println("=============================================");
        System.out.println("LLista de la carpeta: "+carpeta);
        System.out.println("=============================================");
        for (String s : lista) {
            String[] fitxero = s.split("\\.");
            System.out.println(fitxero[0]);
        }
    }
}
