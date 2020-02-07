public class MVC_View {
    ViewDaftarObat viewDaftarObat = new ViewDaftarObat();
    ModelObat modelObat = new ModelObat();
    ControllerViewDaftar viewDaftar = new ControllerViewDaftar(modelObat,viewDaftarObat);
}
