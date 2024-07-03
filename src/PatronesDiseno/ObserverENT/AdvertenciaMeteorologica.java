package PatronesDiseno.ObserverENT;

public class AdvertenciaMeteorologica implements Observador {
    private static final int UMBRAL_ADVERTENCIA = 30;

    @Override
    public void actualizar(int temperatura) {
        if (temperatura > UMBRAL_ADVERTENCIA) {
            System.out.println("AdvertenciaMeteorologica: ¡Advertencia! ¡La temperatura está por encima de " + UMBRAL_ADVERTENCIA + " grados!");
        }
    }
}