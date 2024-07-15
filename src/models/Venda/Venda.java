package models.Venda;
import java.io.Serializable;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import models.Insumo.Insumo;
import models.Pessoa.Funcionario;
import models.Pessoa.Usuario;
import models.Produto.Produto;

public class Venda implements Serializable {
    private static final long serialVersionUID = 1L;
    private Produto produto;
    private Insumo insumo;
    private Funcionario funcionario;
    private Usuario usuario;
    private String dataVenda;
    private int idVenda;

    public Venda(Produto produto, Insumo insumo, Funcionario funcionario, Usuario usuario) {
        this.produto = produto;
        this.insumo = insumo;
        this.funcionario = funcionario;
        this.usuario = usuario;

        LocalDateTime data = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = data.format(formato);

        this.dataVenda = formattedDate;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Insumo getInsumo() {
        return insumo;
    }

    public void setInsumo(Insumo insumo) {
        this.insumo = insumo;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    @Override
    public String toString() {
        return "Venda [produto=" + produto + ", insumo=" + insumo + ", funcionario=" + funcionario + ", usuario="
                + usuario + ", dataVenda=" + dataVenda + ", idVenda=" + idVenda + "]";
    }
}
