package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.interactions.ArrastrarYSoltar;
import co.com.retotecnico.certificacion.userinterfaces.DragAndDropPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IntercambiarColumnas implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ArrastrarYSoltar.desdeHasta(
                        DragAndDropPage.COLUMNA_A,
                        DragAndDropPage.COLUMNA_B
                )
        );
    }

    public static IntercambiarColumnas exitosamente() {
        return instrumented(IntercambiarColumnas.class);
    }
}
