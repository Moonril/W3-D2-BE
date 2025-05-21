import dao.EventoDao;
import entities.Evento;
import enums.TipoEvento;

import java.time.LocalDate;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        EventoDao dao = new EventoDao();

        Evento e1 = new Evento(new Random().nextInt(5, 55), "Concerto Pupo", LocalDate.of(2025, 5, 25), "concerto di pupo", TipoEvento.PUBBLICO, 50);

//        try {
//            dao.salvaEvento(e1);
//        } catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//
//        System.out.println(dao.getById(e1.getId()));

        //creare prima evento, aggiugnerlo, poi salvare partecipazione. quindi prima creo e salvo l'evento poi creo e salvo la persona ed in fine creo e salvo la partecipazione

        
















    }
}
