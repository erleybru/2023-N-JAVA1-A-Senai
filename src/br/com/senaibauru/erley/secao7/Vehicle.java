/**
 * 
 */
package br.com.senaibauru.erley.secao7;

/**
 * @author Erley Barbosa
 *
 */
public class Vehicle {

	/**
	 * @param args
	 */
    // A classe Vehicle possue dois campos
    private String make;
    private int milesPerGallon;
    
    // constructor
    public Vehicle(){
        // Inicializa campos
        make = "";
        milesPerGallon = 0;
    } // fim do constructor
    
    public void setMilesPerGallon(int mpg) {
        milesPerGallon = mpg;
    } // fim do método setMilesPerGallon
    
    public void setMake(String makeName){
        make = makeName;
    }
    
    public String getMake(){
        return make;
    } // fim do método getMake
    
    public int getMilesPerGallon(){
        return milesPerGallon;
    } // fim do método getMillesPerGallon
	
	public static void main(String[] args) {
        // instanciando o objeto myCar da classe Vehicle
        Vehicle myCar = new Vehicle();
        myCar.setMake("Ford");
        myCar.setMilesPerGallon(10);
	}

}
