//imports y paquetes
package Principal;
import java.io.IOException;
import java.util.Scanner;

public class ConversorApp {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        Conversor conversor = new Conversor();
        ConsultarMoneda consulta = new ConsultarMoneda();
        while (true) {
            System.out.println("Sistema para cambio de moneda");
            System.out.println("Ingrese un numero para realizar las divisas que se muestran en " +
                    "pantalla");
            System.out.println("1)Usd(Dolar) a Cop(Peso colombiano)");
            System.out.println("2)Cop(Peso colombiano) a Usd(Dolar)");
            System.out.println("3)Usd(Dolar) a MXN(Peso mexicano)");
            System.out.println("4)MXN(Peso mexicano) a Usd(Dolar)");
            System.out.println("5)Usd(Dolar) a ARS(Peso argentino)");
            System.out.println("6)ARS(Peso argentino) a Usd(Dolar)");
            System.out.println("7) Salir del programa");
            String respuestaUsuario= input.nextLine();
            if(respuestaUsuario.equals("7")){
                System.out.println("Saliendo del programa");
                break;
            }
            System.out.println("Ingrese un monto para convertir en la divisa deseada: ");
            int monto = input.nextInt();
            while(true){
                if(monto<=0){
                    System.out.println("Ingrese un numero valido");
                    monto = input.nextInt();
                }else{
                    break;
                }
            }
            if(respuestaUsuario.equals("1")){
                Moneda moneda= consulta.ConsultarMoneda("USD");
                System.out.println("El valor "+monto+" [USD] corresponde al valor: " + conversor.convertirMoneda(moneda,"COP",monto)+" [COP]");
            }
            if(respuestaUsuario.equals("2")){
                Moneda moneda= consulta.ConsultarMoneda("COP");
                System.out.println("El valor "+monto+" [COP] corresponde al valor: " + conversor.convertirMoneda(moneda,"USD",monto)+" [USD]");
            }
            if(respuestaUsuario.equals("3")){
                Moneda moneda= consulta.ConsultarMoneda("USD");
                System.out.println("El valor "+monto+" [USD] corresponde al valor: " + conversor.convertirMoneda(moneda,"MXN",monto)+" [MXN]");
            }
            if(respuestaUsuario.equals("4")){
                Moneda moneda= consulta.ConsultarMoneda("MXN");
                System.out.println("El valor "+monto+" [MXN] corresponde al valor: " + conversor.convertirMoneda(moneda,"USD",monto)+" [MXN]");
            }
            if(respuestaUsuario.equals("5")){
                Moneda moneda= consulta.ConsultarMoneda("USD");
                System.out.println("El valor "+monto+" [USD] corresponde al valor: " + conversor.convertirMoneda(moneda,"ARS",monto)+" [ARS]");
            }
            if(respuestaUsuario.equals("6")){
                Moneda moneda= consulta.ConsultarMoneda("ARS");
                System.out.println("El valor "+monto+" [ARS] corresponde al valor: " + conversor.convertirMoneda(moneda,"USD",monto)+" [USD]");
            }
        }
    }
}

