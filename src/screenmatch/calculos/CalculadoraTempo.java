package screenmatch.calculos;
import screenMatch.model.Title;

public class CalculadoraTempo {

    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Title t){
        tempoTotal += t.getTime();
    }

}
