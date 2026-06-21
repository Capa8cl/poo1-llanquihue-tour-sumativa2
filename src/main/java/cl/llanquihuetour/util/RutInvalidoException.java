package cl.llanquihuetour.util;

/**
 *
 * Excepciones personalizadas para la validación del RUT.
 */
public class RutInvalidoException extends Exception {

    private static final String MENSAJE_INVALIDO = "El RUT no es válido.";

    /**
     * Consutrye nueva excepción con mensaje personalizado.
     *
     * @param mensaje Detalle del error.
     */
    public RutInvalidoException(String mensaje) {
        super(mensaje);
    }

    /**
     *
     * Excepción de RUT no válido.
     *
     * @return Mensaje de RUT no válido (El RUT no es válido.).
     */
    public static RutInvalidoException invalido() {
        return new RutInvalidoException(MENSAJE_INVALIDO);
    }

}
