package co.com.retotecnico.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DynamicControlsPage {

    public static final Target LINK_DYNAMIC_CONTROLS = Target
            .the("enlace Dynamic Controls")
            .locatedBy("//a[.='Dynamic Controls']");

    public static final Target CHECKBOX = Target
            .the("checkbox dinámico")
            .locatedBy("//input[@type='checkbox']");

    public static final Target BOTON_REMOVE = Target
            .the("botón Remove")
            .locatedBy("//button[.='Remove']");

    public static final Target BOTON_ADD = Target
            .the("botón Add")
            .locatedBy("//button[.='Add']");

    public static final Target BOTON_ENABLE = Target
            .the("botón Enable")
            .locatedBy("//button[.='Enable']");

    public static final Target BOTON_DISABLE = Target
            .the("botón Disable")
            .locatedBy("//button[.='Disable']");

    public static final Target CAMPO_TEXTO = Target
            .the("campo de texto")
            .locatedBy("//input[@type='text']");

    private DynamicControlsPage() {
    }
}
