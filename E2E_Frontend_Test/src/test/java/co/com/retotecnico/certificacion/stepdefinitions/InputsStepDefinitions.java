package co.com.retotecnico.certificacion.stepdefinitions;

import co.com.retotecnico.certificacion.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class InputsStepDefinitions {

    private Actor leonardo;

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
        leonardo = OnStage.theActorCalled("Leonardo");
    }

    @When("interactúa con el campo numérico")
    public void interactua_con_el_campo_numerico() {

        leonardo.attemptsTo(
                Open.url("https://the-internet.herokuapp.com/"),
                IrAInputs.ahora(),
                IngresarNumerosAleatorios.veces(10),
                IncrementarConFlecha.veces(10),
                DecrementarConFlecha.veces(10)
        );
    }
}
