package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.HorizontalSliderPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SendKeys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ARROW_RIGHT;

public class MoverSlider implements Task {

    private final int veces;

    public MoverSlider(int veces) {
        this.veces = veces;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        for (int i = 0; i < veces; i++) {
            actor.attemptsTo(
                    SendKeys.of(ARROW_RIGHT).into(HorizontalSliderPage.SLIDER)
            );
        }
    }

    public static MoverSlider aLaDerecha(int veces) {
        return instrumented(MoverSlider.class, veces);
    }
}
