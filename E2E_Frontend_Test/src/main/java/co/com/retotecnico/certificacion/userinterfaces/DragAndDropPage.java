package co.com.retotecnico.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DragAndDropPage {

    public static final Target LINK_DRAG_AND_DROP = Target
            .the("enlace Drag and Drop")
            .locatedBy("//a[.='Drag and Drop']");

    public static final Target COLUMNA_A = Target
            .the("columna A")
            .locatedBy("//div[@id='column-a']");

    public static final Target COLUMNA_B = Target
            .the("columna B")
            .locatedBy("//div[@id='column-b']");

    private DragAndDropPage() {
    }
}
