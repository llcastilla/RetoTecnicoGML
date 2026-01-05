package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.DynamicLoadingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarADynamicLoading implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DynamicLoadingPage.LINK_DYNAMIC_LOADING)
        );
    }

    public static IngresarADynamicLoading ahora() {
        return instrumented(IngresarADynamicLoading.class);
    }
}
