/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teoria;

/**
 *
 * @author JoseLuis
 */
public class Punto2 {    
    /*
    2. Gestión de Excepciones
    A. Indique la salida de los siguientes dos códigos.
    a)
    La salida es:
    0
    1
    Esto debido a que el ciclo se ejecuta cuando i=0, pero cuando llega a la
    division entre 0, al s=estar dentro de un try-catch la ejecucion del programa
    continua sin que s detenga forsozamente, el contador incrementa el valor en 1
    y ahora es 1, 1<2 es verdadero por lo tanto sucede lo mismo hasta que incrmeenta
    y compara 2<2 como no es verdad se sale del ciclo y termina la ejecucion.
    
    b)
    La salida es:
    0 
    Esto debido a que el try esta colocado antes del ciclo for, por lo tanto,
    tan pronto detecta que se intenta efectuar la operacion 1/0 el programa
    busca el catch y ejecuta el bloque de codigo que se encuentre dntro de este
    pero como on hay nada dentro del catch, simplemente acaba la ejecucion
    */
    
    //--------------------------------------------------------------------------
    
    /*
    B. Existe algún código de los presentados a continuación que presente la Excepción RunTimeException.
    a)
    Si, aparece ArithmeticException y esta hereda de RunTimeException.
    b)
    Si, aparece ArrayIndexOutOfBoundsException y esta hereda de RunTimeException.
    c)
    Si, aparece StringIndexOutOfBoundsException y esta hereda de RunTimeException.
    d)
    Si, aparece ClassCastException y esta hereda de RunTimeException.
    e)
    Si, aparece NullPointerException y esta hereda de RunTimeException.
    f)
    No, debido al que el 1 es double, tiene que ver algo del punto flotante.
    
    */   
}
