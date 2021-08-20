/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author Mati
 */
public class ClienteArrayOO {

    public static void main(String[] args) {
        ArrayOO arreglo = new ArrayOO();
        arreglo.add(1);
        arreglo.add(2);
        arreglo.add(3);
        arreglo.add(4);
        arreglo.add(5);
        arreglo.add(6);
        arreglo.add(7);
        arreglo.add(8);
        arreglo.add(9);

        System.out.println("------------Sacando el promedio del arreglo------------");
        
        System.out.println("El promedio de los valores del arreglo es: " + arreglo.promedio());
        
        System.out.println("------------Multiplicando el arreglo por el valor 2------------");
        arreglo.multiplicar(2);
        System.out.println("El arreglo multiplicado por 2 es: " + arreglo.toString());

        System.out.println("Creando el arreglo arrayParam de igual longitud y multiplicando por el arreglo");
        int arrayParam[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        arreglo.multiplicar(arrayParam);
        System.out.println(arreglo.toString());
        
        System.out.println("Creando el arreglo arrayParam de menor longitud y multiplicando por el arreglo");

        /*Cuando llega a la posición final de "arrayParam" y quedan posiciones por multiplicar de
        "arreglo" comienza a multiplicar nuevamente desde el principio de "arrayParam".
         */
        
        int arrayParam2[] = {1, 2, 3, 4, 5, 6, 7};
        arreglo.multiplicar(arrayParam2);
        System.out.println(arreglo.toString());

        System.out.println("------------Verificando valores del arreglo------------");
        System.out.println(arreglo.todosDistintos());

        System.out.println("------------Invirtiendo los valorees del arreglo------------");
        arreglo.reverso();
        System.out.println("El arreglo invertido es: " + arreglo.toString());

    }
}
