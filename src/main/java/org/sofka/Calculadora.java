package org.sofka;

import org.sofka.interfaces.InterfaceCalculadora;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Calculadora implements InterfaceCalculadora {
    @Override
    public List<Integer> suma(List<Integer> listUno, List<Integer> listDos){
        AtomicInteger index = new AtomicInteger();

        if(listDos.size() <= listUno.size()){
            return (List<Integer>) listDos.stream()
                    .map(item -> item + listUno.get(index.getAndIncrement())).collect(Collectors.toList());
        }
        return (List<Integer>) listUno.stream()
                .map(item -> item + listDos.get(index.getAndIncrement())).collect(Collectors.toList());
    }

    @Override
    public List<Integer> resta(List<Integer> listUno, List<Integer> listDos){
        AtomicInteger index = new AtomicInteger();
        if(listDos.size() <= listUno.size()){
            return (List<Integer>) listDos.stream()
                    .map(item -> item - listUno.get(index.getAndIncrement())).collect(Collectors.toList());
        }
        return (List<Integer>) listUno.stream()
                .map(item -> item - listUno.get(index.getAndIncrement())).collect(Collectors.toList());
    }
    @Override
    public List<Integer> multiplicacion(List<Integer> listUno, List<Integer> listDos) {
        AtomicInteger index = new AtomicInteger();
        if(listDos.size() <= listUno.size()){
            return (List<Integer>) listDos.stream()
                    .map(item -> item * listUno.get(index.getAndIncrement())).collect(Collectors.toList());
        }
        return (List<Integer>) listUno.stream()
                .map(item -> item * listDos.get(index.getAndIncrement())).collect(Collectors.toList());
    }

    @Override
    public List<Integer> division(List<Integer> listDos, List<Integer> listUno) {
        AtomicInteger index = new AtomicInteger();
        if(listDos.size() >= listUno.size()){
            return (List<Integer>) listUno.stream()
                    .map(item ->  item / listDos.get(index.getAndIncrement()) ).collect(Collectors.toList());
        }
        return (List<Integer>) listDos.stream()
                .map(item ->  item / listUno.get(index.getAndIncrement())).collect(Collectors.toList());
    }
    @Override
    public List<Integer> modulo(List<Integer> listUno, List<Integer> listDos) {
        AtomicInteger index = new AtomicInteger();
        if(listDos.size() >= listUno.size()){
            return (List<Integer>) listUno.stream()
                    .map(item -> item / listDos.get(index.getAndIncrement())).collect(Collectors.toList());
        }
        return (List<Integer>) listDos.stream()
                .map(item -> item / listUno.get(index.getAndIncrement())).collect(Collectors.toList());
    }
}
