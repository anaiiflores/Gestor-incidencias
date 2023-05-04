/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestor1;

/**
 *
 * @author 34633
 */
public class Gestor1 { 

   
    
    public void inicio(){
        
        Incidencia incidenciasss = new Incidencia(105, "No hay internet");
        Incidencia incidenciasss2 = new Incidencia(14, "No arranca");

        incidenciasss2.resuelta("Equipo no enchufado");

        System.out.println(incidenciasss.toString());
        System.out.println(incidenciasss2.toString());
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Gestor1 gestorr = new Gestor1();
        gestorr.inicio();
        
        
        
       
    }
    
}
