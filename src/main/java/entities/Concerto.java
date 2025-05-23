package entities;

import enums.GenereConcerto;
import enums.TipoEvento;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.time.LocalDate;

@Entity
public class Concerto extends Evento{
    @Column(name = "genere_concerto")
    @Enumerated(EnumType.STRING)
    private GenereConcerto genereConcerto;

    @Column(name = "in_streaming")
    private boolean inStreaming;

    public Concerto(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento, int numeroMassimoPartecipanti, GenereConcerto genereConcerto, boolean inStreaming) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti);
        this.genereConcerto = genereConcerto;
        this.inStreaming = inStreaming;
    }

    public Concerto() {}

    @Override
    public String toString() {
        return "Concerto{" + super.toString()+
                "genereConcerto=" + genereConcerto +
                ", inStreaming=" + inStreaming +
                '}';
    }

    public GenereConcerto getGenereConcerto() {
        return genereConcerto;
    }

    public void setGenereConcerto(GenereConcerto genereConcerto) {
        this.genereConcerto = genereConcerto;
    }

    public boolean isInStreaming() {
        return inStreaming;
    }

    public void setInStreaming(boolean inStreaming) {
        this.inStreaming = inStreaming;
    }
}
