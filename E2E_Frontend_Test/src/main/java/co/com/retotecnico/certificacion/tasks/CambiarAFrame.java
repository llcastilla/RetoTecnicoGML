package co.com.retotecnico.certificacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CambiarAFrame implements Task {

    private final String[] frames;

    public CambiarAFrame(String[] frames) {
        this.frames = frames;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        WebDriver driver = BrowseTheWeb.as(actor).getDriver();

        driver.switchTo().defaultContent();

        for (String frame : frames) {
            driver.switchTo().frame(frame);
        }
    }

    public static CambiarAFrame jerarquia(String... frames) {
        return instrumented(CambiarAFrame.class, new Object[]{frames});
    }
}
