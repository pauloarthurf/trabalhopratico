/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Objects;

/**
 *
 * @author PAULO
 */
public class Pagamento {

    private int Id;
    private String Nome;
    private float Juros;
    private int Status;

    public Pagamento() {
        Id = 0;
        Nome = "vazio";
        Juros = 0;
        Status = 1; //Significa que a forma de pagamento esta ativa!

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

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public float getJuros() {
        return Juros;
    }

    public void setJuros(float Juros) {
        this.Juros = Juros;
    }

    public int getStatus() {
        return Status;
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
        final Pagamento other = (Pagamento) obj;
        if (this.Id != other.Id) {
            return false;
        }
        if (!Objects.equals(this.Nome, other.Nome)) {
            return false;
        }
        if (Float.floatToIntBits(this.Juros) != Float.floatToIntBits(other.Juros)) {
            return false;
        }
        if (this.Status != other.Status) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pagamento{" + "Id=" + Id + ", Nome=" + Nome + ", Juros=" + Juros + ", Status=" + Status + '}';
    }
}
