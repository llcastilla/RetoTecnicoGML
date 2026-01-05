package co.com.retotecnico.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DropdownPage {

    public static final Target LINK_DROPDOWN = Target
            .the("enlace Dropdown")
            .locatedBy("//a[.='Dropdown']");

    public static final Target LISTA_DESPLEGABLE = Target
            .the("lista desplegable")
            .locatedBy("//select[@id='dropdown']");

    private DropdownPage() {
    }
}
