package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.FloatingMenuPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarAFloatingMenu implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FloatingMenuPage.LINK_FLOATING_MENU)
        );
    }

    public static IngresarAFloatingMenu ahora() {
        return instrumented(IngresarAFloatingMenu.class);
    }
}
