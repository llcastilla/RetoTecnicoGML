package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.ForgotPasswordPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarAForgotPassword implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ForgotPasswordPage.LINK_FORGOT_PASSWORD)
        );
    }

    public static IngresarAForgotPassword ahora() {
        return instrumented(IngresarAForgotPassword.class);
    }
}
