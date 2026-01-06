package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.InputsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SendKeys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ARROW_DOWN;

public class DecrementarConFlecha implements Task {

    private final int veces;

    public DecrementarConFlecha(int veces) {
        this.veces = veces;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        for (int i = 0; i < veces; i++) {
            actor.attemptsTo(
                    SendKeys.of(ARROW_DOWN).into(InputsPage.NUMBER_FIELD)
            );
        }
    }

    public static DecrementarConFlecha veces(int veces) {
        return instrumented(DecrementarConFlecha.class, veces);
    }
}
