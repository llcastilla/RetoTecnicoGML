package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.NotificationMessagesPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ReintentarHastaVerMensaje implements Task {

    private final String mensajeEsperado;
    private final int intentosMaximos;

    public ReintentarHastaVerMensaje(String mensajeEsperado, int intentosMaximos) {
        this.mensajeEsperado = mensajeEsperado;
        this.intentosMaximos = intentosMaximos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        var driver = BrowseTheWeb.as(actor).getDriver();

        for (int i = 0; i < intentosMaximos; i++) {

            actor.attemptsTo(
                    net.serenitybdd.screenplay.actions.Click.on(
                            NotificationMessagesPage.BOTON_CLICK_HERE
                    )
            );

            WebElementFacade mensaje = NotificationMessagesPage.MENSAJE_NOTIFICACION
                    .resolveFor(actor);

            if (mensaje.getText().contains(mensajeEsperado)) {
                break;
            }
        }
    }

    public static ReintentarHastaVerMensaje conTexto(String mensaje, int intentos) {
        return instrumented(ReintentarHastaVerMensaje.class, mensaje, intentos);
    }
}
