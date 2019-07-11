package com.iraheta;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LectorDeDatos {
    public static int solicitarEntero(String mensaje){ //para no repetir el codigo en cada ingreso del sistema
        Scanner lector = new Scanner(System.in);
        System.out.print(mensaje);
        try{
            int numero = lector.nextInt();
            return numero;
        }catch (InputMismatchException e){
            System.out.println("El dato ingresado no es valido");
            return solicitarEntero(mensaje);
        }
    }

    public static double solicitarDouble(String mensaje){ //para no repetir el codigo en cada ingreso del sistema
        Scanner lector = new Scanner(System.in);
        System.out.print(mensaje);
        try{
            double numero = lector.nextDouble();
            return numero;
        }catch (InputMismatchException e){
            System.out.println("El dato ingresado no es valido");
            return solicitarDouble(mensaje);
        }
    }
}

//los metodos estaticos no se necesitan instanciar
// se crean estaticos porque no van a cambiar, no se ocupa manejar el estado.
//estan ligados a la clase.
//crear una cuenta linkedin