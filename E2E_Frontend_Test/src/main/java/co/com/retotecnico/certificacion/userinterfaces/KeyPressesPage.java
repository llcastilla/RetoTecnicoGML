package co.com.retotecnico.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class KeyPressesPage {

    public static final Target LINK_KEY_PRESSES = Target
            .the("enlace Key Presses")
            .locatedBy("//a[.='Key Presses']");

    public static final Target INPUT_KEY = Target
            .the("campo para ingresar teclas")
            .locatedBy("//input[@id='target']");

    public static final Target RESULTADO = Target
            .the("resultado de la tecla presionada")
            .locatedBy("//p[@id='result']");

    private KeyPressesPage() {
    }
}
