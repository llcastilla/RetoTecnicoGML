package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.CheckboxesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarCheckboxes implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        // Abrir página principal
        actor.attemptsTo(Open.url(CheckboxesPage.URL));

        // Ingresar a Checkboxes
        actor.attemptsTo(Click.on(CheckboxesPage.LINK_CHECKBOXES));

        // Seleccionar todos los checkboxes
        CheckboxesPage.CHECKBOXES.resolveAllFor(actor)
                .forEach(checkbox -> actor.attemptsTo(Click.on(CheckboxesPage.CHECKBOXES)));
    }

    public static SeleccionarCheckboxes todos() {
        return instrumented(SeleccionarCheckboxes.class);
    }
}