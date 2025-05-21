package dao;

import entities.Evento;
import entities.Persona;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class PersonaDao {
    private EntityManager em;

    public PersonaDao(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
        em = emf.createEntityManager();
    }


    public void salva(Persona persona){
        em.getTransaction().begin();

        em.persist(persona);

        em.getTransaction().commit();
    }


    public Persona getById(int id){
        return em.find(Persona.class, id);
    }

    public void rimuovi(int id){
        Persona e = getById(id);

        if(e!=null){
            em.getTransaction().begin();

            em.remove(e);

            em.getTransaction().commit();
        } else {
            System.out.println("persona con id: " + id + " non trovato");
        }
    }
}
