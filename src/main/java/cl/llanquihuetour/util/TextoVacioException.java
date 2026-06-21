package cl.llanquihuetour.util;

/**
 *
 * Excepciones personalizadas para la validación del RUT.
 */
public class TextoVacioException extends Exception {

    private static final String MENSAJE_VACIO = " no puede estar vacío(a).";

    /**
     *
     * Consutrye nueva excepción con mensaje personalizado.
     *
     * @param mensaje Detalle del error.
     */
    public TextoVacioException(String mensaje) {
        super(mensaje);
    }

    /**
     *
     * Genera la excepción asociada al nombre del campo.
     *
     * @param campo Nombre del atributo vacío.
     * @return Mensaje personalizado para incluir el atributo seguido de " no puede estar vacío(a).".
     */
    public static TextoVacioException vacio(String campo) {
        return new TextoVacioException(campo + MENSAJE_VACIO);
    }
}
