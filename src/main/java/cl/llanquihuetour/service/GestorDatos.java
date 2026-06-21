package cl.llanquihuetour.service;

import cl.llanquihuetour.model.Direccion;
import cl.llanquihuetour.model.Guia;
import cl.llanquihuetour.model.Rut;
import cl.llanquihuetour.model.Tour;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * Clase encargada de la persistencia y carga de datos desde un archivo plano CSV.
 */
public class GestorDatos {

    private List<Tour> listaTours = new ArrayList<>();

    /**
     *
     * Método que recibe la ruta del archivo, separa la información de la línea completa (separador ';') y crea las instancias de los objetos.
     *
     * @param archivoTours Ruta y nombre del archivo de los Tours.
     * @return Lista de Tours.
     */
    public List<Tour> cargarTours(String archivoTours) {

        try (BufferedReader br = new BufferedReader(new FileReader(archivoTours))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                if (linea.trim().isEmpty()) {
                    continue;
                }

                String[] tour = linea.split(";");

                if (tour.length == 15) {
                    try {
                        // Guía
                        Direccion direccionGuia = new Direccion(tour[7], tour[8], tour[9], tour[10]);
                        Rut rutGuia = new Rut(tour[5]);
                        String cargoGuia = tour[13];
                        boolean certificado = Boolean.parseBoolean(tour[14]);

                        Guia guia = new Guia(tour[3], tour[4], rutGuia, tour[6], direccionGuia, tour[11], tour[12], cargoGuia, certificado);

                        // Tour
                        String nombreTour = tour[0];
                        String destinoTour = tour[1];
                        int precioTour = Integer.parseInt(tour[2]);

                        Tour nuevoTour = new Tour(nombreTour, destinoTour, precioTour, guia);

                        // Agregar a lista
                        listaTours.add(nuevoTour);
                    } catch (Exception e) {
                        System.out.println("Línea omitida " + e.getMessage());
                    }

                }
            }
            System.out.println("Carga inicial finalizada del archivo de Tours (" + archivoTours + ").");
            System.out.println("Tours cargados: " + listaTours.size());
            System.out.println("------------------------");

        } catch (Exception e) {
            System.out.println("Error al leer la lista de tours del archivo.\n" + e.getMessage());
        }

        return listaTours;
    }

    /**
     *
     * Método que muestra todos los Tours que se encuentran en la lista (listaTours).
     */
    public void listarTodosLosTours() {
        if (listaTours.isEmpty()) {
            System.out.println("No existen Tours cargados en sistema.");
        } else {
            for (Tour tour : listaTours) {
                System.out.println(tour);
            }
        }
    }

    /**
     *
     * Método que filtra el destino por ciudad buscada y muestra los resultados en consola.
     *
     * @param destinoBuscado Nombre de la ciudad que se desea buscar.
     */
    public void buscarToursPorDestino(String destinoBuscado) {
        String destinoLimpio = destinoBuscado != null ? destinoBuscado.trim() : "";
        boolean encontrado = false;

        for (Tour tour : listaTours) {
            if (tour.getDestino().trim().equalsIgnoreCase(destinoLimpio)) {
                System.out.println(tour);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron Tours en: " + destinoLimpio);
        }

    }

}
