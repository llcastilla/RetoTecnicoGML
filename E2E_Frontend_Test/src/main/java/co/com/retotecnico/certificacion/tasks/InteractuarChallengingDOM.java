package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.ChallengingDOMPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class InteractuarChallengingDOM implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        // Abrir la página principal
        actor.attemptsTo(Open.url(ChallengingDOMPage.URL));

        // Ingresar a Challenging DOM
        actor.attemptsTo(Click.on(ChallengingDOMPage.LINK_CHALLENGING_DOM));

        // Interactuar con los botones
        try {
            actor.attemptsTo(
                    Click.on(ChallengingDOMPage.BTN_DEFAULT),
                    Click.on(ChallengingDOMPage.BTN_ALERT),
                    Click.on(ChallengingDOMPage.BTN_SUCCESS)
            );
        } catch (Exception e) {
            System.out.println("Error interactuando con los botones: " + e.getMessage());
        }
    }

    public static InteractuarChallengingDOM ahora() {
        return instrumented(InteractuarChallengingDOM.class);
    }
}
