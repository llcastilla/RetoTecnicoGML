package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.EntryAdPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CerrarEntryAd implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(EntryAdPage.BOTON_CLOSE, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(EntryAdPage.BOTON_CLOSE)
        );
    }

    public static CerrarEntryAd ahora() {
        return instrumented(CerrarEntryAd.class);
    }
}
