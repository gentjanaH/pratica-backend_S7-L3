package gentjanahani.u2w7d3.chainOfResponsibility;

public class Capitano extends Ufficiale {

    @Override
    public long getStipendio() {
        return 2000;
    }

    @Override
    public String getFunzione() {
        return "Gestione operativa";
    }

    @Override
    public String getGrado() {
        return "Capitano";
    }

    @Override
    public void trovaStipendio(long importo) {
        if(this.getStipendio()>= importo) System.out.println("capitano");
        if(this.getSuperiore() != null) getSuperiore().trovaStipendio(importo);
        else System.out.println("fine catena");
    }
}
