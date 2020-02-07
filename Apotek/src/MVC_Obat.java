public class MVC_Obat {
    ViewObat viewObat = new ViewObat();
    ModelObat modelObat = new ModelObat();
    ControllerObat controllerObat = new ControllerObat(modelObat,viewObat);
}
