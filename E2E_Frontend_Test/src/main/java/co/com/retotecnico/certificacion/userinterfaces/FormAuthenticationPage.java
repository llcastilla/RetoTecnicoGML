package co.com.retotecnico.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class FormAuthenticationPage {

    public static final Target LINK_FORM_AUTHENTICATION = Target
            .the("enlace Form Authentication")
            .locatedBy("//a[.='Form Authentication']");

    public static final Target INPUT_USERNAME = Target
            .the("campo de usuario")
            .locatedBy("//input[@id='username']");

    public static final Target INPUT_PASSWORD = Target
            .the("campo de contraseña")
            .locatedBy("//input[@id='password']");

    public static final Target BTN_LOGIN = Target
            .the("botón de inicio de sesión")
            .locatedBy("//button[@type='submit']");

    public static final Target BTN_LOGOUT = Target
            .the("botón de cierre de sesión")
            .locatedBy("//i[.=' Logout']");

    public static final Target MENSAJE_LOGIN_EXITOSO = Target
            .the("mensaje de autenticación exitosa")
            .locatedBy("//div[contains(@class,'flash success')]");

    private FormAuthenticationPage() {
    }
}
