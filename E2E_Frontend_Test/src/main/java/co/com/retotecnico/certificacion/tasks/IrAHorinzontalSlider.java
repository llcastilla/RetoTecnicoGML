package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.HorizontalSliderPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IrAHorinzontalSlider implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HorizontalSliderPage.LINK_HORIZONTAL_SLIDER)
        );
    }

    public static IrAHorinzontalSlider ahora() {
        return instrumented(IrAHorinzontalSlider.class);
    }
}
