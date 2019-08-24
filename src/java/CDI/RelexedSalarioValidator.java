package CDI;


import javax.enterprise.inject.Alternative;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author itmanager
 */
@Alternative
public class RelexedSalarioValidator implements SalarioValidator{

    @Override
    public boolean IsValido(Salario salario) {
        return salario.getHorasExtras()>0;
    
}
    }

