/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.function.Consumer;

/**
 *
 * @author Usuario
 */
public class Sorteador <T> implements Iterable<T>{
    private ArrayList<T> elementos;
    private Random rnd;
    
    public Sorteador(){
        this.elementos = new ArrayList<>();
        rnd = new Random();
    }
    
    public void insertar(T o){
        this.elementos.add(o);
    }
    
    public T proximoSorteado(){
        if(estaVacio()){
            throw new IllegalStateException("El sorteador esta vacio");
        }
        int i = rnd.nextInt(this.elementos.size());
        return this.elementos.remove(i);
    }
    
    public boolean estaVacio(){
        return this.elementos.isEmpty();
    }

    @Override
    public Iterator iterator() {
        return new IteradorSorteador();
    }
    
    private class IteradorSorteador implements Iterator<T>{

        @Override
        public boolean hasNext() {
            return !estaVacio();
        }

        @Override
        public T next() {
            return proximoSorteado();
        }
        
    }
}
