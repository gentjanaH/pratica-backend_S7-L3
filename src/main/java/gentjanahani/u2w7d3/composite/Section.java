package gentjanahani.u2w7d3.composite;

import java.util.List;

public class Section implements ElementoBase {

    private List<ElementoBase> sottoCapitoli;

    @Override
    public int getPages() {
        int totale = 0;
        for (ElementoBase section : sottoCapitoli) {

            totale += section.getPages();
        }
        return totale;

        //con lo stream
        //return sottoCapitoli.stream().mapToInt(section -> section.getPages()).sum()
    }

    @Override
    public void print() {
        sottoCapitoli.forEach(section -> section.print());
    }
}
