package gentjanahani.u2w7d3.chainOfResponsibility;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Generale extends Ufficiale{


    @Override
    public long getStipendio() {
        return 5000;
    }

    @Override
    public String getFunzione() {
        return "Decisioni di alto livello";
    }

    @Override
    public String getGrado() {
        return "Generale";
    }



    @Override
    public void trovaStipendio(long importo) {
        if(this.getStipendio()>= importo) System.out.println("generale");
        if(this.getSuperiore() != null) getSuperiore().trovaStipendio(importo);
        else System.out.println("fine catena");
    }
}
