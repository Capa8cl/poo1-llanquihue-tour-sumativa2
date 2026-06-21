package cl.llanquihuetour.model;

import cl.llanquihuetour.util.TextoVacioException;
import cl.llanquihuetour.util.ValidadorTextos;

/**
 *
 * Representa a la Persona de Llanquihue Tour.
 */
public class Persona {
    private String nombre;
    private String apellido;
    private Rut rut;
    private String telefono;
    private String correo;
    private Direccion direccion;

    /**
     *
     * Constructor de la persona de Llanquihue Tour.
     *
     * @param nombre    Nombre de la persona.
     * @param apellido  Apellido de la persona.
     * @param rut       Rut de la persona.
     * @param telefono  Teléfono de la persona.
     * @param direccion Dirección de la persona.
     * @param correo    Correo electrónico de la persona.
     * @throws TextoVacioException Si alguno de los campos de texto obligatorios viene vacío o null.
     */
    public Persona(String nombre, String apellido, Rut rut, String telefono, Direccion direccion, String correo) throws TextoVacioException {
        if (ValidadorTextos.textoVacio(nombre)) {
            throw TextoVacioException.vacio("El nombre");
        }
        if (ValidadorTextos.textoVacio(apellido)) {
            throw TextoVacioException.vacio("El apellido");
        }
        if (ValidadorTextos.textoVacio(telefono)) {
            throw TextoVacioException.vacio("El teléfono");
        }
        if (ValidadorTextos.textoVacio(correo)) {
            throw TextoVacioException.vacio("El correo");
        }


        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
    }

    /**
     *
     * Muestra la información de la persona.
     *
     * @return Datos de la persona separados por salto de línea.
     */
    public String mostrarPersona() {
        return "Nombre: " + nombre + "\n" + "Apellido: " + apellido + "\n" + "RUT: " + rut + "\n" + "Telefono: " + telefono + "\n" + "Correo: " + correo + "\n" + "Dirección: " + direccion + "\n";
    }

    // Setters y Getters

    /**
     *
     * Obtiene el nombre de la persona.
     *
     * @return Nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * Establece el nombre de la persona.
     *
     * @param nombre Establece nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * Obtiene el apellido de la persona.
     *
     * @return Apellido de la persona.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     *
     * Establece el apellido de la persona.
     *
     * @param apellido Establece apellido.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     *
     * Obtiene el RUT de la persona.
     *
     * @return RUT de la persona.
     */
    public Rut getRut() {
        return rut;
    }

    /**
     *
     * Establece el RUT de la persona.
     *
     * @param rut Establece el RUT.
     */
    public void setRut(Rut rut) {
        this.rut = rut;
    }

    /**
     *
     * Obtiene el teléfono de la persona.
     *
     * @return Teléfono de la persona.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     *
     * Establece el teléfono de la persona.
     *
     * @param telefono Establece teléfono.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     *
     * Obtiene correo de la persona.
     *
     * @return Correo de la persona.
     */
    public String getCorreo() {
        return correo;
    }

    /**
     *
     * Establece correo de la persona.
     *
     * @param correo Establece correo.
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     *
     * Obtiene la dirección de la persona.
     *
     * @return Dirección de la persona.
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     *
     * Establece dirección de la persona.
     *
     * @param direccion Establece dirección.
     */
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" + "Apellido: " + apellido + "\n" + "RUT: " + rut + "\n" + "Telefono: " + telefono + "\n" + "Correo: " + correo + "\n" + "Dirección: " + direccion + "\n";
    }


}
