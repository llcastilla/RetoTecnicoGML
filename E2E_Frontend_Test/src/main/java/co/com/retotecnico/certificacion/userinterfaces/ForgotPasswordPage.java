package co.com.retotecnico.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ForgotPasswordPage {

    public static final Target LINK_FORGOT_PASSWORD = Target
            .the("enlace Forgot Password")
            .locatedBy("//a[.='Forgot Password']");

    public static final Target INPUT_EMAIL = Target
            .the("campo de correo electrónico")
            .locatedBy("//input[@id='email']");

    public static final Target BTN_RETRIEVE_PASSWORD = Target
            .the("botón Retrieve Password")
            .locatedBy("//i[.='Retrieve password']");

    public static final Target MENSAJE_CONFIRMACION = Target
            .the("mensaje de confirmación de envío")
            .locatedBy("//h1 | //h2 | //h3");

    private ForgotPasswordPage() {
    }
}
