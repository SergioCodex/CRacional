/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cracional;

import Sleer2.SLeer2;

/**CLASE CALCULADORA DE NÚMERO RACIONALES
 *
 * @author Sergio Granero García
 * @version 1.2
 */
public class CRacional {

    //Atributos.
    private long numerador;
    private long denominador;

    //Getters.
    /**
     * CONSEGUIR EL NUMERADOR DE UNA FRACCIÓN
     * 
     * @return numerador
     */
    public long getNumerador() {
        return numerador;
    }

    /**
     * CONSEGUIR EL DENOMINADOR DE UNA FRACCIÓN
     * 
     * @return denominador
     */
    public long getDenominador() {
        return denominador;
    }

    //Constructores.
    
    /**
     * CONSTRUCTOR SIN PARÁMETROS.
     * 
     * Valor por defecto = 1
     */
    public CRacional() {
        this.numerador = 1;
        this.denominador = 1;
    }

    /**
     * CONSTRUCTOR CON NUMERADOR COMO ÚNICO PARÁMETRO.
     * 
     * Valor por defecto para denominador = 1
     * 
     * @param num numerador de la fracción
     */
    public CRacional(long num) {
        this.numerador = num;
        this.denominador = 1;
    }

    /**
     * CONSTRUCTOR CON AMBOS PARÁMETORS (NUM Y DEN)
     * 
     * @param num numerador
     * @param den denominador
     */
    public CRacional(long num, long den) {
        this.numerador = num;
        this.denominador = den;
    }

    /**
     * CONSTRUCTOR COPIA
     * 
     * @param rx racional a copiar.
     */
    public CRacional(CRacional rx) {
        this.numerador = rx.getNumerador();
        this.denominador = rx.getDenominador();
    }

    /**
     * MÍNIMO COMÚN DIVISOR.
     * 
     * @param a numerador absoluto
     * @param b denominador absoluto
     * @return mcd
     */
    private long mcd(long a, long b) {
        long r;
        while (a % b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return b;
    }

    /**
     * MÉTODO QUE SIMPLIFICAR UNA FRACCIÓN.
     * 
     * @return fracción simplificada. 
     */
    public CRacional simplificar() {

        if (this.denominador == 0 && this.numerador != 0) {
            numerador = 1;
        } else if (this.denominador != 0 && this.numerador == 0) {
            denominador = 1;
        } else if (this.numerador != 0 && this.denominador != 0) {

            // valores absolutos:
            long absNum = Math.abs(this.numerador);
            long absDen = Math.abs(this.denominador);

            // signo del denominador:
            long signo = this.denominador / absDen;
            long s = mcd(absNum, absDen);

            numerador = signo * (this.numerador / s);
            denominador = signo * (this.denominador / s);

        }

        return this;
    }

    /**
     * SUMA DOS RACIONALES.
     * 
     * @param rx racional a sumar.
     * @return resultado en objeto CRacional.
     */
    public CRacional sumar(CRacional rx) {

        if (this.denominador == rx.denominador) {

            return new CRacional(numerador = this.numerador + rx.numerador, denominador = this.denominador).simplificar();

        } else {

            return new CRacional(numerador = (this.numerador * rx.denominador) + (rx.numerador * this.denominador), denominador = this.denominador * rx.denominador).simplificar();

        }

    }

    /**
     * RESTA RACIONALES.
     * 
     * @param rx racional a restar.
     * @return resultado en objeto CRacional.
     */
    public CRacional restar(CRacional rx) {

        if (this.denominador == rx.denominador) {

            return new CRacional(numerador = this.numerador - rx.numerador, denominador = this.denominador).simplificar();

        } else {

            return new CRacional(numerador = (this.numerador * rx.denominador) - (rx.numerador * this.denominador), denominador = this.denominador * rx.denominador).simplificar();

        }

    }

    /**
     * MULTIPLICA RACIONALES.
     * 
     * @param rx racional a multiplicar.
     * @return resultado en objeto CRacional.
     */
    public CRacional multiplicar(CRacional rx) {

        if (this.denominador == rx.denominador) {
            return new CRacional(numerador = this.numerador * rx.numerador, denominador = this.denominador).simplificar();

        } else {
            return new CRacional(numerador = this.numerador * rx.numerador, denominador = this.denominador * rx.denominador).simplificar();
        }

    }

    /**
     * DIVIDE RACIONALES.
     * 
     * @param rx racional a dividir.
     * @return resultado en objeto CRacional.
     */
    public CRacional dividir(CRacional rx) {

        if (this.denominador == rx.denominador) {
            return new CRacional(numerador = this.numerador * rx.denominador, denominador = this.denominador).simplificar();
        } else {
            return new CRacional(numerador = this.numerador * rx.denominador, denominador = this.denominador * rx.numerador).simplificar();
        }

    }

    /**
     * AVERIGUA QUÉ RACIONAL ES MENOR.
     * 
     * @param rx racional a comparar.
     * @return true si es menor, false si es mayor.
     */
    public boolean menor(CRacional rx) {

        if (this.denominador > rx.denominador) {
            return true;
        } else if (this.denominador == rx.denominador) {
            if (this.numerador > rx.numerador) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    /**
     * AVERIGUA QUÉ RACIONAL ES MAYOR.
     * 
     * @param rx racional a comparar.
     * @return true si es mayor, false si es menor.
     */
    public boolean mayor(CRacional rx) {

        if (this.denominador < rx.denominador) {
            return true;
        } else if (this.denominador == rx.denominador) {
            if (this.numerador < rx.numerador) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    /**
     * MÉTODO JAVA TOSTRING() SOBREESCRITO PARA RACIONALES.
     * 
     * @return racional en String. 
     */
    @Override
    public String toString() {

        String fraccion = this.numerador + "/" + this.denominador;

        return fraccion;

    }

    /**
     * COPIA UN RACIONAL EN OTRO OBJETO CRACIONAL.
     * 
     * @param rx racional a copiar.
     * @return objeto CRacional copia.
     */
    public CRacional copiar(CRacional rx) {

        this.numerador = rx.numerador;
        this.denominador = rx.denominador;

        return this;

    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + (int) (this.numerador ^ (this.numerador >>> 32));
        hash = 79 * hash + (int) (this.denominador ^ (this.denominador >>> 32));
        return hash;
    }

    /**
     * MÉTODO EQUALS()
     * 
     * @param obj CRacional
     * @return boolean
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CRacional other = (CRacional) obj;
        if (this.numerador != other.numerador) {
            return false;
        }
        if (this.denominador != other.denominador) {
            return false;
        }
        return true;
    }

    /**
     * MÉTODO EQUALS ADAPTADO A OBJETOS CRACIONAL.
     * 
     * @param rx racional a comparar
     * @return boolean
     */
    public boolean equals(CRacional rx) {
        
        return this.numerador * rx.denominador == rx.numerador * this.denominador;
        
    }

    /**
     * AVERGIUA SI ES NULO (0).
     * 
     * @return boolean
     */
    public boolean esCero() {

        return this.numerador == 0 || this.denominador == 0;

    }

    /**
     * INCREMENTA 1/1 A LA RACIONAL.
     * 
     * @return Obj CRacional incrementado.
     */
    public CRacional incrementar() {

        return new CRacional(numerador = this.numerador * 1 + 1 * this.denominador, denominador = this.denominador * 1).simplificar();

    }

    /**
     * DECREMENTA 1/1 A LA RACIONAL.
     * 
     * @return Obj CRacional decrementado. 
     */
    public CRacional decrementar() {

        return new CRacional(numerador = this.numerador * 1 - 1 * this.denominador, denominador = this.denominador * 1).simplificar();

    }

    /**
     * CAMBIA DE SIGNO LA RACIONAL 
     * 
     * @return Obj CRacional modificado.
     */
    public CRacional cambiadoDeSigno() {

        this.numerador = -1 * numerador;

        return this;

    }

    /**
     * CONSTRUYE UNA RACIONA CON LOS VALORES QUE ELIJA EL USUARIO.
     * 
     * @return Obj CRacional
     */
    public static CRacional leer() {
        long num;
        long den;

        num = SLeer2.datoLong("- Introduzca un numerador: ");

        do {
            den = SLeer2.datoLong("- Introduzca un denominador: ");

            if (den <= 0) {
                System.err.println("\nEl denominador no puede ser 0 o menor, vuelva a introducir un denominador.");
            }

        } while (den <= 0);

        return new CRacional(num, den);

    }

}
