package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.KeyPressesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarAKeyPresses implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(KeyPressesPage.LINK_KEY_PRESSES)
        );
    }

    public static IngresarAKeyPresses ahora() {
        return instrumented(IngresarAKeyPresses.class);
    }
}
