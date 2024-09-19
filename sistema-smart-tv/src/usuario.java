public class usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Volume atual: " + smartTv.volume);
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.diminuirVolume();
        System.out.println("Volume atual: " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Volume atual: " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Volume atual: " + smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);
        
        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada?" + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Novo Status -> TV Ligada?" + smartTv.ligada);
        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada?" + smartTv.ligada);

        smartTv.aumentarCanal();
        System.out.println("Novo canal: " + smartTv.canal);
        smartTv.diminuirCanal();
        System.out.println("Novo canal: " + smartTv.canal);
        smartTv.definirCanal();
        System.out.println("Novo canal: " + smartTv.canal);

        smartTv.mudarCanal(13);
        System.out.println("Novo canal: " + smartTv.canal);


    }
}
