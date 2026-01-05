package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.FileDownloadPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarAFileDownload implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FileDownloadPage.LINK_FILE_DOWNLOAD)
        );
    }

    public static IngresarAFileDownload ahora() {
        return instrumented(IngresarAFileDownload.class);
    }
}
