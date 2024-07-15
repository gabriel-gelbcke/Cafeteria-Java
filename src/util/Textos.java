package util;
import java.io.Serializable;
import java.util.List;

public class Textos implements Serializable, Comparable<Textos>{
    private List<String> textos;

    public Textos(List<String> textos) {
        this.textos = textos;
    }

    public void add(String texto){
        textos.add(texto);
    }

    public List<String> getTextos() {
        return textos;
    }

    public void setTextos(List<String> textos) {
        this.textos = textos;
    }

    @Override
    public String toString() {
        return "Textos [textos=" + textos + "]";
    }

    @Override
    public int compareTo(Textos o) {
        return 0;
    }
    
}
