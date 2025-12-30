package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.InternetHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;



import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarALinkABTesting implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(InternetHomePage.LINK_AB_TESTING)
        );
    }

    public static IngresarALinkABTesting ahora() {
        return instrumented(IngresarALinkABTesting.class);
    }
}