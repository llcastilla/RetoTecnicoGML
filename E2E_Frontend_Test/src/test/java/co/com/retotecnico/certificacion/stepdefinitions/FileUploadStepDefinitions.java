package co.com.retotecnico.certificacion.stepdefinitions;

import co.com.retotecnico.certificacion.questions.CargaExitosa;
import co.com.retotecnico.certificacion.tasks.AbrirLaPagina;
import co.com.retotecnico.certificacion.tasks.CargarArchivo;
import co.com.retotecnico.certificacion.tasks.IngresarAFileUpload;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import java.io.File;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

public class FileUploadStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver navegador;

    private final Actor leonardo = Actor.named("Leonardo");

    @Before
    public void prepararEscenario() {
        leonardo.can(BrowseTheWeb.with(navegador));
    }

    @Given("que se accede al portal principal de The Internet")
    public void accederAlPortal() {
        leonardo.wasAbleTo(
                AbrirLaPagina.principal()
        );
    }

    @When("carga un archivo desde la opción File Upload")
    public void cargarArchivo() {
        File archivo = new File("src/test/resources/documentos/descarga.jpg");

        leonardo.attemptsTo(
                IngresarAFileUpload.ahora(),
                CargarArchivo.desde(archivo)
        );
    }

    @Then("debería visualizar el mensaje de carga exitosa")
    public void validarCargaExitosa() {
        leonardo.should(
                seeThat(
                        CargaExitosa.fueExitosa(),
                        is(true)
                )
        );
    }


}
