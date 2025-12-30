package co.com.retotecnico.certificacion.questions;

import co.com.retotecnico.certificacion.userinterfaces.BasicAuthPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class MensajeAutenticacion implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return BasicAuthPage.MENSAJE_EXITO.resolveFor(actor).getText();
    }

    public static MensajeAutenticacion esVisible() {
        return new MensajeAutenticacion();
    }
}