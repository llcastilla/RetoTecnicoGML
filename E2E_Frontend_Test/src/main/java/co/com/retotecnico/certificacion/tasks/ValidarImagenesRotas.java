package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.BrokenImagesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ValidarImagenesRotas implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        // Abrir portal principal
        actor.attemptsTo(Open.url(BrokenImagesPage.URL));

        // Ingresar a Broken Images
        actor.attemptsTo(Click.on(BrokenImagesPage.LINK_BROKEN_IMAGES));

        // Obtener imágenes
        BrokenImagesPage.IMAGENES.resolveAllFor(actor)
                .forEach(imagen -> {
                    String imageUrl = imagen.getAttribute("src");
                    System.out.println("\n Validando imagen: " + imageUrl);

                    try {
                        HttpURLConnection connection = (HttpURLConnection) new URL(imageUrl).openConnection();
                        connection.setRequestMethod("GET");
                        connection.connect();

                        int responseCode = connection.getResponseCode();
                        if (responseCode != 200) {
                            System.out.println(" Imagen rota: " + imageUrl + " - Código: " + responseCode);
                        } else {
                            System.out.println("Imagen válida: " + imageUrl + " - Código: " + responseCode);
                        }
                    } catch (IOException e) {
                        System.out.println("Error validando imagen: " + imageUrl);
                    }
                });
    }

    public static ValidarImagenesRotas enLaPagina() {
        return instrumented(ValidarImagenesRotas.class);
    }
}
