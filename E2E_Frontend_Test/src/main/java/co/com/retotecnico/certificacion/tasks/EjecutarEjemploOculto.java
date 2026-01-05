package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.DynamicLoadingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EjecutarEjemploOculto implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DynamicLoadingPage.EJEMPLO_1),
                Click.on(DynamicLoadingPage.BOTON_START),
                WaitUntil.the(DynamicLoadingPage.TEXTO_HELLO_WORLD, isVisible())
        );
    }

    public static EjecutarEjemploOculto ahora() {
        return instrumented(EjecutarEjemploOculto.class);
    }
}
