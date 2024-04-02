package com.mycompany.usoarchivos.memoria.backend;

import com.mycompany.usoarchivos.memoria.excepciones.MostrarInfoExcepcion;
import com.mycompany.usoarchivos.memoria.interfaces.MostrarInfo;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;

/**
 *
 * @author saien
 */
public class About implements MostrarInfo {

    private final String PATH_ARCHIVE_RELATIVE = "src/main/java/com/mycompany/usoarchivos/memoria/documentos/Acerca de.pdf";
    File file = new File(PATH_ARCHIVE_RELATIVE);

    @Override
    public void mostrarInformacion() throws MostrarInfoExcepcion {
        try {
            if (file.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file);
                }
            }
        } catch (IOException e) {
            throw new MostrarInfoExcepcion("El archivo no se ha podido abrir");
        }
    }

}
