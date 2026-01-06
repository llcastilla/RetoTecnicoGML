package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.RedirectLinkPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarARedirectLink implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RedirectLinkPage.LINK_REDIRECT)
        );
    }

    public static IngresarARedirectLink ahora() {
        return instrumented(IngresarARedirectLink.class);
    }
}
