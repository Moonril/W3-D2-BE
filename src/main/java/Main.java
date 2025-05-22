import dao.EventoDao;
import dao.LocationDao;
import dao.PartecipazioneDao;
import dao.PersonaDao;
import entities.*;
import enums.Genere;
import enums.GenereConcerto;
import enums.StatoEvento;
import enums.TipoEvento;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        EventoDao dao = new EventoDao();
//
////        Evento e1 = new Evento(new Random().nextInt(5, 55), "Concerto Pupo", LocalDate.of(2025, 5, 25), "concerto di pupo", TipoEvento.PUBBLICO, 50);
//
////        try {
////            dao.salvaEvento(e1);
////        } catch (Exception e){
////            System.out.println(e.getMessage());
////        }
////
////        System.out.println(dao.getById(e1.getId()));
//
//        //creare prima evento, aggiugnerlo, poi salvare partecipazione. quindi prima creo e salvo l'evento poi creo e salvo la persona ed in fine creo e salvo la partecipazione
//
//        // location , persona , evento , partecipazione
//
//        PersonaDao personaDao = new PersonaDao();
//        PartecipazioneDao parteDao = new PartecipazioneDao();
//        LocationDao locDao = new LocationDao();
//
//        //creo un evento
//        Evento e1 = new Evento("Concerto Pupo", LocalDate.of(2025, 5, 25), "concerto di pupo", TipoEvento.PUBBLICO, 0);
//
//        //salvo evento
//        dao.salvaEvento(e1);
//
//        //creo location
//        Location barcelona = new Location("Montjuic", "Barcelona");
//
//        //salvo location
//        locDao.salva(barcelona);
//
//        //assegno location all'evento
//        e1.setLocation(barcelona);
//
//        //salvo evento di nuovo
//        dao.salvaEvento(e1); // questo non è un inserimento, ma un aggiornamento con la location (?)
//
//        //creo persona
//        Persona p1 = new Persona("Giulia", "Giulie", "giulia@giulie.it", LocalDate.of(1995, 1, 5), Genere.F);
//        Persona p2 = new Persona("Carlo", "Carli", "carlo@carli.it", LocalDate.of(1999, 12, 15), Genere.M);
//
//        //salvo persone
//        personaDao.salva(p1);
//        //personaDao.salva(p2);
//
//        //creo partecipazioni
//        Partecipazione parte = new Partecipazione(StatoEvento.CONFERMATA);
//
//        //salvo partecipazioni
//        parteDao.salva(parte);
//
//        // setto l'evento e partecipazione
//        parte.setEvento(e1);
//
//        // aggancio persona a partecipazione
//        parte.setPersona(p1);
//
//        //salva di nuovo partecipazioni
//        parteDao.salva(parte);
//
//        //cose sbagliate
//        //p1.setPartecipazioni(List.of(parte)); l'assegnazione si fa solo da un parte. Uno è il proprioetario del onetomany uno subisce. in questo caso non ho capito. non serve a nulla
//

        //esercizio giovedi
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
        EntityManager em = emf.createEntityManager();

        EventoDao eventoDao = new EventoDao(em);

        Concerto c1 = new Concerto("Black Pink", LocalDate.of(2025,5 ,5), "concerto blackpink", TipoEvento.PUBBLICO, 500, GenereConcerto.POP, false);

        PartitaDiCalcio partita1 = new PartitaDiCalcio("Livorno-Pisa", LocalDate.of(2025,5,22),"pisa merda", TipoEvento.PUBBLICO, 5000, "Livorno", "Pisa", "Livorno", 5, 1);


        eventoDao.salvaEvento(c1);
        eventoDao.salvaEvento(partita1);








    }
}
