package Principal;
import java.util.Map;
//Se utiliza para que el objeto moneda sea devuelto en el metodo consultar moneda
public record Moneda(String base_code, Map<String, Double> conversion_rates) {
}
