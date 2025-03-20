public class Usuario {
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume(); //24
        smartTv.diminuirVolume(); //23
        smartTv.diminuirVolume(); //22
        smartTv.aumentarVolume(); //23

        System.out.println("Canal actual: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal actual: " + smartTv.canal);
        smartTv.aumentarCanal();
        System.out.println("Canal actual: " + smartTv.canal);
        smartTv.diminurCanal();
        System.out.println("Canal actual: " + smartTv.canal);


        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal actual: " + smartTv.canal);
        System.out.println("Volume actual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Tv ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Tv ligada? " + smartTv.ligada);

    }
}
