package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.FormAuthenticationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Autenticarse implements Task {

    private final String usuario;
    private final String contrasena;

    public Autenticarse(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(usuario).into(FormAuthenticationPage.INPUT_USERNAME),
                Enter.theValue(contrasena).into(FormAuthenticationPage.INPUT_PASSWORD),
                Click.on(FormAuthenticationPage.BTN_LOGIN)
        );
    }

    public static Autenticarse conCredenciales(String usuario, String contrasena) {
        return instrumented(Autenticarse.class, usuario, contrasena);
    }
}
