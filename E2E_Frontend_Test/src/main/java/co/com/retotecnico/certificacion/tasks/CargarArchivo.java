package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.FileUploadPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;

import java.io.File;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CargarArchivo implements Task {

    private final File archivo;

    public CargarArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(archivo.getAbsolutePath())
                        .into(FileUploadPage.INPUT_FILE),
                Click.on(FileUploadPage.BTN_UPLOAD)
        );
    }

    public static CargarArchivo desde(File archivo) {
        return instrumented(CargarArchivo.class, archivo);
    }
}
