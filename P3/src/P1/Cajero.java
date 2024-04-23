package P1;

import java.util.HashMap;
import java.util.Map;

public class Cajero {
    private Map<String, Double> pagosRegistrados;
    private Map<String, String> metodosDePagoRegistrados; 

    public Cajero() {
        this.pagosRegistrados = new HashMap<>();
        this.metodosDePagoRegistrados = new HashMap<>();
    }

  
    public void procesarPagos(Pago pago) {
        if (pago != null) {
            String comprador = pago.getComprador();
            double monto = pago.getMonto();
            String metodoDePago = pago.getMetodoPago();

           
            System.out.println("Procesando pago de " + comprador + " por $" + monto + " mediante " + metodoDePago);
            
            pagosRegistrados.put(comprador, monto);
            metodosDePagoRegistrados.put(comprador, metodoDePago);
            
            pago.emitirRecibo();
        }
    }

   
    public void emitirRecibos(Pago pago) {
        if (pago != null) {
            String comprador = pago.getComprador();
            double monto = pago.getMonto();
            String metodoDePago = pago.getMetodoPago(); 

            System.out.println("Emitiendo recibo para " + comprador + ": $" + monto + " mediante " + metodoDePago);
        }
    }
    
    public void registrarMetodosDePago(MetodoPago metodoPago) {
        if (metodoPago != null) {
            String comprador = metodoPago.getComprador();
            String metodo = metodoPago.getMetodo();

            metodosDePagoRegistrados.put(comprador, metodo);
            System.out.println("Método de pago '" + metodo + "' registrado para " + comprador);
        }
    }
}

