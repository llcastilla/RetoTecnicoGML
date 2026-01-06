package co.com.retotecnico.certificacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ElementoHabilitado implements Question<Boolean> {

    private final Target elemento;

    private ElementoHabilitado(Target elemento) {
        this.elemento = elemento;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return elemento.resolveFor(actor).isEnabled();
    }

    public static ElementoHabilitado para(Target elemento) {
        return new ElementoHabilitado(elemento);
    }
}
