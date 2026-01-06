package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.SlowResourcesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarSlowResources implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SlowResourcesPage.LINK_SLOW_RESOURCES)
        );
    }

    public static IngresarSlowResources ahora() {
        return instrumented(IngresarSlowResources.class);
    }
}
