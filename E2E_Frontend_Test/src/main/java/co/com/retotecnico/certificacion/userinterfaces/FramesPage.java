package co.com.retotecnico.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class FramesPage {

    public static final Target LINK_FRAMES = Target
            .the("enlace Frames")
            .locatedBy("//a[.='Frames']");

    public static final Target LINK_IFRAME = Target
            .the("enlace iFrame")
            .locatedBy("//a[.='iFrame']");

    public static final Target IFRAME_EDITOR = Target
            .the("iframe del editor")
            .locatedBy("//iframe[@id='mce_0_ifr']");

    public static final Target BTN_CERRAR_NOTIFICACION = Target
            .the("botón para cerrar notificación de TinyMCE")
            .locatedBy("//button[contains(@class,'tox-notification__dismiss')]");

    public static final Target EDITOR_BODY = Target
            .the("cuerpo del editor")
            .locatedBy("//body[@id='tinymce']");

    private FramesPage() {
    }
}
