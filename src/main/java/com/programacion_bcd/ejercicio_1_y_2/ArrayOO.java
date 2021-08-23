/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programacion_bcd.ejercicio_1_y_2;

/**
 *
 * @author Mati
 */
public class ArrayOO {

    private int[] array;

    /**
     * Inicializa un array sin posiciones.
     */
    public ArrayOO() {
        this.array = new int[0];
    }

    /**
     * Incrementa en uno la longitud del array e inserta en la última posición el
     * valor pasado por parámetro
     *
     * @param valor
     */
    public void add(int valor) {
        // Crear nuevoArray con length = array.length + 1
        int[] nuevoArray = new int[array.length + 1];
        // Copiar los valores de array en otro array nuevoArray
        for (int i = 0; i < array.length; i++) {
            nuevoArray[i] = array[i];
        }
        // Poner el nuevo valor en nuevoArray
        nuevoArray[nuevoArray.length - 1] = valor;
        // Sobreescribir el valor de array
        this.array = nuevoArray;
    }

    /**
     * Quita el elemento ubicado en la posición especificada por el parámetro y
     * disminuye en uno la longitud del array.
     *
     * @param indice
     */
    public void remove(int indice) {
        // Crear nuevoArray con length = array.length - 1
        int[] nuevoArray = new int[array.length - 1];

        // Copiar todos los valores menos indice
        int indiceAux = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != indice) {
                nuevoArray[indiceAux] = array[i];
                indiceAux++;
            }
        }

        // Sobreescribir el array con nuevoArray
        this.array = nuevoArray;
    }

    /**
     * Obtiene el valor especificado por índice
     *
     * @param indice
     * @return
     */
    public int get(int indice) {
        return array[indice];
    }

    /**
     * Establece el valor pasado por parámetro en la posición especificada por
     * indice
     *
     * @param indice
     * @param valor
     */
    public void set(int indice, int valor) {
        this.array[indice] = valor;
    }

    /**
     * Devuelve la cantidad de posiciones actual de la estructura.
     *
     * @return
     */
    public int size() {
        return this.array.length;
    }

    /**
     * Concatena en un único String todos los valores de la estructura
     *
     * @return
     */
    public double promedio() {
        int suma = 0;
        double res;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        res = (suma / array.length);
        return res;
    }

    public void multiplicar(int valorParam) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= valorParam;
        }
    }

    public void multiplicar(int[] arrayParam) {
        int cont;
        if (array.length <= arrayParam.length) {
            for (int i = 0; i < array.length; i++) {
                array[i] *= arrayParam[i];
            }

        } else if (array.length > arrayParam.length) {
            cont = 0;
            while (cont < array.length) {
                for (int i = 0; i < arrayParam.length; i++) {
                    cont = (cont == 0 && i == 0) ? 0 : cont + 1;
                    if (cont == array.length) {
                        break;
                    } else {
                        array[cont] *= arrayParam[i];
                    }
                }
            }
        }
    }

    public boolean todosDistintos() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    return false;
                }

            }
        }
        return true;
    }

    public void reverso() {
        int aux;
        for (int i = 0; i < array.length / 2; i++) {
            aux = array[i];
            int z = array.length - i - 1;
            array[i] = array[z];
            array[z] = aux;
        }
    }

    @Override
    public String toString() {
        String resultado = "";

        for (int actual : array) {
            resultado += actual + ",";
        }

        if (resultado.length() > 0) {
            resultado = resultado.substring(0, resultado.length() - 1) + ".";
        }

        return resultado;
    }

}
