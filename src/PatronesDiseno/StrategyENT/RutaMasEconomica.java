package PatronesDiseno.StrategyENT;

public class RutaMasEconomica implements RutaStrategy {
    @Override
    public String calcularRuta(String puntoA, String puntoB) {
        if (puntoA.equals("Ciudad A") && puntoB.equals("Ciudad B")) {
            return "Ruta más económica: Calle B3 sin peajes";
        } else {
            return "Ruta más económica calculada entre " + puntoA + " y " + puntoB;
        }
    }
}
