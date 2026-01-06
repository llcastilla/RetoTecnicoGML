package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.RedirectLinkPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ValidarRedireccion implements Task {

    private final String codigo;

    public ValidarRedireccion(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(RedirectLinkPage.LINK_HERE),
                Click.on(RedirectLinkPage.CODIGO(codigo))
        );
    }

    public static ValidarRedireccion conCodigo(String codigo) {
        return instrumented(ValidarRedireccion.class, codigo);
    }
}
