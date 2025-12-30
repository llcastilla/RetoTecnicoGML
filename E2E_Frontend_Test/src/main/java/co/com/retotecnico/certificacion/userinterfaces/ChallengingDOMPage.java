package co.com.retotecnico.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ChallengingDOMPage {

    public static final String URL = "https://the-internet.herokuapp.com/";

    public static final Target LINK_CHALLENGING_DOM = Target
            .the("enlace Challenging DOM")
            .locatedBy("//a[.='Challenging DOM']");

    public static final Target BTN_DEFAULT = Target
            .the("botón default")
            .locatedBy("//a[@class='button']");

    public static final Target BTN_ALERT = Target
            .the("botón alert")
            .locatedBy("//a[@class='button alert']");

    public static final Target BTN_SUCCESS = Target
            .the("botón success")
            .locatedBy("//a[@class='button success']");

    private ChallengingDOMPage() {}
}
