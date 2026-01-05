package co.com.retotecnico.certificacion.questions;

import co.com.retotecnico.certificacion.userinterfaces.DynamicContentPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ContenidoDinamico implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return DynamicContentPage.CONTENIDO_DINAMICO
                .resolveFor(actor)
                .getText();
    }

    public static ContenidoDinamico actual() {
        return new ContenidoDinamico();
    }
}
