package uiMain;
import java.util.*;

public class uiMain {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		while(true) {
			System.out.println();
			System.out.println("-----------------------------");
			System.out.println("Bienvenido a la TransPOOrtadora : "); 
			System.out.println("Escoja una opcion:");
			System.out.println("1. Ver vehiculos.");
			System.out.println("2. Ver bodega.");  
			System.out.println("3. Ver carga."); 
			System.out.println("4. Ver bodega.");    
			System.out.println("5. Ver Auxiliar de bodega.");      
			System.out.println("0. Salir.");	        
			System.out.println();
			String option = input.next();
	            if (option.equals("1")) {
	            	System.out.println("probando 1"); 
	            }else if (option.equals("2")) {
	            	System.out.println("probando 2"); 
	            }else if(option.equals("3")){
	            	System.out.println("probando 3"); 
	            }else if (option.equals("4")) {
	            	System.out.println("probando 4"); 
	            }else if(option.equals("5")){
	            	System.out.println("probando 5"); 
	            }else if(option.equals("0")){
	            	System.out.println("todo bien todo correcto"); 
	                break;
	            }
	        }
		
	}

}
