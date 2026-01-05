package co.com.retotecnico.certificacion.stepdefinitions;

import co.com.retotecnico.certificacion.questions.ContenidoDinamico;
import co.com.retotecnico.certificacion.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.not;

public class DynamicContentStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver navegador;

    private final Actor leonardo = Actor.named("Leonardo");
    private String contenidoInicial;

    @Before
    public void prepararEscenario() {
        leonardo.can(BrowseTheWeb.with(navegador));
    }


    @Given("que el usuario ingresa al portal principal de The Internet")
    public void queElUsuarioIngresaAlPortalPrincipalDeTheInternet() {
        leonardo.wasAbleTo(AbrirLaPagina.principal());

    }
    @When("accede a la opción Dynamic Content")
    public void accederADynamicContent() {
        leonardo.attemptsTo(IngresarADynamicContent.ahora());
        contenidoInicial = ContenidoDinamico.actual().answeredBy(leonardo);
    }

    @And("recarga el contenido dinámico")
    public void recargarContenido() {
        leonardo.attemptsTo(RecargarContenidoDinamico.ahora());
    }

    @Then("debería visualizar que el contenido dinámico ha cambiado")
    public void validarCambioDeContenido() {
        leonardo.should(
                seeThat(
                        ContenidoDinamico.actual(),
                        not(contenidoInicial)
                )
        );
    }


}
