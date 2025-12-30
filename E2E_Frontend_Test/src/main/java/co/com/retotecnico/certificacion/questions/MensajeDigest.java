package co.com.retotecnico.certificacion.questions;

import co.com.retotecnico.certificacion.userinterfaces.DigestAuthPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class MensajeDigest implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return DigestAuthPage.MENSAJE_EXITO.resolveFor(actor).getText();
    }

    public static MensajeDigest esVisible() {
        return new MensajeDigest();
    }
}
