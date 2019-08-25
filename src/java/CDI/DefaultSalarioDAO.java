/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CDI;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author itmanager
 */
public class DefaultSalarioDAO implements SalarioDAO{
    
    private static List <Salario> results = new ArrayList<Salario>();
   
    
    @Override
    public List<Salario> fetchSalarios() {
    return results;
}
    @Override
    public void ingresarSalario(int salario, String nombre, int horasExtras, int valorHorasExtras, int comision) {
    results.add(new Salario(salario, nombre,  horasExtras,  valorHorasExtras,  comision));
    }
    
}
