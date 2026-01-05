package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.FileDownloadPage;
import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;


import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actions.Click.on;

public class DescargarTodosLosArchivos implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        ListOfWebElementFacades archivos = FileDownloadPage.LINKS_ARCHIVOS.resolveAllFor(actor);

        for (WebElementFacade archivo : archivos) {
            actor.attemptsTo(
                    on(archivo)
            );
        }
    }

    public static DescargarTodosLosArchivos disponibles() {
        return instrumented(DescargarTodosLosArchivos.class);
    }
}
