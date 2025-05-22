package entities;

import jakarta.persistence.*;

// location - evento 121
// lista di eventi, se 12many, senno 1 evento
@Entity
@Table(name = "location")
public class Location {
    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private String citta;
    @OneToOne(mappedBy = "location")
    private Evento evento;


    public Location(String nome, String citta) {
        this.nome = nome;
        this.citta = citta;
    }

    public Location(){}

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", citta='" + citta + '\'' +
                ", evento=" + evento +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }
}
