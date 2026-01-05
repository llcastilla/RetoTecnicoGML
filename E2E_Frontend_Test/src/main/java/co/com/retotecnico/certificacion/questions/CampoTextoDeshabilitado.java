package co.com.retotecnico.certificacion.questions;

import co.com.retotecnico.certificacion.userinterfaces.DynamicControlsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CampoTextoDeshabilitado implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return !DynamicControlsPage.CAMPO_TEXTO
                .resolveFor(actor)
                .isEnabled();
    }

    public static CampoTextoDeshabilitado esVisible() {
        return new CampoTextoDeshabilitado();
    }
}
