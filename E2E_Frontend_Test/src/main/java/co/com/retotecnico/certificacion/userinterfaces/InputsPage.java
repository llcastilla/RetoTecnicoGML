package co.com.retotecnico.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class InputsPage {

    public static final Target LINK_INPUTS = Target
            .the("enlace Inputs")
            .locatedBy("//a[.='Inputs']");

    public static final Target NUMBER_FIELD = Target
            .the("campo numérico")
            .locatedBy("//input[@type='number']");
}
