/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Objects;

/**
 *
 * @author PAULO
 *
 */
public class Vendedor extends Pessoa {

    private int Id;
    private String Usuario;
    private String Senha;

    public Vendedor() {
        Id = 0;
        Usuario = "";
        Senha = "";
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id, int id) throws ErroValidacaoExeception {
        if (id < 0) {
            throw new ErroValidacaoExeception("Id menor que zero!");
        } else {
            this.Id = Id;
        }
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vendedor other = (Vendedor) obj;
        if (this.Id != other.Id) {
            return false;
        }
        if (!Objects.equals(this.Usuario, other.Usuario)) {
            return false;
        }
        if (!Objects.equals(this.Senha, other.Senha)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "Id=" + Id + ", Usuario=" + Usuario + ", Senha=" + Senha + '}';
    }
}
