package co.com.retotecnico.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DynamicLoadingPage {

    public static final Target LINK_DYNAMIC_LOADING = Target
            .the("enlace Dynamic Loading")
            .locatedBy("//a[.='Dynamic Loading']");

    public static final Target EJEMPLO_1 = Target
            .the("ejemplo 1 carga dinámica")
            .locatedBy("//a[.='Example 1: Element on page that is hidden']");

    public static final Target EJEMPLO_2 = Target
            .the("ejemplo 2 carga dinámica")
            .locatedBy("//a[.='Example 2: Element rendered after the fact']");

    public static final Target BOTON_START = Target
            .the("botón Start")
            .locatedBy("//button[.='Start']");

    public static final Target TEXTO_HELLO_WORLD = Target
            .the("texto Hello World")
            .locatedBy("//h4[.='Hello World!']");


    public static final String URL =
            "https://the-internet.herokuapp.com/dynamic_loading";

    private DynamicLoadingPage() {
    }
}
