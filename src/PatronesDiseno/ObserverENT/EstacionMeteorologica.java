package PatronesDiseno.ObserverENT;

import java.util.ArrayList;
import java.util.List;

public class EstacionMeteorologica implements Sujeto {
    private List<Observador> observadores;
    private int temperatura;

    public EstacionMeteorologica() {
        this.observadores = new ArrayList<>();
    }

    @Override
    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }

    @Override
    public void eliminarObservador(Observador observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.actualizar(temperatura);
        }
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
        notificarObservadores();
    }
}