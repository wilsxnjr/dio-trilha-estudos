public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentar volume " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuir volume " + volume);
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminurCanal() {
        canal--;
    }

}