package models.Insumo;
import java.io.Serializable;

public class Insumo implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nomeInsumo;
    private int codigoInsumo;
    private int qtdInsumo;
    private double preco;


    public Insumo(String nomeInsumo,int qtdInsumo, double preco) {
        this.nomeInsumo = nomeInsumo;
        this.qtdInsumo = qtdInsumo;
        this.preco = preco;
    }

    public String getNomeInsumo() {
        return nomeInsumo;
    }


    public void setNomeInsumo(String nomeInsumo) {
        this.nomeInsumo = nomeInsumo;
    }


    public int getCodigoInsumo() {
        return codigoInsumo;
    }


    public void setCodigoInsumo(int codigoInsumo) {
        this.codigoInsumo = codigoInsumo;
    }


    public int getQtdInsumo() {
        return qtdInsumo;
    }


    public void setQtdInsumo(int qtdInsumo) {
        this.qtdInsumo = qtdInsumo;
    }


    public double getPreco() {
        return preco;
    }


    public void setPreco(double preco) {
        this.preco = preco;
    }


    @Override
    public String toString() {
        return "Insumo [nomeInsumo=" + nomeInsumo + ", codigoInsumo=" + codigoInsumo + ", qtdInsumo=" + qtdInsumo
                + ", preco=" + preco + "]";
    }
    
}