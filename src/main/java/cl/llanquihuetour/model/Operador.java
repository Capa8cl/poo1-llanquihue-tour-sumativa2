package cl.llanquihuetour.model;

import cl.llanquihuetour.util.TextoVacioException;
import cl.llanquihuetour.util.ValidadorTextos;

/**
 *
 * Representa al Operador de Llanquihue Tour.
 * Heredada de la clase Persona.
 */
public class Operador extends Empleado {
    // Atributo de la clase hija
    private String zonaTrabajo; // Norte, Centro o Sur.

    /**
     *
     * Constructor del Operador de Llanquihue Tour.
     *
     * @param nombre      Nombre del operador.
     * @param apellido    Apellido del operador.
     * @param rut         RUT del operador.
     * @param telefono    Teléfono del operador.
     * @param direccion   Dirección del operador.
     * @param correo      Correo electrónico del operador.
     * @param idEmpleado  Identificador único del operador.
     * @param cargo       Cargo del operador.
     * @param zonaTrabajo Zona geográfica en la que trabaja el operador.
     * @throws TextoVacioException Si alguno de los campos de texto obligatorios viene vacío o null.
     */
    public Operador(String nombre, String apellido, Rut rut, String telefono, Direccion direccion, String correo, String idEmpleado, String cargo, String zonaTrabajo) throws TextoVacioException {
        super(nombre, apellido, rut, telefono, direccion, correo, idEmpleado, cargo);

        if (ValidadorTextos.textoVacio(zonaTrabajo)) {
            throw TextoVacioException.vacio("La zona de trabajo");
        }

        this.zonaTrabajo = zonaTrabajo;
    }

    /**
     *
     * Muestra la información del operador.
     *
     * @return Datos del operador separados por salto de línea.
     */
    public String mostrarOperador() {
        return mostrarEmpleado() + "Zona de Trabajo: " + zonaTrabajo + "\n";
    }

    // Setters y Getters

    /**
     *
     * Muestra la zona de trabajo del operador.
     *
     * @return Zona de trabajo del operador.
     */
    public String getZonaTrabajo() {
        return zonaTrabajo;
    }

    /**
     *
     * Establece la zona de trabajo del operador.
     *
     * @param zonaTrabajo Establece la zona de trabajo del operador.
     */
    public void setZonaTrabajo(String zonaTrabajo) {
        this.zonaTrabajo = zonaTrabajo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nZona de Trabajo: " + zonaTrabajo;
    }
}
