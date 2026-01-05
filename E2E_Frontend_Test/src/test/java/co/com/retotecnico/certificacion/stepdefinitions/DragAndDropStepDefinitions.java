package co.com.retotecnico.certificacion.stepdefinitions;

import co.com.retotecnico.certificacion.questions.TextoColumna;
import co.com.retotecnico.certificacion.tasks.IngresarADragAndDrop;
import co.com.retotecnico.certificacion.tasks.IntercambiarColumnas;
import co.com.retotecnico.certificacion.tasks.AbrirLaPagina;
import co.com.retotecnico.certificacion.userinterfaces.DragAndDropPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class DragAndDropStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver navegador;

    private final Actor leonardo = Actor.named("Leonardo");

    @Before
    public void prepararEscenario() {
        leonardo.can(BrowseTheWeb.with(navegador));
    }
    @Given("que Leonardo ingresa al portal principal de The Internet de forma exitosa")
    public void queLeonardoIngresaAlPortalPrincipalDeTheInternetDeFormaExitosa() {
        leonardo.wasAbleTo(AbrirLaPagina.principal());
    }

    @When("accede a la opción Drag and Drop")
    public void accederADragAndDrop() {
        leonardo.attemptsTo(IngresarADragAndDrop.ahora());
    }

    @And("intercambia la columna A con la columna B")
    public void intercambiarColumnas() {
        leonardo.attemptsTo(IntercambiarColumnas.exitosamente());
    }

    @Then("debería visualizar que las columnas fueron intercambiadas correctamente")
    public void validarIntercambio() {
        leonardo.should(
                seeThat(
                        TextoColumna.de(DragAndDropPage.COLUMNA_A),
                        equalTo("B")
                )
        );
    }


}
