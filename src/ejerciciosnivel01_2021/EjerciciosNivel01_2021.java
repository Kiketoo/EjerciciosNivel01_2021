/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosnivel01_2021;

/**
 *
 * @author kikee
 */
public class EjerciciosNivel01_2021 {

    //declaro un array de integers para hacer pruebas
    
    int[] listaNumeros = {50, 31, 27, 2, 5, 99};
    //el array empieza a contar desde el cero (primera posición cero,
    //el siguiente vale uno...)
    
    public int maximo (int[] lista){
        int auxiliar = lista[0]; //el máximo va a ser el elemento del array
        
        for(int i=0; i< lista.length; i++)
        if (auxiliar < lista[i]){
            auxiliar = lista[i];
        }
        //esto sirve para que el auxiliar se compare con todos los 
        //numeros y asi podamos encontrar el numero maximo
        return auxiliar;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjerciciosNivel01_2021 ejercicio = new EjerciciosNivel01_2021();
        System.out.println(ejercicio.maximo(ejercicio.listaNumeros));
        
    }
    
}
