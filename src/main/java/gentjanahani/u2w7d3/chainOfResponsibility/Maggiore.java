package gentjanahani.u2w7d3.chainOfResponsibility;

public class Maggiore extends Ufficiale{

    @Override
    public long getStipendio() {
        return 3000;
    }

    @Override
    public String getFunzione() {
        return "Supervisione missioni";
    }

    @Override
    public String getGrado() {
        return "Maggiore";
    }

    @Override
    public void trovaStipendio(long importo) {
        if(this.getStipendio()>= importo) System.out.println("maggiore");
        if(this.getSuperiore() != null) getSuperiore().trovaStipendio(importo);
        else System.out.println("fine catena");
    }
}
