package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.StatusCodesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class VerificarStatusCodes implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        String[] codigos = {"200", "301", "404", "500"};

        for (String codigo : codigos) {
            switch (codigo) {
                case "200":
                    actor.attemptsTo(Click.on(StatusCodesPage.LINK_200));
                    break;
                case "301":
                    actor.attemptsTo(Click.on(StatusCodesPage.LINK_301));
                    break;
                case "404":
                    actor.attemptsTo(Click.on(StatusCodesPage.LINK_404));
                    break;
                case "500":
                    actor.attemptsTo(Click.on(StatusCodesPage.LINK_500));
                    break;
                default:
                    throw new IllegalArgumentException("Código no soportado: " + codigo);
            }

            actor.attemptsTo(
                    Ensure.that(StatusCodesPage.MENSAJE_STATUS(codigo)).isDisplayed(),
                    Click.on(StatusCodesPage.LINK_HERE)  // Regresar a la página principal de Status Codes
            );
        }
    }
    public static VerificarStatusCodes todos() {
        return instrumented(VerificarStatusCodes.class);
    }
}