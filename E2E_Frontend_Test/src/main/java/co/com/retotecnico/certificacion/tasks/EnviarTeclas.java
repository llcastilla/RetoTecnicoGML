package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.KeyPressesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actions.SendKeys.of;

public class EnviarTeclas implements Task {

    private final Keys tecla;

    public EnviarTeclas(Keys tecla) {
        this.tecla = tecla;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                of(tecla).into(KeyPressesPage.INPUT_KEY)
        );
    }

    public static EnviarTeclas laTecla(Keys tecla) {
        return instrumented(EnviarTeclas.class, tecla);
    }
}
