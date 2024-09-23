package Maquiba_Snack_Archivo.Servicio;

import Maquiba_Snack_Archivo.Dominio.Snack;
import java.util.List;

public interface InterfazServicioSnacks {
    void agregarSnack(Snack snack);
    void mostrarSnacks();
    List<Snack> getSnacks();
}
