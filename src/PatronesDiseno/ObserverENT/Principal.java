package PatronesDiseno.ObserverENT;

public class Principal {
    public static void main(String[] args) {
        EstacionMeteorologica estacionMeteorologica = new EstacionMeteorologica();

        PantallaTemperatura pantallaTemperatura = new PantallaTemperatura();
        AdvertenciaMeteorologica advertenciaMeteorologica = new AdvertenciaMeteorologica();

        estacionMeteorologica.agregarObservador(pantallaTemperatura);
        estacionMeteorologica.agregarObservador(advertenciaMeteorologica);

        estacionMeteorologica.setTemperatura(25);
        estacionMeteorologica.setTemperatura(35);
    }
}