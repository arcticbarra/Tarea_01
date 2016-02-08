
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ebarragan
 */
public class Fecha {
    
    private int dia;
    private int mes;
    private int anio;
    
    public Fecha(int dia, int mes, int anio) {
        
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        
    }
    
    public String toString() {
        
        return (dia + "/" + mes + "/"+ anio );
        
    }
    
    public int calcularEdad() {
        
        int anioActual = Calendar.getInstance().get(Calendar.YEAR);
        int mesActual = Calendar.getInstance().get(Calendar.MONTH);
        int diaActual = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        
        int fecha = anioActual - anio;
       
        if (mesActual < mes) {
            
            fecha--;
            
        } else if (mesActual == mes) {
            
            if (diaActual < dia) {
                fecha--;
            }
        }
        
        return fecha;
        
    }
}
