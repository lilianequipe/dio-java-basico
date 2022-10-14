public class Usuario {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        SmartTv smartTv = new SmartTv();

        //System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Qual o Canal atual? "+smartTv.canal);
        System.out.println("Qual o volume atual? "+smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> Tv ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> Tv ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Novo Status -> Qual o volume? "+smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Novo Status -> Qual o volume dps de diminuir? "+smartTv.volume);

        smartTv.selecionarCanal(13);
        System.out.println("Canal selecionado: "+smartTv.canal);

    }
}