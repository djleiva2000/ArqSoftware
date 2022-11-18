/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_arq_software;

/**
 *
 * @author diegoleivaespin
 */
public class Prueba {
    public static void main(String[] args) {
        
        Prueba activity = new Prueba();
        activity.crearActivity("Consulta tarea ");
        
    }

    public void crearActivity(String tipoActivity) {
        Tarea ac= GestionDeber.getActivity(tipoActivity);
        ac.crear();
    }
    public void editarActivity(String tipoActivity) {
        Tarea ac= GestionDeber.getActivity(tipoActivity);
        ac.editar();
    }
    
}
