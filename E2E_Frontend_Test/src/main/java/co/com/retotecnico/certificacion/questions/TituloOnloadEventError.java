package co.com.retotecnico.certificacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class TituloOnloadEventError implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor)
                .getDriver()
                .getTitle();
    }

    public static TituloOnloadEventError es() {
        return new TituloOnloadEventError();
    }
}
