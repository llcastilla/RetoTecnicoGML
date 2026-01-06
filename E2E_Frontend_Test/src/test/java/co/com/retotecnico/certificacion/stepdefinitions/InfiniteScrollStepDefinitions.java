package co.com.retotecnico.certificacion.stepdefinitions;

import co.com.retotecnico.certificacion.tasks.HacerScrollInfinito;
import co.com.retotecnico.certificacion.tasks.IrAInfiniteScroll;
import io.cucumber.java.Before;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class InfiniteScrollStepDefinitions {

    private Actor leonardo;

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
        leonardo = OnStage.theActorCalled("Leonardo");
    }

    @When("realiza desplazamiento continuo en la página")
    public void realiza_desplazamiento_continuo_en_la_pagina() {

        leonardo.attemptsTo(
                Open.url("https://the-internet.herokuapp.com/"),
                IrAInfiniteScroll.ahora(),
                HacerScrollInfinito.veces(15)
        );
    }
}
