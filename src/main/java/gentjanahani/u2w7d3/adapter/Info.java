package gentjanahani.u2w7d3.adapter;

import lombok.Getter;
import lombok.ToString;

import java.util.Date;
@Getter
@ToString
public class Info {
    private String nome;
    private String cognome;
    private Date dataDiNascita;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Date getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(Date dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }
}
