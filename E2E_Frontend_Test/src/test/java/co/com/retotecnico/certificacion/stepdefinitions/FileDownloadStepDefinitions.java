package co.com.retotecnico.certificacion.stepdefinitions;

import co.com.retotecnico.certificacion.tasks.AbrirLaPagina;
import co.com.retotecnico.certificacion.tasks.DescargarTodosLosArchivos;
import co.com.retotecnico.certificacion.tasks.IngresarAFileDownload;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

public class FileDownloadStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver navegador;

    private final Actor leonardo = Actor.named("Leonardo");

    @Before
    public void prepararEscenario() {
        leonardo.can(BrowseTheWeb.with(navegador));
    }

    @Given("que se encuentra Leonardo en la página principal de The Internet")
    public void queLeonardoSeEncuentraEnLaPaginaPrincipal() {
        leonardo.wasAbleTo(
                AbrirLaPagina.principal()
        );
    }

    @When("ingresa a la opción File Download y descarga los archivos disponibles")
    public void ingresaAFileDownloadYDescargaArchivos() {
        leonardo.attemptsTo(
                IngresarAFileDownload.ahora(),
                DescargarTodosLosArchivos.disponibles()
        );
    }
}
