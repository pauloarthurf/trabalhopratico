/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Objects;

/**
 *
 * @author PAULO
 */
public class Itemvenda {

    private int Id;
    private float V_produto;
    private int Qtd;
    private Produto produto;

    public Itemvenda() {
        Id = 0;
        V_produto = 0;
        Qtd = 0;
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

    public float getV_produto() {
        return V_produto;
    }

    public void setV_produto(float V_produto) {
        this.V_produto = V_produto;
    }

    public int getQtd() {
        return Qtd;
    }

    public void setQtd(int Qtd) {
        this.Qtd = Qtd;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
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
        final Itemvenda other = (Itemvenda) obj;
        if (this.Id != other.Id) {
            return false;
        }
        if (Float.floatToIntBits(this.V_produto) != Float.floatToIntBits(other.V_produto)) {
            return false;
        }
        if (this.Qtd != other.Qtd) {
            return false;
        }
        if (!Objects.equals(this.produto, other.produto)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Item_venda{" + "Id=" + Id + ", V_produto=" + V_produto + ", Qtd=" + Qtd + ", produto=" + produto + '}';
    }
}
