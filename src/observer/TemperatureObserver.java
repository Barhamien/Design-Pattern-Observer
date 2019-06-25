/**
 * 
 */
package observer;

/**
 * @author Hp
 *
 */
public class TemperatureObserver implements IObserver{


	@Override
	public void update(Observateur o) {
		// TODO Auto-generated method stub
		if(o instanceof ConcretSubject)
        {       
                ConcretSubject con = (ConcretSubject) o;
                System.out.println("Position : "+con.getTemp());
        }  
	}

}
