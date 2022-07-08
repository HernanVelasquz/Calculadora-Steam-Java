package org.sofka.interfaces;

import java.util.List;

public interface InterfaceCalculadora {
    List<Integer> suma(List<Integer> listUno, List<Integer> listDos);
    List<Integer> resta(List<Integer> listUno, List<Integer> listDos);
    List<Integer> multiplicacion(List<Integer> listUno, List<Integer> listDos);
    List<Integer> division(List<Integer> listUno, List<Integer> listDos);
    List<Integer> modulo(List<Integer> listUno, List<Integer> listDos);


}
