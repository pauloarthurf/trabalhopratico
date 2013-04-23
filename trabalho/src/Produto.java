/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Objects;

/**
 *
 * @author PAULO
 */
public class Produto {

    private int Id;
    private String Nome;
    private float Valor_comp;
    private float Valor_vend;
    private String Descricao;
    private int Estoque;

    public Produto() {
        Id = 0;
        Nome = "vazio";
        Valor_comp = 0;
        Valor_vend = 0;
        Descricao = "vazio";
        Estoque = 0;
    }

    public Produto(int i, String escova_de_Dentes, double d) {
        throw new UnsupportedOperationException("Not yet implemented");
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

    public float getValor_comp() {
        return Valor_comp;
    }

    public void setValor_comp(float Valor_comp) {
        this.Valor_comp = Valor_comp;
    }

    public float getValor_vend() {
        return Valor_vend;
    }

    public void setValor_vend(float Valor_vend) {
        this.Valor_vend = Valor_vend;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public int getEstoque() {
        return Estoque;
    }

    public void setEstoque(int Estoque) {
        this.Estoque = Estoque;
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
        final Produto other = (Produto) obj;
        if (this.Id != other.Id) {
            return false;
        }
        if (!Objects.equals(this.Nome, other.Nome)) {
            return false;
        }
        if (Float.floatToIntBits(this.Valor_comp) != Float.floatToIntBits(other.Valor_comp)) {
            return false;
        }
        if (Float.floatToIntBits(this.Valor_vend) != Float.floatToIntBits(other.Valor_vend)) {
            return false;
        }
        if (!Objects.equals(this.Descricao, other.Descricao)) {
            return false;
        }
        if (this.Estoque != other.Estoque) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Produto{" + "Id=" + Id + ", Nome=" + Nome + ", Valor_comp=" + Valor_comp + ", Valor_vend=" + Valor_vend + ", Descricao=" + Descricao + ", Estoque=" + Estoque + '}';
    }
}
