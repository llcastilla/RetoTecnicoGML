package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.InputsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SendKeys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ARROW_UP;

public class IncrementarConFlecha implements Task {

    private final int veces;

    public IncrementarConFlecha(int veces) {
        this.veces = veces;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        for (int i = 0; i < veces; i++) {
            actor.attemptsTo(
                    SendKeys.of(ARROW_UP).into(InputsPage.NUMBER_FIELD)
            );
        }
    }

    public static IncrementarConFlecha veces(int veces) {
        return instrumented(IncrementarConFlecha.class, veces);
    }
}
