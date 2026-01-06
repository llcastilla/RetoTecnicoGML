package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.MultipleWindowsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirNuevaVentana implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MultipleWindowsPage.LINK_CLICK_HERE)
        );
    }

    public static AbrirNuevaVentana ahora() {
        return instrumented(AbrirNuevaVentana.class);
    }
}
