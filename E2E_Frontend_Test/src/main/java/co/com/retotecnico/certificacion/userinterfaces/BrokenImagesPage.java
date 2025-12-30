package co.com.retotecnico.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class BrokenImagesPage {

    public static final String URL = "https://the-internet.herokuapp.com/";

    public static final Target LINK_BROKEN_IMAGES = Target
            .the("enlace Broken Images")
            .locatedBy("//a[.='Broken Images']");

    public static final Target IMAGENES = Target
            .the("lista de imágenes en la página")
            .locatedBy("//img");

    private BrokenImagesPage() {}
}
