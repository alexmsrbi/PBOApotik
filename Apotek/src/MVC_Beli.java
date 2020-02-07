public class MVC_Beli {
    ViewBeli viewBeli = new ViewBeli();
    ModelPembelian modelPembelian = new ModelPembelian();
    ControllerBeli controllerBeli = new ControllerBeli(modelPembelian,viewBeli);
}
