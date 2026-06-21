package cl.llanquihuetour.model;

import cl.llanquihuetour.util.TextoVacioException;
import cl.llanquihuetour.util.ValidadorTextos;

/**
 *
 * Representa al Empleado de Llanquihue Tour.
 * Heredada de la clase Persona.
 */
public class Empleado extends Persona {
    private String idEmpleado; // Se establece como String para uso por códigos (EJ: OP01, GUI58).
    private String cargo;

    /**
     *
     * Constructor del empleado de Llanquihue Tour.
     *
     * @param nombre     Nombre del empleado.
     * @param apellido   apellido del empleado.
     * @param rut        RUT del empleado.
     * @param telefono   Teléfono del empleado.
     * @param direccion  Dirección del empleado.
     * @param correo     Correo electrónico del empleado.
     * @param idEmpleado Identificador único del empleado.
     * @param cargo      Cargo del empleado.
     * @throws TextoVacioException Si alguno de los campos de texto obligatorios viene vacío o null.
     */
    public Empleado(String nombre, String apellido, Rut rut, String telefono, Direccion direccion, String correo, String idEmpleado, String cargo) throws TextoVacioException {
        super(nombre, apellido, rut, telefono, direccion, correo);

        if (ValidadorTextos.textoVacio(idEmpleado)) {
            throw TextoVacioException.vacio("El ID del empleado");
        }
        if (ValidadorTextos.textoVacio(cargo)) {
            throw TextoVacioException.vacio("El cargo del empleado");
        }

        this.idEmpleado = idEmpleado;
        this.cargo = cargo;
    }

    /**
     *
     * Muestra la información del empleado.
     *
     * @return datos del empleado separados por salto de línea.
     */
    public String mostrarEmpleado() {
        return mostrarPersona() + "ID del Empleado: " + idEmpleado + "\n" + "Cargo: " + cargo;
    }

    // Getters y Setters

    /**
     *
     * Obtiene el identificador único del Empleado.
     *
     * @return Identificador único del Empleado
     */
    public String getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * Establece el identificador único del empleado.
     *
     * @param idEmpleado Establece el identificador único del empleado.
     */
    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    /**
     *
     * Obtiene el cargo del Empleado.
     *
     * @return Cargo del Empleado.
     */
    public String getCargo() {
        return cargo;
    }

    /**
     *
     * Establece el cargo del empleado.
     *
     * @param cargo Cargo del empleado.
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return super.toString() + "ID del Empleado: " + idEmpleado + "\n" + "Cargo: " + cargo;
    }
}
