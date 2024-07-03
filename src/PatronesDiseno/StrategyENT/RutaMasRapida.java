package PatronesDiseno.StrategyENT;

public class RutaMasRapida implements RutaStrategy {
    @Override
    public String calcularRuta(String puntoA, String puntoB) {
        if (puntoA.equals("Ciudad A") && puntoB.equals("Ciudad B")) {
            return "Ruta más rápida: Autopista A1";
        } else {
            return "Ruta más rápida calculada entre " + puntoA + " y " + puntoB;
        }
    }
}

