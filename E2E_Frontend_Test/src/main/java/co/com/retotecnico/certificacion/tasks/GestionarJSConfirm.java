package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.JavaScriptAlertsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GestionarJSConfirm implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(JavaScriptAlertsPage.BTN_JS_CONFIRM),
                Switch.toAlert().andAccept(),

                Click.on(JavaScriptAlertsPage.BTN_JS_CONFIRM),
                Switch.toAlert().andDismiss()
        );
    }

    public static GestionarJSConfirm completo() {
        return instrumented(GestionarJSConfirm.class);
    }
}
