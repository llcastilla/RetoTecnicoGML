package co.com.retotecnico.certificacion.questions;

import co.com.retotecnico.certificacion.userinterfaces.DynamicLoadingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class MensajeHelloWorld implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return DynamicLoadingPage.TEXTO_HELLO_WORLD
                .resolveFor(actor)
                .getText();
    }

    public static MensajeHelloWorld visible() {
        return new MensajeHelloWorld();
    }
}
