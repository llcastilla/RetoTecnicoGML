package co.com.retotecnico.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class BasicAuthPage {

    public static final String URL = "https://admin:admin@the-internet.herokuapp.com/basic_auth";

    public static final Target MENSAJE_EXITO = Target
            .the("mensaje de autenticación exitosa")
            .locatedBy("//p[contains(text(),'Congratulations! You must have the proper credentials.')]");

    private BasicAuthPage() {}
}