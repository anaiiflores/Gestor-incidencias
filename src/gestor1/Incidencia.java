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
    public int id;
    public int numPuesto;
    public String desPro;
    public String estado;
    public String desSol;

   

    public Incidencia(int id, int numPuesto, String desPro, String estado, String desSol) {
        this.id = id;
        this.numPuesto = numPuesto;
        this.desPro = desPro;
        this.estado = "Pendiente";
        this.desSol = desSol;
    }

    public int getId() {
        return id;
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

    public void setId(int id) {
        this.id = id;
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
        return "Incidencia " + id + " Puesto: " + numPuesto + " - " + desPro + " - " + estado + "-" + desSol ;
    }


//metodos
    
    public void resuelta(String desSol) {
    
        this.estado = "resuelta";
        this.desSol = desSol;
        
    }
    




}
