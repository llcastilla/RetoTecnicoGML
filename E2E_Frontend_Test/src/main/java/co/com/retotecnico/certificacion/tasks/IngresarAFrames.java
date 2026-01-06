package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.FramesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarAFrames implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FramesPage.LINK_FRAMES),
                Click.on(FramesPage.LINK_IFRAME)
        );
    }

    public static IngresarAFrames ahora() {
        return instrumented(IngresarAFrames.class);
    }
}
