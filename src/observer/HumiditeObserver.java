/**
 * 
 */
package observer;

/**
 * @author Hp
 *
 */
public class HumiditeObserver implements IObserver{

	@Override
	public void update(Observateur o) {
		System.out.println("Humidit� a chang�");
		if(o instanceof ConcretSubject)
        {       
                ConcretSubject con = (ConcretSubject) o;
                System.out.println("Humidit� a chang� : "+con.getHum());
        }  
	}

	

}
