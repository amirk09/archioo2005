/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatrice;

/**
 *
 * @author adeni
 */

public class Division implements Operation {
	
    /**
     *
     * @param x
     * @param y
     * @return
     * @throws MonException
     */
    @Override
	public int calculate(int x, int y) throws MonException {
		
                if(y == 0){
                    throw new MonException(MonEnumException.UTILISATION_DU_ZERO.getCode(),MonEnumException.UTILISATION_DU_ZERO.getDefaultMessage());
                }
                return x/y;
            
	}

	
}
 