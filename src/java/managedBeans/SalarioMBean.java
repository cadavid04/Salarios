/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBeans;

import CDI.Salario;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import session.salarioManager;

/**
 *
 * @author itmanager
 */
@Named(value = "salarioMBean")
@SessionScoped
public class SalarioMBean implements Serializable{

   
    public SalarioMBean() {
    }
    
    @EJB
    private salarioManager salariomanager;
    private List <Salario> salarios;
    private Salario salario;
    

    public List <Salario>fetchSalarios() {
        if((salarios == null) || (salarios.isEmpty())) refresh();
       return salarios; 
    }
    
    private void refresh() {
        salarios = salariomanager.fetchSalarios();
    }
    
}
