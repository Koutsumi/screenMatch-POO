package br.com.alura.screenmatch.calculos;
import br.com.alura.screenmatch.model.Title;

public class CalculadoraTempo {

    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Title t){
        tempoTotal += t.getTime();
    }

}
