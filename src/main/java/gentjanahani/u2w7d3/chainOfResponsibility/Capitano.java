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
}
