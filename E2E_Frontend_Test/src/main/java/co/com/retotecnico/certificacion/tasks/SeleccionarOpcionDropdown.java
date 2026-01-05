package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.DropdownPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarOpcionDropdown implements Task {

    private final String opcion;

    public SeleccionarOpcionDropdown(String opcion) {
        this.opcion = opcion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byVisibleText(opcion)
                        .from(DropdownPage.LISTA_DESPLEGABLE)
        );
    }

    public static SeleccionarOpcionDropdown conTexto(String opcion) {
        return instrumented(SeleccionarOpcionDropdown.class, opcion);
    }
}
