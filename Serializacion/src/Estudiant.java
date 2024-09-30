import java.io.Serializable;

public class Estudiant implements Serializable {
    int nota;
    String asig;
    public Estudiant(String a, int n){
        this.nota=n;
        this.asig=a;
    }
}
