package co.com.retotecnico.certificacion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ArrastrarYSoltar implements Interaction {

    private final Target origen;
    private final Target destino;

    public ArrastrarYSoltar(Target origen, Target destino) {
        this.origen = origen;
        this.destino = destino;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();

        Actions actions = new Actions(driver);
        actions
                .clickAndHold(origen.resolveFor(actor))
                .moveToElement(destino.resolveFor(actor))
                .release()
                .build()
                .perform();
    }

    public static ArrastrarYSoltar desdeHasta(Target origen, Target destino) {
        return instrumented(ArrastrarYSoltar.class, origen, destino);
    }
}
