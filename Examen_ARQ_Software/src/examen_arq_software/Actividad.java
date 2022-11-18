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
public class Actividad implements Tarea {

    @Override
    public void crear() {
        System.out.println("Crear tareas");
    }

    @Override
    public void editar() {
        System.out.println("editar tareas");
    }
    
}
