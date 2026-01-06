package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.MultipleWindowsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarAMultipleWindows implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MultipleWindowsPage.LINK_MULTIPLE_WINDOWS)
        );
    }

    public static IngresarAMultipleWindows ahora() {
        return instrumented(IngresarAMultipleWindows.class);
    }
}
