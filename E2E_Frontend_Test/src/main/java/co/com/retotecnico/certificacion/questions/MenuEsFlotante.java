package co.com.retotecnico.certificacion.questions;

import co.com.retotecnico.certificacion.userinterfaces.FloatingMenuPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class MenuEsFlotante implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String posicion = FloatingMenuPage.NAVBAR
                .resolveFor(actor)
                .getCssValue("position");

        return "fixed".equalsIgnoreCase(posicion);
    }

    public static MenuEsFlotante ahora() {
        return new MenuEsFlotante();
    }
}
