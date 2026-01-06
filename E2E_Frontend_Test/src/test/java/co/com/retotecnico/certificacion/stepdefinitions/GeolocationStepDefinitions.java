package co.com.retotecnico.certificacion.stepdefinitions;

import co.com.retotecnico.certificacion.questions.UbicacionVisible;
import co.com.retotecnico.certificacion.tasks.ConsultarUbicacion;
import io.cucumber.java.Before;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

public class GeolocationStepDefinitions {

    private Actor usuario;

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
        usuario = OnStage.theActorCalled("Usuario");
    }

    @When("consulta su ubicación actual")
    public void consulta_su_ubicacion_actual() {

        usuario.attemptsTo(
                Open.url("https://the-internet.herokuapp.com/geolocation"),
                ConsultarUbicacion.ahora()
        );
    }

    @Then("debería visualizar su ubicación en pantalla")
    public void deberia_visualizar_su_ubicacion_en_pantalla() {

        usuario.should(
                seeThat("La ubicación es visible",
                        UbicacionVisible.ahora(),
                        is(true))
        );
    }
}
