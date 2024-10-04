package Ejercicio2;

import java.io.Serializable;

public class Estudiant implements Serializable {
    int nota;

    public Estudiant(){

    }
    public Estudiant(int n){
        this.nota=n;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return " Nota: "+this.nota;
    }
}
