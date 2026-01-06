package co.com.retotecnico.certificacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ElementoVisible implements Question<Boolean> {

    private final Target elemento;

    private ElementoVisible(Target elemento) {
        this.elemento = elemento;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return elemento.resolveFor(actor).isVisible();
    }

    public static ElementoVisible para(Target elemento) {
        return new ElementoVisible(elemento);
    }
}
