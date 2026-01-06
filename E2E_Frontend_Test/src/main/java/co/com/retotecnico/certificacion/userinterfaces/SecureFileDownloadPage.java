package co.com.retotecnico.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SecureFileDownloadPage {

    public static final String URL = "https://admin:admin@the-internet.herokuapp.com/download_secure";

    public static final Target ALL_FILES_LINKS = Target
            .the("todos los enlaces de descarga")
            .locatedBy("//a");

    private SecureFileDownloadPage() {
        // Evitar instanciación
    }
}
