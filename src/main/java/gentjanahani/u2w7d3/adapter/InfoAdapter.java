package gentjanahani.u2w7d3.adapter;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class InfoAdapter implements DataSource {

    private Info info;

    public InfoAdapter(Info info){

        this.info=info;
    }


    @Override
    public String getNomeCompleto() {
        return info.getNome()+ " " + info.getCognome();
    }

    @Override
    public int getEta() {
       Date dataDiNascita=info.getDataDiNascita();

       //convertire la Date in localDate
       LocalDate birth=dataDiNascita.toInstant()
               .atZone(ZoneId.systemDefault())
               .toLocalDate();

       LocalDate today= LocalDate.now();

        return LocalDate.now().getYear() - birth.getYear() +1900;
//                Math.toIntExact(ChronoUnit.YEARS.between(birth, today));


    }
}
