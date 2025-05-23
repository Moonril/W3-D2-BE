package entities;

import enums.TipoEvento;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;
@Entity
@Table(name = "gare_di_atletica")
public class GaraDiAtletica extends Evento{

    @ManyToMany
    @JoinTable(name = "gare_atleti", joinColumns = @JoinColumn(name ="gara_di_atletica_id"), inverseJoinColumns = @JoinColumn(name = "persona_id"))
    private Set<Persona> atleti;

    @ManyToOne
    @JoinColumn(name = "vincitore")
    private  Persona vincitore;

    public GaraDiAtletica(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento, int numeroMassimoPartecipanti) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti);
    }

    public GaraDiAtletica(){}

    @Override
    public String toString() {
        return "GaraDiAtletica{" +
                super.toString() +
                "setAtleti=" + atleti +
                ", vincitore=" + vincitore +
                '}';
    }

    public Set<Persona> getSetAtleti() {
        return atleti;
    }

    public void setSetAtleti(Set<Persona> setAtleti) {
        this.atleti = setAtleti;
    }

    public Persona getVincitore() {
        return vincitore;
    }

    public void setVincitore(Persona vincitore) {
        this.vincitore = vincitore;
    }
}
