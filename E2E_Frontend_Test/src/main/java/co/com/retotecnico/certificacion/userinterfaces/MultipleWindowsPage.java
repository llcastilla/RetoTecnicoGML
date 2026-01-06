package co.com.retotecnico.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MultipleWindowsPage {

    public static final Target LINK_MULTIPLE_WINDOWS = Target
            .the("enlace Multiple Windows")
            .locatedBy("//a[.='Multiple Windows']");

    public static final Target LINK_CLICK_HERE = Target
            .the("enlace Click Here para abrir nueva ventana")
            .locatedBy("//a[.='Click Here']");

    private MultipleWindowsPage() {
    }
}
