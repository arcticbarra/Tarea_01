
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ebarragan
 */
public class Tarea1 {
    
    public static void main(String[] args) {
        
        System.out.println("Tarea 1");
        System.out.println("Nombre: Enrique Barragán González");
        System.out.println("Matrícula: 1370878\n");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Teclea tu día de nacimiento:");
        int dia = sc.nextInt();
        
        System.out.println("Teclea tu mes de nacimiento:");
        int mes = sc.nextInt();
        
        System.out.println("Teclea tu año de nacimiento:");
        int anio = sc.nextInt();
        
        sc.nextLine();
        
        System.out.println("Teclea tu nombre:");
        String nombre = sc.nextLine();
        System.out.println();
        
        Fecha fecha = new Fecha(dia,mes,anio);
        FrequenciaCardiaca freq = new FrequenciaCardiaca(nombre, fecha);
        
        System.out.println("Nombre: " + freq.getNombre());
        System.out.println("Fecha de nacimiento: " + freq.getFechaNacmiento());
        System.out.println("Edad: " + freq.getFechaNacmiento().calcularEdad());
        System.out.println("Frequencia cardíaca máxima: " + freq.getMaximaFrequenciaCardiaca());
        System.out.println("Rango de frequencia cardíaca recomendada: " + "[" + freq.getMaximaFrequenciaCardiaca()/2 + ", " + freq.getMaximaFrequenciaCardiaca() * .85 + "]");

    }
}
