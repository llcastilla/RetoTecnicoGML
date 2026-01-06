package co.com.retotecnico.certificacion.stepdefinitions;

import co.com.retotecnico.certificacion.tasks.AbrirSecureFileDownload;
import co.com.retotecnico.certificacion.tasks.DescargarArchivosSecure;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

public class SecureFileDownloadStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver navegador;

    private final Actor leonardo = Actor.named("Leonardo");

    @Before
    public void prepararEscenario() {
        leonardo.can(BrowseTheWeb.with(navegador));
    }

    @Given("que Leonardo ingresa a la página de Secure File Download")
    public void queLeonardoIngresaALaPaginaDeSecureFileDownload() {
        leonardo.wasAbleTo(AbrirSecureFileDownload.pagina());
    }

    @When("descarga todos los archivos disponibles")
    public void descargaTodosLosArchivosDisponibles() {
        leonardo.attemptsTo(DescargarArchivosSecure.todos());
    }
}
