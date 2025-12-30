package co.com.retotecnico.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class InternetHomePage {



    public static final Target LINK_AB_TESTING = Target
            .the("enlace A/B Testing")
            .locatedBy("//a[.='A/B Testing']");

    public static final String URL = "https://the-internet.herokuapp.com/";

    private InternetHomePage() {

    }
}
