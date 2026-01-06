package co.com.retotecnico.certificacion.questions;

import co.com.retotecnico.certificacion.userinterfaces.RedirectLinkPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class MensajeRedireccion implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return RedirectLinkPage.MENSAJE_RESULTADO
                .resolveFor(actor)
                .getText();
    }

    public static MensajeRedireccion es() {
        return new MensajeRedireccion();
    }
}
