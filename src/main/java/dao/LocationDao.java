package dao;

import entities.Location;
import entities.Persona;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class LocationDao {
    private EntityManager em;

    public LocationDao(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
        em = emf.createEntityManager();
    }


    public void salva(Location location){
        em.getTransaction().begin();

        em.persist(location);

        em.getTransaction().commit();
    }


    public Location getById(int id){
        return em.find(Location.class, id);
    }

    public void rimuovi(int id){
        Location e = getById(id);

        if(e!=null){
            em.getTransaction().begin();

            em.remove(e);

            em.getTransaction().commit();
        } else {
            System.out.println("location con id: " + id + " non trovato");
        }
    }
}
