package co.com.retotecnico.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class FileDownloadPage {

    public static final Target LINK_FILE_DOWNLOAD = Target
            .the("enlace File Download")
            .locatedBy("//a[.='File Download']");

    public static final Target LINKS_ARCHIVOS = Target
            .the("lista de archivos disponibles para descarga")
            .locatedBy("//div[@class='example']//a");

    private FileDownloadPage() {
    }
}
