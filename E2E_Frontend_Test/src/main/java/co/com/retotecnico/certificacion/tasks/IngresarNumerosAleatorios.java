package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.InputsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Random;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarNumerosAleatorios implements Task {

    private final int veces;

    public IngresarNumerosAleatorios(int veces) {
        this.veces = veces;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        Random rand = new Random();

        for (int i = 0; i < veces; i++) {
            int valor = rand.nextInt(90) + 10;

            actor.attemptsTo(
                    Clear.field(InputsPage.NUMBER_FIELD),
                    Enter.theValue(String.valueOf(valor))
                            .into(InputsPage.NUMBER_FIELD)
            );
        }
    }

    public static IngresarNumerosAleatorios veces(int veces) {
        return instrumented(IngresarNumerosAleatorios.class, veces);
    }
}
