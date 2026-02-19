package gentjanahani.u2w7d3.composite;

public class Page implements ElementoBase {
    private String contenuto;


    @Override
    public int getPages() {
        return 1;
    }

    @Override
    public void print() {
        System.out.println(contenuto);
    }
}
