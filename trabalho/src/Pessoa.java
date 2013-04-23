/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author PAULO
 */
public class Pessoa {

    private int Id;
    private String Nome;
    private Date Data;
    private List<Endereco> Enderecos;
    private List<Email> Emails;
    private List<Telefone> Telefones;

    public Pessoa() {
        Id = 0;
        Nome = "vazio";
        Data = new Date();
        Enderecos = new LinkedList<Endereco>();
        Emails = new LinkedList<Email>();
        Telefones = new LinkedList<Telefone>();
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

    public Date getData() {
        return Data;
    }

    public void setData(Date Data) {
        this.Data = Data;

    }

    public List<Endereco> getEnderecos() {
        return Enderecos;
    }

    public void setEnderecos(List<Endereco> Enderecos) {
        this.Enderecos = Enderecos;
    }

    public List<Email> getEmails() {
        return Emails;
    }

    public void setEmails(List<Email> Emails) {
        this.Emails = Emails;
    }

    public List<Telefone> getTelefones() {
        return Telefones;
    }

    public void setTelefones(List<Telefone> Telefones) {
        this.Telefones = Telefones;
    }

    //Adicionar e Remover Endereços, Emails e Telefones
    public void addEndereco(Endereco En) {
        if (!Enderecos.contains(En)) {
            Enderecos.add(En);
        }
    }

    public void removeEndereco(Endereco En) {
        if (Enderecos.contains(En)) {
            Enderecos.remove(En);
        }
    }

    public void addEmail(Email Em) {
        if (!Emails.contains(Em)) {
            Emails.add(Em);
        }
    }

    public void removeEmail(Email Em) {
        if (Emails.contains(Em)) {
            Emails.remove(Em);
        }
    }

    public void addTelefone(Telefone Te) {
        if (!Telefones.contains(Te)) {
            Telefones.add(Te);
        }
    }

    public void removeTelefone(Telefone Te) {
        if (Telefones.contains(Te)) {
            Telefones.remove(Te);
        }
    }

    @Override
    public String toString() {
        return "Pessoa{" + "Id=" + Id + ", Nome=" + Nome + ", Data=" + Data + ", Enderecos=" + Enderecos + ", Emails=" + Emails + ", Telefones=" + Telefones + '}';
    }

    public void add(int i, String nome, String rg, String cpf, String data) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
