package co.com.retotecnico.certificacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.JavascriptExecutor;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class HacerScrollInfinito implements Task {

    private final int veces;

    public HacerScrollInfinito(int veces) {
        this.veces = veces;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        JavascriptExecutor js =
                (JavascriptExecutor) BrowseTheWeb.as(actor).getDriver();

        for (int i = 0; i < veces; i++) {
            js.executeScript("window.scrollBy(0,1000);");
        }
    }

    public static HacerScrollInfinito veces(int veces) {
        return instrumented(HacerScrollInfinito.class, veces);
    }
}
