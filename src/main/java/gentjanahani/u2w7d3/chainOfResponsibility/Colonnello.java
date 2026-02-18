package gentjanahani.u2w7d3.chainOfResponsibility;

public class Colonnello extends Ufficiale {

    @Override
    public long getStipendio() {
        return 4000;
    }

    @Override
    public String getFunzione() {
        return "Comando di reggimenti";
    }

    @Override
    public String getGrado() {
        return "Colonnello";
    }
}
