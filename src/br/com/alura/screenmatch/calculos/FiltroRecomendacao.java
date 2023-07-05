package screenmatch.calculos;

public class FiltroRecomendacao {

    public void filtra(Classivicavel classivicavel){
        if(classivicavel.getClassificacao() >= 4){
            System.out.println("Esta entre os preferidos do momento");
        }else if(classivicavel.getClassificacao() >= 2){
            System.out.println("Muito vem avaliavel");
        }else {
            System.out.println("Assista mais tarade");
        }
    }
}
