import java.time.LocalDate;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        EventoDao dao = new EventoDao();

        Evento e1 = new Evento(new Random().nextInt(5, 55), "Concerto Pupo", LocalDate.of(2025, 5, 25), "concerto di pupo", TipoEvento.PUBBLICO, 50);

        try {
            dao.salvaEvento(e1);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(dao.getById(e1.getId()));
















    }
}
