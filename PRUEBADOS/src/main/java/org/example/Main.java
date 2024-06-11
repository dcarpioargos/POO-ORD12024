package org.example;

public class Main {
    public static void main(String[] args) {
         int numero = 20;

        Estudiante alumno = new Estudiante(123456789);
        alumno.setCedula(5555555);
        alumno.setNombres("JUAN");
        //.out.println("Cedula: " + alumno.getCedula() + " Nombre: "+ alumno.getNombres());
        alumno.obtenerDatos();



        /*//declarar variables  LJSHDFLFHSDKFJJ;JEF;J;EFKJLN
        int numeroUno;
        int numeroDos;
        int suma;

        numeroUno = 100;
        numeroDos = 20;

        suma = numeroUno * numeroDos;

       //todo lo que está entre comillas es un string

        System.out.println("Resultado = " + suma);*/

        /*int iva = 15;
        String nombre = "Diego";
        boolean esLunes = true;
        double numeroDos = 12.5;

        if( iva == 18 && esLunes == true ){
            System.out.println("Si, es igual");
        }else {
            System.out.println("No es igual");
        }*/

        /* (inicial ; condicion ; incremete/decremento){
            sentencia o codigo
        }*/

        /*for ( int i = 0 ; i <= 10000 ; i++ ){
            System.out.println("Numero: " + i);
        }*/

        //int iva = 100;

        //int [] notas = { 100, 20, 40, 80, 125 };
        ///int suma = 0;
        //suma = notas[0] + notas [1] + notas[2];
        //System.out.println("Suma: " + suma);
        /*for ( int i = 0 ; i < notas.length ; i++ ){
            suma += notas[i];
        }*/
        /*for ( int notita: notas ) {
            suma += notita;
        }
        System.out.println("Suma: " + suma);*/


        /*System.out.println("Resultado = " + iva);
        System.out.println("Resultado = " + nombre);
        System.out.println("Resultado = " + esLunes);
        System.out.println("Resultado = " + numeroDos);*/

        //int var = 0;
        //LISTA

//        ArrayList<String> nombresAlumnos = new ArrayList<>();
//        nombresAlumnos.add("Daniel");
//        nombresAlumnos.add("José Luis");
//        nombresAlumnos.add("Carlos");
//        nombresAlumnos.add("María");
//        System.out.println("Nombres Alumnos: " + nombresAlumnos);
//        ArrayList<Integer> numerosX = new ArrayList<Integer>();
//        numerosX.add(1);
//        numerosX.add(2);
//        numerosX.add(3);
//        numerosX.add(78);
//        System.out.println("NumerosX: " + numerosX);


    }
}