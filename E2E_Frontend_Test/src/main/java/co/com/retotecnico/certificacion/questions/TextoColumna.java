package co.com.retotecnico.certificacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class TextoColumna implements Question<String> {

    private final Target columna;

    public TextoColumna(Target columna) {
        this.columna = columna;
    }

    @Override
    public String answeredBy(Actor actor) {
        return columna.resolveFor(actor).getText();
    }

    public static TextoColumna de(Target columna) {
        return new TextoColumna(columna);
    }
}
