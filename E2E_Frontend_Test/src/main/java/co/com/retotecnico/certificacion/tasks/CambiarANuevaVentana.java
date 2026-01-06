package co.com.retotecnico.certificacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CambiarANuevaVentana implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        String ventanaActual = BrowseTheWeb.as(actor)
                .getDriver()
                .getWindowHandle();

        for (String ventana : BrowseTheWeb.as(actor).getDriver().getWindowHandles()) {
            if (!ventana.equals(ventanaActual)) {
                BrowseTheWeb.as(actor).getDriver().switchTo().window(ventana);
                break;
            }
        }
    }

    public static CambiarANuevaVentana ahora() {
        return instrumented(CambiarANuevaVentana.class);
    }
}
