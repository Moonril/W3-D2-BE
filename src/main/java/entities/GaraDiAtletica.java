//package entities;
//
//import enums.TipoEvento;
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//
//import java.time.LocalDate;
//import java.util.Set;
//@Entity
//public class GaraDiAtletica extends Evento{
//    @Column(name = "set_atleti")
//    private Set<Persona> setAtleti;
//
//    private  Persona vincitore;
//
//    public GaraDiAtletica(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento, int numeroMassimoPartecipanti, Set<Persona> setAtleti, Persona vincitore) {
//        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti);
//        this.setAtleti = setAtleti;
//        this.vincitore = vincitore;
//    }
//
//    @Override
//    public String toString() {
//        return "GaraDiAtletica{" +
//                super.toString() +
//                "setAtleti=" + setAtleti +
//                ", vincitore=" + vincitore +
//                '}';
//    }
//
//    public Set<Persona> getSetAtleti() {
//        return setAtleti;
//    }
//
//    public void setSetAtleti(Set<Persona> setAtleti) {
//        this.setAtleti = setAtleti;
//    }
//
//    public Persona getVincitore() {
//        return vincitore;
//    }
//
//    public void setVincitore(Persona vincitore) {
//        this.vincitore = vincitore;
//    }
//}
