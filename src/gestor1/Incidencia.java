/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestor1;

/**
 *
 * @author 34633
 */
public class Incidencia {
    public static int id1 = 1;
    public int id2;
    public int numPuesto;
    public String desPro;
    public String estado;
    public String desSol;

   

    public Incidencia(int numPuesto, String desPro) {
        this.id2 = id1;
        this.numPuesto = numPuesto;
        this.desPro = desPro;
        this.estado = "Pendiente";
        id1 ++;
    }

    public int getId2() {
        return id2;
    }
    public int getId1() {
        return id1;
    }

    public int getNumPuesto() {
        return numPuesto;
    }

    public String getDesPro() {
        return desPro;
    }

    public String getEstado() {
        return estado;
    }

    public String getDesSol() {
        return desSol;
    }
    
    
    
  
    //setters

    public void setId2(int id2) {
        this.id2 = id2;
    }
    public void setId1(int id1) {
        this.id1 = id1;
    }

    public void setNumPuesto(int numPuesto) {
        this.numPuesto = numPuesto;
    }

    public void setDesPro(String desPro) {
        this.desPro = desPro;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setDesSol(String desSol) {
        this.desSol = desSol;
    }
    

    @Override
    public String toString() {
        if (estado == "Resuelta"){
        return "Incidencia " + id2 + " Puesto: " + numPuesto + " - " + desPro + " - " + estado + " - " + desSol ;
    }else {
            return "Incidencia " + id2 + " Puesto: " + numPuesto + " - " + desPro + " - " + estado;
        }}


//metodos
    
    public void resuelta(String desSol) {
    
        this.estado = "Resuelta";
        this.desSol = desSol;
        
    }
    




}
