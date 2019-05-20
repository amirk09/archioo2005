/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatrice;

/**
 *
 * @author adenis/Amir
 */

public class Operator {
	
	private static Operation operation;

	public static int execute(int x, int y, char op) throws MonException {
		operation=CalculatorConfig.getOperator(op);
		return operation.calculate(x, y);
	}

}

