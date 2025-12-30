package co.com.retotecnico.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CheckboxesPage {

    public static final String URL = "https://the-internet.herokuapp.com/";

    public static final Target LINK_CHECKBOXES = Target
            .the("enlace Checkboxes")
            .locatedBy("//a[.='Checkboxes']");

    public static final Target CHECKBOXES = Target
            .the("lista de checkboxes en la página")
            .locatedBy("//input[@type='checkbox']");

    private CheckboxesPage() {}
}
