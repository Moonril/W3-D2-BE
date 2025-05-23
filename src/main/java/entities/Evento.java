package entities;
// add lista partecipazione
// add location
import enums.TipoEvento;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "eventi")
@Inheritance(strategy = InheritanceType.JOINED)

public class Evento {

    @Id
    @GeneratedValue
    private int id;

    @Column(length = 30, nullable = false)
    private String titolo;

    @Column(name = "data_evento")
    private LocalDate dataEvento;

    @Column(length = 30, nullable = false)
    private String descrizione;

    @Enumerated
    @Column(name = "tipo_evento")
    private TipoEvento tipoEvento;

    @Column(name = "numero_massimo_partecipanti")
    private int numeroMassimoPartecipanti;

    @OneToOne
    @JoinColumn(name = "location_id")
    private Location location;

    @OneToMany(mappedBy = "evento")
    private List<Partecipazione> partecipazioni;


        public Location getLocation() {
            return location;
        }

        public void setLocation(Location location) {
            this.location = location;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitolo() {
            return titolo;
        }

        public void setTitolo(String titolo) {
            this.titolo = titolo;
        }

        public LocalDate getDataEvento() {
            return dataEvento;
        }

        public void setDataEvento(LocalDate dataEvento) {
            this.dataEvento = dataEvento;
        }

        public String getDescrizione() {
            return descrizione;
        }

        public void setDescrizione(String descrizione) {
            this.descrizione = descrizione;
        }

        public TipoEvento getTipoEvento() {
            return tipoEvento;
        }

        public void setTipoEvento(TipoEvento tipoEvento) {
            this.tipoEvento = tipoEvento;
        }

        public int getNumeroMassimoPartecipanti() {
            return numeroMassimoPartecipanti;
        }

        public void setNumeroMassimoPartecipanti(int numeroMassimoPartecipanti) {
            this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
        }

    public List<Partecipazione> getPartecipazioni() {
        return partecipazioni;
    }

    public void setPartecipazioni(List<Partecipazione> partecipazioni) {
        this.partecipazioni = partecipazioni;
    }

    public Evento(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento, int numeroMassimoPartecipanti) {
            this.titolo = titolo;
            this.dataEvento = dataEvento;
            this.descrizione = descrizione;
            this.tipoEvento = tipoEvento;
            this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
        }

        public Evento(){}

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", dataEvento=" + dataEvento +
                ", descrizione='" + descrizione + '\'' +
                ", tipoEvento=" + tipoEvento +
                ", numeroMassimoPartecipanti=" + numeroMassimoPartecipanti +
                ", location=" + location +
                ", partecipazioni=" + partecipazioni +
                '}';
    }
}
