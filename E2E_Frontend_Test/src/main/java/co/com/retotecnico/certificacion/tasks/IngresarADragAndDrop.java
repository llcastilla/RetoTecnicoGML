package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.DragAndDropPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarADragAndDrop implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DragAndDropPage.LINK_DRAG_AND_DROP)
        );
    }

    public static IngresarADragAndDrop ahora() {
        return instrumented(IngresarADragAndDrop.class);
    }
}
