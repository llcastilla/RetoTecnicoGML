package co.com.retotecnico.certificacion.stepdefinitions;

import co.com.retotecnico.certificacion.tasks.HacerHoverSobreUsuarios;
import co.com.retotecnico.certificacion.tasks.IrAHovers;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class HoversStepDefinitions {

    private Actor leonardo;

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
        leonardo = OnStage.theActorCalled("Leonardo");
    }

    @Cuando("visualiza la información de los usuarios al pasar el mouse")
    public void visualiza_la_informacion_de_los_usuarios_al_pasar_el_mouse() {

        leonardo.attemptsTo(
                Open.url("https://the-internet.herokuapp.com/"),
                IrAHovers.ahora(),
                HacerHoverSobreUsuarios.ahora()
        );
    }
}
