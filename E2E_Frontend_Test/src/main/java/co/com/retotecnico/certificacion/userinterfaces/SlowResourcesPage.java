package co.com.retotecnico.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SlowResourcesPage {

    public static final String URL = "https://the-internet.herokuapp.com/";

    public static final Target LINK_SLOW_RESOURCES = Target
            .the("enlace Slow Resources")
            .locatedBy("//a[.='Slow Resources']");

    public static final Target TITULO_SLOW_RESOURCES = Target
            .the("título Slow Resources")
            .locatedBy("//h3[.='Slow Resources']");

    private SlowResourcesPage() {
        // Evitar instanciación
    }
}
