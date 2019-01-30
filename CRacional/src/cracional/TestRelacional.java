/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cracional;

import Sleer2.SLeer2;
import static cracional.CRacional.leer;

/**
 * CALCULADORA DE NÚMEROS RACIONALES
 *
 * @author Sergio Granero García
 * @version 1.2
 */
public class TestRelacional {

    /**
     * PIDE UN NÚMERO.
     *
     * @return numero que el usuario introduzca, nunca menor a 0 o mayor a 11.
     * Adaptado para el menú de racionales.
     */
    public static int pideNumMenu() {
        int numero;

        do {
            numero = SLeer2.datoInt("Introduzca un numero de las opciones anteriores[0 para salir]: ");
            System.out.println("\n");

            if (numero < 0 || numero > 11) {
                System.err.println("\nEl número introducido no se encuentra en este menú, vuelva a intentarlo.");
            }

        } while (numero < 0 || numero > 11);

        return numero;
    }

    /**MENÚ DE LA CALCULADORA
     * 
     * @return número de la opción seleccionada
     */
    public static int menu() {

        System.out.println("\n+-------------------------------+\n"
                + "|\tNÚMEROS RACIONALES\t|\n"
                + "+-------------------------------+\n"
                + "| 1.- Sumar\t\t\t|\n"
                + "| 2.- Restar\t\t\t|\n"
                + "| 3.- Multiplicar\t\t|\n"
                + "| 4.- Dividir\t\t\t|\n"
                + "| 5.- Cambiar Signo\t\t|\n"
                + "| 6.- Incrementar\t\t|\n"
                + "| 7.- Decrementar\t\t|\n"
                + "| 8.- Copiar\t\t\t|\n"
                + "| 9.- Simplificar\t\t|\n"
                + "| 10.- Mayor, menor o igual\t|\n"
                + "| 11.- ¿Es nulo?\t\t|\n"
                + "+-------------------------------+\n");

        int opcion = pideNumMenu();

        return opcion;

    }

    /**
     * Método que introduce 10 saltos de líneas. 
     * Intenta emular el comando cls.
     */
    public static void cls() {
        int cont = 20;
        
        for(int i= 0; i <= 20; i++) System.out.println();
        
    }

    /**
     * Método que pausa el programa hasta que se introduzca un caracter.
     */
    public static void pausa() {
        SLeer2.limpiar();
        String pausa = SLeer2.datoString("\n\n>> Pulse Intro para continuar <<\n\n");
    }

    public static void suma(CRacional r1, CRacional r2) {
        System.out.println("\t##### Sumar #####");
        System.out.println("\nPRIMER RACIONAL:");
        r1 = leer();
        System.out.println("\n\nSEGUNDO RACIONAL:");
        r2 = leer();

        System.out.println("\n\t>> Suma total de " + r1.toString() + " y " + r2.toString() + ": " + r1.sumar(r2).toString());
        pausa();
        cls();

    }

    /**MÉTODO QUE LLAMA A RESTAR() - 
     * 
     * Este método lee los racionales que el usuario introduce y a su vez
     * llama al método restar de la clase CRacional. 
     * 
     * Imprime el resultado, genera una pausa y a continuación una serie de
     * cambios de línea.
     * 
     * @param r1 primer racional
     * @param r2 segundo racional
     */
    public static void resta(CRacional r1, CRacional r2) {
        System.out.println("\t##### Restar #####");
        System.out.println("\nPRIMER RACIONAL:");
        r1 = leer();
        System.out.println("\n\nSEGUNDO RACIONAL:");
        r2 = leer();

        System.out.println("\n\t>> Resta total de " + r1 + " y " + r2 + ": " + r1.restar(r2).toString());
        pausa();
        cls();

    }

    /**MÉTODO QUE LLAMA A MULTIPLICAR() -
     * 
     * Este método lee los racionales que el usuario introduce y a su vez
     * llama al método multiplicar de la clase CRacional.
     * 
     * Imprime el resultado, genera una pausa y a continuación una serie de
     * cambios de línea.
     * 
     * @param r1 primer racional
     * @param r2 segundo racional
     */
    public static void multiplica(CRacional r1, CRacional r2) {
        System.out.println("\t##### Multiplicar #####");
        System.out.println("\nPRIMER RACIONAL:");
        r1 = leer();
        System.out.println("\n\nSEGUNDO RACIONAL:");
        r2 = leer();

        System.out.println("\n\t>> Multiplicación total de " + r1.toString() + " y " + r2.toString() + ": " + r1.multiplicar(r2).toString());
        pausa();
        cls();

    }

    /**MÉTODO QUE LLAMA A DIVIDIR() -
     * 
     * Este método lee los racionales que el usuario introduce y a su vez
     * llama al método dividir de la clase CRacional.
     * 
     * Imprime el resultado, genera una pausa y a continuación una serie de
     * cambios de línea.
     * 
     * @param r1 primer racional
     * @param r2 segundo racional
     */
    public static void divide(CRacional r1, CRacional r2) {
        System.out.println("\t##### Dividir #####");
        System.out.println("\nPRIMER RACIONAL:");
        r1 = leer();
        System.out.println("\n\nSEGUNDO RACIONAL:");
        r2 = leer();

        System.out.println("\n\t>> División total de " + r1.toString() + " y " + r2.toString() + ": " + r1.dividir(r2).toString());
        pausa();
        cls();

    }

    /**MÉTODO QUE CAMBIA DE SIGNO A LA RACIONAL.
     * 
     * @param r1 racional involucrado
     */
    public static void cambiosig(CRacional r1) {
        System.out.println("\t##### Cambiar Signo #####");
        r1 = leer();

        System.out.println("\n\tSigno cambiado: " + r1.cambiadoDeSigno().toString());
        pausa();
        cls();

    }

    /**MÉTODO QUE INCREMENTA EN 1/1 LA RACIONAL.
     * 
     * @param r1 racional involucrado
     */
    public static void incrementa(CRacional r1) {
        System.out.println("\t##### Incrementar #####");
        r1 = leer();

        System.out.println("\n\t Incrementación: " + r1.incrementar().toString());
        pausa();
        cls();
    }

    /**MÉTODO QUE DECREMENTA EN 1/1 LA RACIONAL.
     * 
     * @param r1 racional involucrado
     */
    public static void decrementa(CRacional r1) {
        System.out.println("\t##### Decrementar #####");
        r1 = leer();

        System.out.println("\n\t Decrementación: " + r1.decrementar().toString());
        pausa();
        cls();
    }

    /**MÉTODO QUE COPIA UNA RACIONAL EN OTRA - 
     * Llama al método copiar() de la clase CRacional.
     * 
     * @param r1 racional base
     * @param r2 racional copia
     */
    public static void copia(CRacional r1, CRacional r2) {
        System.out.println("\t##### Copiar #####");
        System.out.println("\nRACIONAL QUE DESEA COPIAR:");
        r1 = leer();

        r2 = r2.copiar(r1);

        System.out.println("\n\tCopia r2 -> " + r2.toString());
        pausa();
        cls();
    }

    /**MÉTODO QUE LLAMA A SIMPLIFICAR() -
     * 
     * Este método lee un racional que el usuario introduce y posteriormente
     * llama al método simplificar() de la clase CRacional.
     * 
     * @param r1 racional involucrado
     */
    public static void simplifica(CRacional r1) {
        System.out.println("\t##### Simplificar #####");

        r1 = leer();

        System.out.println("\n\t >> Versión simplificada: " + r1.simplificar().toString());
        pausa();
        cls();
    }

    /**MÉTODO QUE COMPARA RACIONALES -
     * 
     * Mediante equals(), mayor(), menor() de la clase CRacional.
     * 
     * @param r1 primer racional
     * @param r2 segundo racional
     */
    public static void compara(CRacional r1, CRacional r2) {
        System.out.println("\t##### Mayor, menor o igual #####");
        r1 = leer();
        r2 = leer();

        if (r1.equals(r2)) {
            System.out.println("\n\t" + r1.toString() + " es igual a " + r2.toString());
        } else if (r1.menor(r2)) {
            System.out.println("\n\t" + r1.toString() + " es menor que " + r2.toString());
        } else if (r1.mayor(r2)) {
            System.out.println("\n\t" + r1.toString() + " es mayor que " + r2.toString());
        }

        pausa();
        cls();

    }

    /**MÉTODO QUE COMPRUEBA SI EL RACIONAL ES NULO.
     * 
     * Este método llama a esCero() de la clase CRacional para 
     * comprobar si la racional es nula o no.
     * 
     * @param r1 racional involucrado.
     */
    public static void esnulo(CRacional r1) {
        System.out.println("##### ¿Es nulo? #####");
        r1 = leer();

        if (r1.esCero()) {
            System.out.println("\n\t" + r1.toString() + " es nulo.");
        } else {
            System.out.println("\n\t" + r1.toString() + " no es nulo");
        }

        pausa();
        cls();
    }

    public static void main(String[] args) {

        CRacional r1 = new CRacional();
        CRacional r2 = new CRacional();

        int opcion = menu();

        while (opcion != 0) {

            switch (opcion) {
                case 1: suma(r1, r2); break;
                case 2: resta(r1, r2); break;
                case 3: multiplica(r1, r2); break;
                case 4: divide(r1, r2); break;
                case 5: cambiosig(r1); break;
                case 6: incrementa(r1); break;
                case 7: decrementa(r1); break;
                case 8: copia(r1, r2); break;
                case 9: simplifica(r1); break;
                case 10: compara(r1, r2); break;
                case 11: esnulo(r1); break;
            }

            opcion = menu();

        }

        System.out.println("\n~~ Fin del programa, hasta luego Lucas ~~\n");

    }
}
