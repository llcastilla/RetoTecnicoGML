package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.JavaScriptAlertsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarAJavaScriptAlerts implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(JavaScriptAlertsPage.LINK_JAVASCRIPT_ALERTS)
        );
    }

    public static IngresarAJavaScriptAlerts ahora() {
        return instrumented(IngresarAJavaScriptAlerts.class);
    }
}
