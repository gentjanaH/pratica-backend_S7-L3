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



public abstract  void trovaStipendio (long importo);



}
