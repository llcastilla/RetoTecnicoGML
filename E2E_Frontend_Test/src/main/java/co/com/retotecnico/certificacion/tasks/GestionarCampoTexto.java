package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.DynamicControlsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class GestionarCampoTexto implements Task {

    private final String texto;

    public GestionarCampoTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DynamicControlsPage.BOTON_ENABLE),
                WaitUntil.the(DynamicControlsPage.CAMPO_TEXTO, isEnabled()),
                Enter.theValue(texto).into(DynamicControlsPage.CAMPO_TEXTO),
                Click.on(DynamicControlsPage.BOTON_DISABLE),
                WaitUntil.the(DynamicControlsPage.CAMPO_TEXTO, isNotEnabled())
        );
    }

    public static GestionarCampoTexto conTexto(String texto) {
        return instrumented(GestionarCampoTexto.class, texto);
    }
}
