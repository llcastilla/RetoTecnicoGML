package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.ForgotPasswordPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SolicitarRecuperacionContrasena implements Task {

    private final String correo;

    public SolicitarRecuperacionContrasena(String correo) {
        this.correo = correo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(correo).into(ForgotPasswordPage.INPUT_EMAIL),
                Click.on(ForgotPasswordPage.BTN_RETRIEVE_PASSWORD)
        );
    }

    public static SolicitarRecuperacionContrasena conCorreo(String correo) {
        return instrumented(SolicitarRecuperacionContrasena.class, correo);
    }
}
