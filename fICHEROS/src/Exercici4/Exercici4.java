package Exercici4;

import java.io.File;

public class Exercici4 {
    public static void main(String[] args){
        File mis_cosas = new File("/home/dangonric/Baixades/Documentos/Mis Cosas");
        File  alfabeto = new File("/home/dangonric/Baixades/Documentos/Alfabeto");
        File fotografias = new File("/home/dangonric/Baixades/Documentos/Fotografias");
        File libros = new File("/home/dangonric/Baixades/Documentos/Libros");
        File fotografias_mover = new File("/home/dangonric/Baixades/Documentos/Mis Cosas/Fotografias");
        File libros_mover = new File("/home/dangonric/Baixades/Documentos/Mis Cosas/Libros");
        System.out.println(mis_cosas.mkdir());
        System.out.println(alfabeto.mkdir());
        System.out.println(fotografias.renameTo(fotografias_mover));
        System.out.println(libros.renameTo(libros_mover));

        for (int i=65;i<=90;i++){
            char alf = (char) i;
            File letra= new File("/home/dangonric/Baixades/Documentos/Alfabeto/"+alf);
            letra.mkdir();
        }
    }
}
