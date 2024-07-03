package PatronesDiseno.ObserverENT;

public class PantallaTemperatura implements Observador {
    @Override
    public void actualizar(int temperatura) {
        System.out.println("PantallaTemperatura: La temperatura actual es " + temperatura + " grados.");
    }
}
