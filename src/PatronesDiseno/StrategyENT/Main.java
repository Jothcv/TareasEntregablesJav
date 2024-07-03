package PatronesDiseno.StrategyENT;

public class Main {
    public static void main(String[] args) {
        NavegadorGPS gps= new NavegadorGPS(new RutaMasRapida());
        gps.calcularRuta("puntoA","puntoB");
        gps.setRutaStrategy(new RutaMasRapida());
        gps.calcularRuta("PuntoA","Punto B");
        gps.setRutaStrategy(new RutaMasCorta());
        gps.calcularRuta("puntoA","puntoB");
        gps.setRutaStrategy(new RutaMasEconomica());
        gps.calcularRuta("puntoA","puntoB");


    }
}
