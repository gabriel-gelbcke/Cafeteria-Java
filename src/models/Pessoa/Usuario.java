package models.Pessoa;

public class Usuario extends Pessoa{
    private String email;

    public Usuario(String nome, String cpf, String email) {
        super(nome, cpf);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "\nUsuario [email=" + email + ", getEmail()=" + getEmail() + ", getIdPessoa()=" + getIdPessoa()
                + ", getNome()=" + getNome() + ", getCpf()=" + getCpf() + "]";
    }

}