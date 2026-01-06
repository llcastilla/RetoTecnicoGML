package co.com.retotecnico.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class FloatingMenuPage {

    public static final Target LINK_FLOATING_MENU = Target
            .the("enlace Floating Menu")
            .locatedBy("//a[.='Floating Menu']");

    public static final Target NAVBAR = Target
            .the("menú de navegación flotante")
            .locatedBy("//div[@id='menu']");

    private FloatingMenuPage() {
    }
}
