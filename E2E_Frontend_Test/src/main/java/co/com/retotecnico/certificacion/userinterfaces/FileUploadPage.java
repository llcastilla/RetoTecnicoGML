package co.com.retotecnico.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class FileUploadPage {

    public static final Target LINK_FILE_UPLOAD = Target
            .the("enlace File Upload")
            .locatedBy("//a[.='File Upload']");

    public static final Target INPUT_FILE = Target
            .the("campo para seleccionar archivo")
            .locatedBy("//input[@id='file-upload']");

    public static final Target BTN_UPLOAD = Target
            .the("botón de carga de archivo")
            .locatedBy("//input[@id='file-submit']");

    public static final Target MENSAJE_EXITO = Target
            .the("mensaje de carga exitosa")
            .locatedBy("//h3[.='File Uploaded!']");

    private FileUploadPage() {
    }
}
