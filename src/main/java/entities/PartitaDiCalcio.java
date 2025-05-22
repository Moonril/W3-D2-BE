package entities;

import enums.TipoEvento;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import java.time.LocalDate;


@Entity
public class PartitaDiCalcio extends Evento{

    @Column(name = "squadra_di_casa")
    private String squadraDicasa;

    @Column(name = "squadra_ospite")
    private String squadraOspite;

    @Column(name = "squadra_vincente", nullable = false)
    private String squadraVincente;

    @Column(name = "gol_casa")
    private int golCasa;

    @Column(name = "gol_ospite")
    private int golOspite;

    public PartitaDiCalcio(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento, int numeroMassimoPartecipanti, String squadraDicasa, String squadraOspite, String squadraVincente, int golCasa, int golOspite) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti);
        this.squadraDicasa = squadraDicasa;
        this.squadraOspite = squadraOspite;
        this.squadraVincente = squadraVincente;
        this.golCasa = golCasa;
        this.golOspite = golOspite;
    }

    public PartitaDiCalcio(){}


    @Override
    public String toString() {
        return "PartitaDiCalcio{" + super.toString()+
                "squadraDicasa='" + squadraDicasa + '\'' +
                ", squadraOspite='" + squadraOspite + '\'' +
                ", squadraVincente='" + squadraVincente + '\'' +
                ", golCasa=" + golCasa +
                ", golOspite=" + golOspite +
                '}';
    }

    public String getSquadraDicasa() {
        return squadraDicasa;
    }

    public void setSquadraDicasa(String squadraDicasa) {
        this.squadraDicasa = squadraDicasa;
    }

    public String getSquadraOspite() {
        return squadraOspite;
    }

    public void setSquadraOspite(String squadraOspite) {
        this.squadraOspite = squadraOspite;
    }

    public String getSquadraVincente() {
        return squadraVincente;
    }

    public void setSquadraVincente(String squadraVincente) {
        this.squadraVincente = squadraVincente;
    }

    public int getGolCasa() {
        return golCasa;
    }

    public void setGolCasa(int golCasa) {
        this.golCasa = golCasa;
    }

    public int getGolOspite() {
        return golOspite;
    }

    public void setGolOspite(int golOspite) {
        this.golOspite = golOspite;
    }
}
