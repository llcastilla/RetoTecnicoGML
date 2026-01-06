package co.com.retotecnico.certificacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.By;

public class MensajeResultado implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor)
                .find(By.id("result"))
                .getText();
    }

    public static MensajeResultado mostrado() {
        return new MensajeResultado();
    }
}
