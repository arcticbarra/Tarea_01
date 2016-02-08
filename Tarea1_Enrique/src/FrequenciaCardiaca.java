/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ebarragan
 */
public class FrequenciaCardiaca {
    
    private Fecha fechaNacimiento;
    private String nombre;
    
    public FrequenciaCardiaca(String nombre, Fecha fecha) {
        
       fechaNacimiento = fecha;
       this.nombre = nombre;
       
    }
    
    public double getMaximaFrequenciaCardiaca() {
        
        double freq = 220 - fechaNacimiento.calcularEdad();
        return freq;
        
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public Fecha getFechaNacmiento() {
        return fechaNacimiento;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setFechaNacimiento(Fecha fecha) {
        fechaNacimiento = fecha;
    }
}
