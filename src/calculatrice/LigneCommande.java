package calculatrice;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author adeni
 */
import java.util.Scanner;

public class LigneCommande implements IHM {
	
	
	public void Operator() {
		launch();
	}

	@Override
	public void launch() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez votre opération: ");
		char op=sc.nextLine().charAt(0);
		
		
		System.out.println("Entrez x: ");
		double x = sc.nextDouble();
		
		System.out.println("Entrez y: ");
		double y = sc.nextDouble();
		
		try {
			double resultat = Operator.execute(x, y, op);
			System.out.println("resultat : " + resultat);

		} catch (MonException e1) {
			e1.getDefaultMessage();
		}finally {
			sc.close();
		}

                
	}
        
        
	

}

