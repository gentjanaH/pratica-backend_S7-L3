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
}
