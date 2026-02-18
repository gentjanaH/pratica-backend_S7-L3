package gentjanahani.u2w7d3.adapter;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class UserData {
    private String nomeCompleto;
    private int eta;


    public void getData(DataSource ds){
        nomeCompleto=ds.getNomeCompleto();
        eta=ds.getEta();
    }
}
