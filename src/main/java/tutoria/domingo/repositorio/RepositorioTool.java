/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoria.domingo.repositorio;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import tutoria.domingo.interfaces.InterfaceTool;
import tutoria.domingo.modelo.Mensaje;
import tutoria.domingo.modelo.Tool;

/**
 *
 * @author USUARIO
 */
@Repository
public class RepositorioTool {
     @Autowired
    private InterfaceTool crud;
    

    public List<Tool> getAll(){
        return (List<Tool>) crud.findAll();       
    }
    
    public Optional <Tool> getTool(int id){
        return crud.findById(id);
    }
    
    public Tool save(Tool tool){
        return crud.save(tool);
    }
      public void delete(Tool tool){
        crud.delete(tool);
    }
    
    
}
