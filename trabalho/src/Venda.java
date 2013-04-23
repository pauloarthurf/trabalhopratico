/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author PAULO
 */
public class Venda {

    private int Id;
    private Date Data_venda;
    private float Total;
    private float Total_final;
    private List<Itemvenda> Itens;
    private Vendedor Atendente;
    private Cliente Consumidor;
    private Pagamento Tipo_paga;

    public Venda() {
        Id = 0;
        Data_venda = new Date();
        Total = 0;
        Total_final = 0;
        Itens = new LinkedList<Itemvenda>();
        Atendente = Atendente;
        Consumidor = Consumidor;
        Tipo_paga = Tipo_paga;
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

    public Date getData_venda() {
        return Data_venda;
    }

    public void setData_venda(Date Data_venda) {
        this.Data_venda = Data_venda;
    }

    public float getTotal() {
        return Total;
    }

    public void setTotal(float Total) {
        this.Total = Total;
    }

    public float getTotal_final() {
        return Total_final;
    }

    public void setTotal_final(Pagamento Pa) {
        Total_final = (Total + (Total * Pa.getJuros()));
    }

    public List<Itemvenda> getItens() {
        return Itens;
    }

    public void setItens(List<Itemvenda> Itens) {
        this.Itens = Itens;
    }

    public Vendedor getAtendente() {
        return Atendente;
    }

    public void setAtendente(Vendedor Atendente) {
        this.Atendente = Atendente;
    }

    public Cliente getConsumidor() {
        return Consumidor;
    }

    public void setConsumidor(Cliente Consumidor) {
        this.Consumidor = Consumidor;
    }

    public Pagamento getTipo_paga() {
        return Tipo_paga;
    }

    public void setTipo_paga(Pagamento Tipo_paga) {
        this.Tipo_paga = Tipo_paga;
    }

    public void addItem(Itemvenda Iv) {
        if (!Itens.contains(Iv)) {
            Itens.add(Iv);
            Total += Iv.getProduto().getValor_vend() * Iv.getQtd();
        }
    }

    public void removeItem(Itemvenda Iv) {
        if (Itens.contains(Iv)) {
            Itens.remove(Iv);
            Total -= Iv.getProduto().getValor_vend() * Iv.getQtd();
        }
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
        final Venda other = (Venda) obj;
        if (this.Id != other.Id) {
            return false;
        }
        if (!Objects.equals(this.Data_venda, other.Data_venda)) {
            return false;
        }
        if (Float.floatToIntBits(this.Total) != Float.floatToIntBits(other.Total)) {
            return false;
        }
        if (!Objects.equals(this.Itens, other.Itens)) {
            return false;
        }
        if (!Objects.equals(this.Atendente, other.Atendente)) {
            return false;
        }
        if (!Objects.equals(this.Consumidor, other.Consumidor)) {
            return false;
        }
        if (!Objects.equals(this.Tipo_paga, other.Tipo_paga)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Venda{" + "Id=" + Id + ", Data_venda=" + Data_venda + ", Total=" + Total + ", Itens=" + Itens + ", Atendente=" + Atendente + ", Consumidor=" + Consumidor + ", Tipo_paga=" + Tipo_paga + '}';
    }
}
