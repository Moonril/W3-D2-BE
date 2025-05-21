package dao;

import entities.Partecipazione;
import entities.Persona;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class PartecipazioneDao {
    private EntityManager em;

    public PartecipazioneDao(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
        em = emf.createEntityManager();
    }


    public void salva(Partecipazione partecipazione){
        em.getTransaction().begin();

        em.persist(partecipazione);

        em.getTransaction().commit();
    }


    public Partecipazione getById(int id){
        return em.find(Partecipazione.class, id);
    }

    public void rimuovi(int id){
        Partecipazione e = getById(id);

        if(e!=null){
            em.getTransaction().begin();

            em.remove(e);

            em.getTransaction().commit();
        } else {
            System.out.println("partecipazione con id: " + id + " non trovato");
        }
    }
}
