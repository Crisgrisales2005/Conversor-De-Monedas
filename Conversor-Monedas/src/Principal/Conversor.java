package Principal;

import java.util.Map;

public class Conversor {
    //Metodo encargado de convertir las monedas en diferentes divisas.
    //recibe del objeto moneda una moneda que ya tenemos sus datos de conversiones y tipo de moneda.
    //moneda origen es un parametro pasado para realizar la conversion.
    //monto solo sera otro parametro que sera pasado en el ConversorApp para realizar los calculos respecto a la divisa
    public double convertirMoneda(Moneda monedaOrigen, String monedaDestino, double monto) {
        //obtiene todas las divisas disponibles.
        Map<String, Double> conversionRates = monedaOrigen.conversion_rates();
        if (conversionRates.containsKey(monedaDestino)) {
            //tasa es la moneda que se eligio en el menu.
            double tasa = conversionRates.get(monedaDestino);
            return monto * tasa;
        } else {
            throw new IllegalArgumentException("Moneda destino no encontrada: " + monedaDestino);
        }
    }
}
