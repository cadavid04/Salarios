/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CDI;

import java.util.List;

/**
 *
 * @author itmanager
 */
public interface SalarioDAO {
    
    public List<Salario> fetchSalarios();
    public void ingresarSalario(int salario, String nombre, int horasExtras, int valorHorasExrtras, int comision);
    
}
