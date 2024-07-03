package PatronesDiseno.StrategyENT;


public class RutaMasCorta implements RutaStrategy {
    @Override
    public String calcularRuta(String puntoA, String puntoB) {
        if (puntoA.equals("Ciudad A") && puntoB.equals("Ciudad B")) {
            return "Ruta más corta: Calle C2";
        } else {
            return "Ruta más corta calculada entre " + puntoA + " y " + puntoB;
        }
    }
}
