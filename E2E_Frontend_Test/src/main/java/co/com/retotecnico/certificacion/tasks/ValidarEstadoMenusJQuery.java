package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.questions.ElementoHabilitado;
import co.com.retotecnico.certificacion.questions.ElementoVisible;
import co.com.retotecnico.certificacion.userinterfaces.JQueryUiMenusPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

public class ValidarEstadoMenusJQuery implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.should(
                // "Disabled" NO está deshabilitado técnicamente,
                // solo validamos que esté visible
                seeThat(ElementoVisible.para(JQueryUiMenusPage.OPTION_DISABLED), is(true)),

                // "Enabled" sí debe estar habilitado
                seeThat(ElementoHabilitado.para(JQueryUiMenusPage.OPTION_ENABLED), is(true))
        );
    }

    public static ValidarEstadoMenusJQuery ahora() {
        return instrumented(ValidarEstadoMenusJQuery.class);
    }
}
