package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.DynamicContentPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarADynamicContent implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DynamicContentPage.LINK_DYNAMIC_CONTENT)
        );
    }

    public static IngresarADynamicContent ahora() {
        return instrumented(IngresarADynamicContent.class);
    }
}
