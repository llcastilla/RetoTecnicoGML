package co.com.retotecnico.certificacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class VolverAVentanaPrincipal implements Task {

    private final String ventanaPrincipal;

    public VolverAVentanaPrincipal(String ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb.as(actor)
                .getDriver()
                .switchTo()
                .window(ventanaPrincipal);
    }

    public static VolverAVentanaPrincipal conId(String ventanaPrincipal) {
        return instrumented(VolverAVentanaPrincipal.class, ventanaPrincipal);
    }
}
