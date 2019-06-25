/**
 * 
 */
package observer;

/**
 * @author Hp
 *
 */
public class TempHumObserver implements IObserver{


	@Override
	public void update(Observateur o) {
		// TODO Auto-generated method stub
		  ConcretSubject con = (ConcretSubject) o;
		System.out.println("Humidité a changé : "+con.getHumTemp());
	}

}
