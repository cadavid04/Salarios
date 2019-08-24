/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CDI;

import javax.enterprise.inject.Alternative;

/**
 *
 * @author itmanager
 */
@Alternative
public class DefaultSalarioValidator implements SalarioValidator {

    @Override
    public boolean IsValido(Salario salario) {
      return  salario.getSalario() == 0;
    }
    
}
