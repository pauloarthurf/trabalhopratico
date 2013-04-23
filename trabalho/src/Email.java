/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Objects;

/**
 *
 * @author PAULO
 */
public class Email {

    private int Id;
    private String Email_nome;

    //----
    public Email() {
        Id = 0;
        Email_nome = "vazio";
    }

    //----
    public int getId() {
        return Id;
    }

    public void setId(int Id, int id) throws ErroValidacaoExeception {
        if (id < 0) {
            throw new ErroValidacaoExeception("Id menor que zero!");
        } else {
            this.Id = Id;
        }
        this.Id = Id;
    }

    public String getEmail_nome() {
        return Email_nome;
    }

    public void setEmail_nome(String Email_nome) {
        this.Email_nome = Email_nome;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Email other = (Email) obj;
        if (this.Id != other.Id) {
            return false;
        }
        if (!Objects.equals(this.Email_nome, other.Email_nome)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Email{" + "Id=" + Id + ", Email_nome=" + Email_nome + '}';
    }
}
