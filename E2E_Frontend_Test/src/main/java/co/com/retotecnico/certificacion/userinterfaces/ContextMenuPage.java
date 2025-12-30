package co.com.retotecnico.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ContextMenuPage {

    public static final String URL = "https://the-internet.herokuapp.com/";

    public static final Target LINK_CONTEXT_MENU = Target
            .the("enlace Context Menu")
            .locatedBy("//a[.='Context Menu']");

    public static final Target AREA_HOT_SPOT = Target
            .the("área para click derecho")
            .locatedBy("//div[@id='hot-spot']");

    private ContextMenuPage() {}
}
