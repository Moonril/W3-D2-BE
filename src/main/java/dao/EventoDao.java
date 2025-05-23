package dao;/*- save
	- getById
	- delete
*/

import entities.*;
import enums.Genere;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import jdk.jfr.Event;

import java.util.List;

public class EventoDao {
    private EntityManager em;

    public EventoDao(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
        em = emf.createEntityManager();
    }

    public EventoDao(EntityManager em){
        this.em = em;
    }

    public void salvaEvento(Evento evento){
        em.getTransaction().begin();

        em.persist(evento);

        em.getTransaction().commit();
    }


    public Evento getById(int id){
        return em.find(Evento.class, id);
    }

    public void rimuoviEvento(int id){
        Evento e = getById(id);

        if(e!=null){
            em.getTransaction().begin();

            em.remove(e);

            em.getTransaction().commit();
        } else {
            System.out.println("evento con id: " + id + " non trovato");
        }
    }

    // queries

    public List<Concerto> getConcertiInStreaming(boolean inStreaming){
        TypedQuery<Concerto> query = em.createQuery("select c from Concerto c where c.inStreaming=:inStreaming", Concerto.class);

        query.setParameter("inStreaming", inStreaming);
        return query.getResultList();
    }

    public List<Concerto> getConcertiPerGenere(Genere genere){
        TypedQuery<Concerto> query = em.createQuery("select c from Concerto c where c.genere=:genere", Concerto.class);
        query.setParameter("genere", genere);
        return query.getResultList();
    }


    public List<PartitaDiCalcio> getPartiteVinteInCasa(){
        TypedQuery<PartitaDiCalcio> query = em.createNamedQuery("getPartiteVinteInCasa", PartitaDiCalcio.class);
        return query.getResultList();
    }

    public List<PartitaDiCalcio> getPartiteVinteInTrasferta(){
        TypedQuery<PartitaDiCalcio> query = em.createNamedQuery("getPartiteVinteInTrasferta", PartitaDiCalcio.class);
        return query.getResultList();
    }

    public List<PartitaDiCalcio> getPartitePareggiate(){
        TypedQuery<PartitaDiCalcio> query = em.createNamedQuery("getPartitePareggiate", PartitaDiCalcio.class);
        return query.getResultList();
    }

    public List<GaraDiAtletica> getGareDiAtleticaPerVincitore(Persona vincitore){
        TypedQuery<GaraDiAtletica> query = em.createQuery("select g from GaraDiAtletica g where g.vincitore=:vincitore", GaraDiAtletica.class);
        query.setParameter("vincitore", vincitore);
        return query.getResultList();
    }

    public List<GaraDiAtletica> getGareDiAtleticaPerPartecipante(Persona partecipante){
        TypedQuery<GaraDiAtletica> query = em.createQuery("select g from GaraDiAtletica g where :partecipante MEMBER OF g.atleti", GaraDiAtletica.class);
        query.setParameter("partecipante", partecipante);
        return query.getResultList();
    }

    public List<Evento> getEventiSoldOut(){
        TypedQuery<Evento> query = em.createQuery("select e from Evento e where e.partecipazioni.size()=e.numeroMaxPartecipanti", Evento.class);
        return query.getResultList();
    }

}
