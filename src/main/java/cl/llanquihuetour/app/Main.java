package cl.llanquihuetour.app;

import cl.llanquihuetour.service.GestorDatos;

import java.util.Scanner;

/**
 *
 * Sistema de gestión Llanquihue Tour
 *
 * @author Fabrizio Fernandini.
 * @version 1.4
 */
public class Main {

    /**
     *
     * Clase principal del sistema de Llanquihue Tour.
     *
     * @param args Argumentos.
     */
    public static void main(String[] args) {
        int opcion = 0;
        Scanner scanner = new Scanner(System.in);
        GestorDatos gestor = new GestorDatos();

        gestor.cargarTours("tours.csv");

        do {
            System.out.println("---- Sistema Llanquihue Tour ----");
            System.out.println("1.- Listar todos los Tours.");
            System.out.println("2.- Búsqueda Tours por Destino (ciudad).");
            System.out.println("3.- Salir.");
            System.out.print("Selecciona una opcion: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
                switch (opcion) {
                    case 1:
                        System.out.println("\n---- Listado completo de Tours ----");
                        gestor.listarTodosLosTours();
                        break;
                    case 2:
                        System.out.print("Ingrese el destino a buscar (ciudad): ");
                        String destinoBuscado = scanner.nextLine();
                        System.out.println("\n---- Listado Filtrado por Destino ----");
                        gestor.buscarToursPorDestino(destinoBuscado);
                        break;
                    case 3:
                        System.out.println("Finalizando sistema.");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opción no válida, intente nuevamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un número valido.");
            }
            System.out.println();
        } while (opcion != 3);


    }
}