package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.JQueryUiMenusPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IrAJQueryUiMenus implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(JQueryUiMenusPage.LINK_JQUERY_UI_MENUS)
        );
    }

    public static IrAJQueryUiMenus ahora() {
        return instrumented(IrAJQueryUiMenus.class);
    }
}
