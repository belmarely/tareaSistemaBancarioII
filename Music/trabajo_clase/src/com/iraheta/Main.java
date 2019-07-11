package com.iraheta;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Cuenta> cuentas= new ArrayList();
        Scanner lector= new Scanner(System.in);
        System.out.println("********************");
        System.out.println("\tBenvenido");
        System.out.println("********************");
        while(true){
            System.out.println("1. Crear una cuenta");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Mostrar información de una cuenta");
            System.out.println("5. Mostrar Cuentas");
            System.out.println("6. Salir");
            int opcion = LectorDeDatos.solicitarEntero("Ingrese una opción");
            switch (opcion){
                case 1:
                    System.out.println("** Creando una cuenta **");
                    Random rand = new Random();
                    int numeroCuenta =rand.nextInt(1000);
                    System.out.println("Su número de cuenta será: " + numeroCuenta);
                    System.out.println("Especifique el tipo de cuenta que desea crear");
                    System.out.println("\t1. Cuenta de ahorro");
                    System.out.println("\t2. Cuenta a Largo plazo");
                    int tipoCuenta = LectorDeDatos.solicitarEntero("Ingrese una opción");
                    double saldo = LectorDeDatos.solicitarDouble("Ingrese una opción");
                    if (tipoCuenta == 1){
                        CuentaAhorro nuevaCuenta = new CuentaAhorro();
                        nuevaCuenta.numCuenta = numeroCuenta;
                        nuevaCuenta.saldo= saldo;
                        cuentas.add(nuevaCuenta);
                    } else if (tipoCuenta == 2){
                        CuentaLargoPlazo nuevaCuenta = new CuentaLargoPlazo();
                        nuevaCuenta.numCuenta= numeroCuenta;
                        nuevaCuenta.saldo= saldo;
                        cuentas.add(nuevaCuenta);
                    } else {
                        System.out.println("Tipo de cuenta no existe");
                    }
                    System.out.println("La cuenta ha sido creada!");
                    break;
                case 2:
                    System.out.println("** Ingrese el numero de cuenta **");
                    int tipoDeCuentaDeposito=LectorDeDatos.solicitarEntero("Ingrese una opción"); //solo para Deposito
                    for (Cuenta c:cuentas) {
                        if(tipoDeCuentaDeposito == c.numCuenta){
                            System.out.println("Ingrese la cantidad que desea depositar: ");
                            double deposito = LectorDeDatos.solicitarDouble("Ingrese una opción");;
                            c.depositar(deposito);
                            System.out.println("Deposito con Exito!");
                            System.out.println("Su saldo es: " + c.saldo);
                        }
                        else if (tipoDeCuentaDeposito != c.numCuenta) {
                            System.out.println("La cuenta no existe, por favor intentelo de nuevo");
                        }
                    }
                    break;
                case 3:
                    System.out.println("** Ingrese el numero de cuenta **");
                    int tipoDeCuentaRetiro= LectorDeDatos.solicitarEntero("Ingrese una opción"); //solo para retiro
                    for (Cuenta c:cuentas) {
                       if(tipoDeCuentaRetiro == c.numCuenta){
                           System.out.println("Ingrese la cantidad que desea retirar: ");
                           double retiro = LectorDeDatos.solicitarDouble("Ingrese una opción");;
                           c.retirar(retiro);
                           System.out.println("Retiro con Exito!");
                           System.out.println("Su saldo es: " + c.saldo);
                       }
                       else if (tipoDeCuentaRetiro != c.numCuenta) {
                           System.out.println("La cuenta no existe, por favor intentelo de nuevo");
                       }
                    }
                    break;
                case 4:
                    int a =0;
                    while (a==0){
                    System.out.println("** Ingrese el numero de cuenta **");
                    int infoCuentas= LectorDeDatos.solicitarEntero("Ingrese una opción");
                    for (Cuenta c:cuentas) {
                        if(infoCuentas == c.numCuenta) {
                            System.out.println("La cuenta numero:" + c.numCuenta + "   Con saldo de:" + c.saldo);

                        }else if (infoCuentas != c.numCuenta) {
                            System.out.println("La cuenta no existe, por favor intentelo de nuevo");
                        }

                    }
                        System.out.println("Desea informacion de otra cuenta");
                        a = LectorDeDatos.solicitarEntero("Ingrese una opción");
                    }
                    break;
                case 5:
                    // numero de cuenta- tipo de cuenta

                    if(cuentas.isEmpty()){
                        System.out.println("--No hay cuentas--");
                    } else {
                        System.out.println("** Mostrando Cuentas **");
                    }
                    for (Cuenta c:cuentas) {
                        String tipo = "";
                        if (c instanceof CuentaAhorro)
                            tipo="Cuenta de Ahorro";
                        else if (c instanceof CuentaLargoPlazo)
                            tipo ="Cuenta a Largo Plaza";

                        System.out.println("Numero de Cuenta" + c.numCuenta + "-" + tipo);
                    }
                    break;
                case 6:
                    System.out.println("Adios");
                    break;
                    default:
                        System.out.println("Opción no valida:");
            }
            if(opcion == 6){
                break;
            }
        }
    }

}
