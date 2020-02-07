public class MVC_Rekap {
    ViewRekap viewRekap = new ViewRekap();
    ModelPembelian modelPembelian = new ModelPembelian();
    ControllerRekap controllerRekap = new ControllerRekap(modelPembelian,viewRekap);
}
