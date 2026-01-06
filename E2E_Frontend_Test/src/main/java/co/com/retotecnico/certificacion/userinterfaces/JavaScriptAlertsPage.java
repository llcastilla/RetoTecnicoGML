package co.com.retotecnico.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class JavaScriptAlertsPage {

    public static final Target LINK_JAVASCRIPT_ALERTS = Target
            .the("enlace JavaScript Alerts")
            .locatedBy("//a[.='JavaScript Alerts']");

    public static final Target BTN_JS_ALERT = Target
            .the("botón JS Alert")
            .locatedBy("//button[.='Click for JS Alert']");

    public static final Target BTN_JS_CONFIRM = Target
            .the("botón JS Confirm")
            .locatedBy("//button[.='Click for JS Confirm']");

    public static final Target BTN_JS_PROMPT = Target
            .the("botón JS Prompt")
            .locatedBy("//button[.='Click for JS Prompt']");

    private JavaScriptAlertsPage() {
    }
}
