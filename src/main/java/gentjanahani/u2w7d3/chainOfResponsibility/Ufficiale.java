package gentjanahani.u2w7d3.chainOfResponsibility;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Ufficiale {
    private Ufficiale superiore;

    private long stipendio;
    private String funzione;
    private String grado;



public Ufficiale trovaStipendio (long importo){


    if(this.getStipendio() >= importo){
        return this;
    } else if (superiore != null ) {

        return superiore.trovaStipendio(importo);
    }
    return null;
}
}
