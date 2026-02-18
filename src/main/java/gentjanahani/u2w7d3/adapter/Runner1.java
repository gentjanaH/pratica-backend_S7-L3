package gentjanahani.u2w7d3.adapter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.Date;

@Component
public class Runner1 implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        Info info=new Info();
        info.setNome("Mario");
        info.setCognome("Rossi");
        info.setDataDiNascita(new Date(1993, Calendar.OCTOBER, 18));

        System.out.println(info);

        UserData user=new UserData();
        user.getData(new InfoAdapter(info));
        System.out.println(user);
    }
}
