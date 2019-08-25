/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CDI;

import java.util.ArrayList;
import java.util.List;

import managedBeans.SalarioMBean;


/**
 *
 * @author itmanager
 */

public class DefaultSalarioDAO implements SalarioDAO{
   
   
    SalarioMBean salarioMbean = new SalarioMBean(); 
    
    @Override
    public List<Salario> fetchSalarios() {
    List <Salario> results = salarioMbean.fetchSalarios();
    return results;
}
    @Override
    public void ingresarSalario(int salario, String nombre, int horasExtras, int valorHorasExtras, int comision) {
    
    }
    
}
