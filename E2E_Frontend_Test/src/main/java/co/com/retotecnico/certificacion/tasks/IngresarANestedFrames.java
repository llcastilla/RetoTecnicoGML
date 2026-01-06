package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.NestedFramesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarANestedFrames implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(NestedFramesPage.LINK_NESTED_FRAMES)
        );
    }

    public static IngresarANestedFrames ahora() {
        return instrumented(IngresarANestedFrames.class);
    }
}
