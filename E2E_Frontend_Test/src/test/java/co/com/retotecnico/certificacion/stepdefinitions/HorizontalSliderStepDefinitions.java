package co.com.retotecnico.certificacion.stepdefinitions;

import co.com.retotecnico.certificacion.tasks.IrAHorinzontalSlider;
import co.com.retotecnico.certificacion.tasks.MoverSlider;
import io.cucumber.java.Before;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class HorizontalSliderStepDefinitions {

    private Actor leonardo;

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
        leonardo = OnStage.theActorCalled("Leonardo");
    }

    @When("ajusta el control deslizante horizontal")
    public void ajusta_el_control_deslizante_horizontal() {

        leonardo.attemptsTo(
                Open.url("https://the-internet.herokuapp.com/"),
                IrAHorinzontalSlider.ahora(),
                MoverSlider.aLaDerecha(10)
        );
    }
}
