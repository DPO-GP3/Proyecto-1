import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import P1.Subasta;
import Controller.Controller;
import P1.Subasta;
import P1.Comprador;
import P1.Cajero;
import P1.Pago;
import P1.MetodoPago;
import P1.Operador;
import P1.Oferta;
import P1.Administrador;
import P1.Pieza;

public class Visual {

    public static void main(String[] args) {
        // Creamos una instancia del controlador
        Controller controller = new Controller();

        // Simulamos un inicio de sesión
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre de usuario:");
        String nombreUsuario = scanner.nextLine();
        System.out.println("Ingrese su contraseña:");
        String contrasena = scanner.nextLine();

        boolean inicioSesionExitoso = controller.iniciarSesion(nombreUsuario, contrasena);

        // Si el inicio de sesión fue exitoso, mostramos el menú de opciones
        if (inicioSesionExitoso) {
            System.out.println("Inicio de sesión exitoso.");
            mostrarMenu(controller);
        } else {
            // Si el inicio de sesión falla, mostramos un mensaje de error
            System.out.println("Inicio de sesión fallido. Verifique las credenciales e inténtelo de nuevo.");
        }
    }

    // Método para mostrar el menú de opciones al usuario
    private static void mostrarMenu(Controller controller) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Iniciar subasta");
            System.out.println("2. Finalizar subasta");
            System.out.println("3. Registrar oferta");
            System.out.println("4. Procesar pago");
            System.out.println("5. Emitir recibo");
            System.out.println("6. Registrar método de pago");
            System.out.println("7. Administrar subastas");
            System.out.println("8. Registrar oferta (Operador)");
            System.out.println("9. Asistir compradores (Operador)");
            System.out.println("10. Supervisar operación completa");
            System.out.println("11. Aprobar inclusión piezas");
            System.out.println("12. Administrar cuentas de usuarios");
            System.out.println("13. Tomar decisiones estratégicas");
            System.out.println("14. Realizar oferta");
            System.out.println("15. Realizar compra");
            System.out.println("16. Registrar pago");
            System.out.println("17. Verificar pago");
            System.out.println("18. Generar recibo");
            System.out.println("19. Salir");

            int opcion = scanner.nextInt();
            List<Subasta> listaDeSubastasActivas = new ArrayList<>();

            switch (opcion) {
                case 1:
                    controller.iniciarSubasta(new Subasta());
                    break;
                case 2:
                    controller.finalizarSubasta(new Subasta());
                    break;
                case 3:
                    // Debes reemplazar "NombreComprador", 1000.0 y 500.0 con valores reales según tu aplicación.
                    controller.registrarOferta(new Subasta(), new Comprador("NombreComprador", 1000.0, 500.0), 100.0f);
                    break;
                case 4:
                    // Suponiendo que Cajero y Pago no requieran parámetros en el constructor, o deberías agregarlos si los necesitan.
                    controller.procesarPago(new Cajero(), new Pago("NombreDelComprador", "Efectivo", 100.0, 1); // Suponiendo que el constructor Pago acepte monto y método de pago
                    break;
                case 5:
                    Cajero cajero = new Cajero();
                    Pago pago = new Pago("NombreDelComprador", "Efectivo", 100.0, 1); // Suponiendo que el constructor Pago acepte monto y método de pago
                    controller.emitirRecibo(cajero, pago);
                    break;
                case 6:
                    // Necesitas asegurarte de que MétodoPago puede ser instanciado sin parámetros o proporcionar los necesarios.
                    controller.registrarMetodoPago(new Cajero(), new MetodoPago("Tarjeta de Crédito")); // Suponiendo que el constructor MetodoPago acepte un String como el tipo de pago
                    break;
                case 7:
                    Operador operador = new Operador("NombreOperador", "RolOperador", listaDeSubastasActivas); // Suponiendo que Operador espera un nombre y rol
                    controller.administrarSubastas(operador);
                    break;
                case 8:
                    Oferta oferta = new Subasta().new Oferta(new Oferta(comprador, 200.0)); // Suponiendo que Oferta es una clase interna de Subasta y espera un Comprador y un monto
                    controller.registrarOferta(new Operador("NombreOperador", "RolOperador", listaDeSubastasActivas), oferta);
                    break;
                case 9:
                    controller.asistirCompradores(new Operador("NombreOperador", "RolOperador", listaDeSubastasActivas), new Comprador("NombreComprador", 1000.0, 500.0));
                    break;
                case 10:
                    controller.supervisarOperacionCompleta(new Administrador("NombreAdministrador", "RolAdministrador"));
                    break;
                case 11:
                    List<Pieza> piezas = new ArrayList<>();
                    piezas.add(new PiezaEspecifica()); // Aquí debes crear una instancia de una subclase concreta de Pieza, ya que Pieza es abstracta
                    controller.aprobarInclusionPiezas(new Administrador("NombreAdministrador", "RolAdministrador"), piezas);
                    break;
                case 12:
                    controller.administrarCuentasUsuarios(new Administrador("NombreAdministrador", "RolAdministrador"));
                    break;
                case 13:
                    controller.tomarDecisionesEstrategicas(new Administrador("NombreAdministrador", "RolAdministrador"));
                    break;
                case 14:
                    Subasta subastaParaOferta = new Subasta();
                    controller.realizarOferta(new Comprador("NombreComprador", 1000.0, 500.0), subastaParaOferta, 300.0f);
                    break;
                case 15:
                	Comprador comprador = new Comprador("NombreDelComprador", 10000.0, 5000.0);
                	List<Pieza> piezasParaComprar = new ArrayList<>();
                    piezasParaComprar.add(new PiezaEspecifica(/* parámetros para el constructor de PiezaEspecifica */));
                    // Asumiendo que PiezaEspecifica es una subclase concreta de Pieza
                    comprador.realizarCompra(piezasParaComprar);
                    break;
                case 16:
                    Pago pagoParaRegistro = new Pago("NombreDelComprador", "Efectivo", 100.0, 1); // Suponiendo que Pago acepta monto y método
                    controller.registrarPago(pagoParaRegistro);
                    break;
                case 17:
                    Pago pagoParaVerificacion = new Pago("NombreDelComprador", "Efectivo", 100.0, 1); // Suponiendo que Pago acepta monto y método
                    controller.verificarPago(pagoParaVerificacion);
                    break;
                case 18:
                    Pago pagoParaRecibo = new Pago("NombreDelComprador", "Efectivo", 100.0, 1); // Suponiendo que Pago acepta monto y método
                    controller.generarRecibo(pagoParaRecibo);
                    break;
                case 19:
                    continuar = false;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del menú.");

            }
        }
    }
}