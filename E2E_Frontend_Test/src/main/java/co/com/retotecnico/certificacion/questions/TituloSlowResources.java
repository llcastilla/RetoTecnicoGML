package co.com.retotecnico.certificacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import co.com.retotecnico.certificacion.userinterfaces.SlowResourcesPage;

public class TituloSlowResources implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(SlowResourcesPage.TITULO_SLOW_RESOURCES).answeredBy(actor).toString();
    }

    public static TituloSlowResources es() {
        return new TituloSlowResources();
    }
}
