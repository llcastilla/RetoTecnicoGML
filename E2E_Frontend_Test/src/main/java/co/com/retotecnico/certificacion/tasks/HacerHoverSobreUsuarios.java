package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.HoversPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.MoveMouse;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class HacerHoverSobreUsuarios implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        int cantidad = HoversPage.AVATARS.resolveAllFor(actor).size();

        for (int i = 0; i < cantidad; i++) {
            actor.attemptsTo(
                    MoveMouse.to(HoversPage.AVATARS.resolveAllFor(actor).get(i))
            );
        }
    }

    public static HacerHoverSobreUsuarios ahora() {
        return instrumented(HacerHoverSobreUsuarios.class);
    }
}
