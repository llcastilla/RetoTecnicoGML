package co.com.retotecnico.certificacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class TextoFrameActual implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor)
                .getDriver()
                .findElement(org.openqa.selenium.By.tagName("body"))
                .getText();
    }

    public static TextoFrameActual es() {
        return new TextoFrameActual();
    }
}
