
package P1;

import java.util.List;

public class Operador extends Empleado {

    private List<Subasta> subastasActivas; 
    
    public Operador(String nombre, String rol, List<Subasta> subastasActivas) {
        super(nombre, rol);
        this.subastasActivas = subastasActivas;
    }
    
    
    public void administraSubastas() {
        System.out.println("Administrando subastas...");
        for (Subasta subasta : subastasActivas) {
           
            if (subasta.estaEnCurso()) {
                System.out.println("Subasta en curso: " + subasta.toString());
            } else {
                System.out.println("Subasta finalizada o aún no ha comenzado: " + subasta.toString());
            }
        }
        
    }
    
    
    public void registraOfertas(Subasta subasta, Oferta oferta) {
        if (subastasActivas.contains(subasta)) {
            Comprador comprador = oferta.getComprador();
            double monto = oferta.getMonto();
            subasta.registrarOferta(comprador, monto);
            System.out.println("Oferta registrada en la subasta.");
        } else {
            System.out.println("La subasta especificada no está siendo manejada por este operador.");
        }
    }
    
    public void realizarTareas() {
        
        System.out.println("El operador está realizando sus tareas específicas.");
        
    }
    
    
    
    public void asisteCompradores(Comprador comprador) {
        
        System.out.println("Asistiendo al comprador: " + comprador.getNombre());
       
    }

	
}