package co.com.retotecnico.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AddRemoveElementsPage {

    public static final String URL = "https://the-internet.herokuapp.com/";

    public static final Target LINK_ADD_REMOVE = Target
            .the("enlace Add/Remove Elements")
            .locatedBy("//a[.='Add/Remove Elements']");

    public static final Target BTN_ADD_ELEMENT = Target
            .the("botón Add Element")
            .locatedBy("//button[.='Add Element']");

    public static final Target BTN_DELETE = Target
            .the("botón Delete")
            .locatedBy("//button[.='Delete']");

    private AddRemoveElementsPage() {}
}
