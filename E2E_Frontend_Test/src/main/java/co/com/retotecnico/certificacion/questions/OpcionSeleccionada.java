package co.com.retotecnico.certificacion.questions;

import co.com.retotecnico.certificacion.userinterfaces.DropdownPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.support.ui.Select;

public class OpcionSeleccionada implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        Select select = new Select(
                DropdownPage.LISTA_DESPLEGABLE.resolveFor(actor)
        );
        return select.getFirstSelectedOption().getText();
    }

    public static OpcionSeleccionada actual() {
        return new OpcionSeleccionada();
    }
}
