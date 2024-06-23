package observer;

public class Namorada implements ChegadaAniversarianteObserver {

    @Override
    public void chegou(ChegadaAniversarianteEvent event) {
        System.out.println("O aniversariante chegou!");
        System.out.println("Apagando as luzes...");
        System.out.println("Fazendo silêncio...");
        System.out.println("SURPRESA!");
    }

}
