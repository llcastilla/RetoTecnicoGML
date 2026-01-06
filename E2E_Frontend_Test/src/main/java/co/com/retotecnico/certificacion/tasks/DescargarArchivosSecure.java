package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.SecureFileDownloadPage;
import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;


import java.awt.AWTException;
import java.awt.Robot;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DescargarArchivosSecure implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        ListOfWebElementFacades links = SecureFileDownloadPage.ALL_FILES_LINKS.resolveAllFor(actor);

        try {
            Robot bot = new Robot();
            for (int i = 1; i < links.size(); i++) {
                links.get(i).click();
                bot.delay(1000);  // Esperar 1 segundo entre descargas
            }
        } catch (AWTException e) {
            throw new RuntimeException("Error ejecutando Robot para descargar archivos", e);
        }
    }

    public static DescargarArchivosSecure todos() {
        return instrumented(DescargarArchivosSecure.class);
    }
}
