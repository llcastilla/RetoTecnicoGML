package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.ContextMenuPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class InteractuarContextMenu implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        // Abrir la página principal
        actor.attemptsTo(Open.url(ContextMenuPage.URL));

        // Ingresar a Context Menu
        actor.attemptsTo(net.serenitybdd.screenplay.actions.Click.on(ContextMenuPage.LINK_CONTEXT_MENU));

        // Obtener el driver
        WebDriver driver = net.serenitybdd.screenplay.abilities.BrowseTheWeb.as(actor).getDriver();

        // Obtener el WebElementFacade directamente
        var elemento = ContextMenuPage.AREA_HOT_SPOT.resolveFor(actor);

        // Acción de click derecho
        Actions acciones = new Actions(driver);
        acciones.moveToElement(elemento)
                .contextClick()
                .perform();

        // Manejo del alert
        Alert popup = driver.switchTo().alert();
        popup.accept();
    }

    public static InteractuarContextMenu ahora() {
        return instrumented(InteractuarContextMenu.class);
    }
}
