package gentjanahani.u2w7d3.chainOfResponsibility;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner2 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        Tenente tenente = new Tenente();
        Capitano capitano = new Capitano();
        Maggiore maggiore = new Maggiore();
        Colonnello colonnello = new Colonnello();
        Generale generale = new Generale();

        tenente.setSuperiore(capitano);
        tenente.setSuperiore(maggiore);
        maggiore.setSuperiore(colonnello);
        colonnello.setSuperiore(generale);

        tenente.trovaStipendio(4000);
    }


}
