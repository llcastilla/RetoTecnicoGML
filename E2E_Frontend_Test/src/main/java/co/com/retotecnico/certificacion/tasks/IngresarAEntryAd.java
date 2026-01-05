package co.com.retotecnico.certificacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.retotecnico.certificacion.userinterfaces.EntryAdPage.LINK_ENTRY_AD;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarAEntryAd implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LINK_ENTRY_AD)
        );
    }

    public static IngresarAEntryAd ahora() {
        return instrumented(IngresarAEntryAd.class);
    }
}
