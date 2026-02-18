package gentjanahani.u2w7d3.chainOfResponsibility;

public class Tenente extends Ufficiale {

    @Override
    public long getStipendio() {
        return 1000;
    }

    @Override
    public String getFunzione() {
        return "Controllo pattuglie";
    }

    @Override
    public String getGrado() {
        return "Tenente";
    }

    @Override
    public void trovaStipendio(long importo) {
        if(this.getStipendio()>= importo) System.out.println("tenente");
        if(this.getSuperiore() != null) getSuperiore().trovaStipendio(importo);
        else System.out.println("fine catena");
    }
}
