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
public class Punto3 {
    /*
    3. Polimorfismo, Herencia. 
    A.Cuál es la salida por consola al ejecutar la clase C en (a)? Qué problema de
    compilación se presenta en (b)?
    
    a)
    La salida es:
    A's no arg constructor is invoked
    
    Esto debido a que al heredar, la clase que hereda llama al constructor del 
    padre y por tanto se ejecuta lo que se encuentra en el constructor del padre
    eso corresponde al menaje que aparece en la salida.
        
    b)
    El problema que se presenta es que el constructor de B requiere un parametro
    derivado del constructor del padre, pero no hay ninguna parametro en el constructor
    de B por lo tanto se presenta el error RuntimeException.
    
    B. Responda Verdadero o falso.
    
    a)
    Si los símbolos de pregunta en (a) no son reemplazados por nada puede la 
    clase B ser compilada.
    Falso.
    
    b)
    Falso.
    
    c)
    Falso.
    */
}
