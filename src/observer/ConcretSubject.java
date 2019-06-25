/**
 * 
 */
package observer;
import java.util.ArrayList;

/**
 * @author ADAMA SOW
 *
 */
public class ConcretSubject implements Observateur{
	private ArrayList<IObserver> tabObservateur;// Tableau d'observateurs.
	private float Temp;
	private float Hum;
	@Override
	public void Register(IObserver o) {
		// TODO Auto-generated method stub
		tabObservateur.add(o);
		System.out.println("Register");
		
		
	}

	@Override
	public void Unregister(IObserver o) {
		//tabObservateur.remove(o);
		System.out.println("Unregister");
	}

	/**
	 * @param tabObservateur
	 * @param temp
	 * @param hum
	 */
	public ConcretSubject() {
		super();
		this.tabObservateur = new ArrayList();
		Temp = 0;
		Hum = 0;
	}

	@Override
	public void notifyObservateur() {
		 for(int i=0;i<tabObservateur.size();i++)
         {
                 IObserver o = (IObserver) tabObservateur.get(i);
                 o.update(this);// On utilise la méthode "tiré".
         }
		
	}

	
	public float getTemp() {
		// TODO Auto-generated method stub
		return Temp;
	}

	public float getHum() {
		// TODO Auto-generated method stub
		return Hum;
	}

	/**
	 * @param temp the temp to set
	 */
	public void setTemp(float temp) {
		this.Temp = temp;
		notifyObservateur();
	}

	/**
	 * @param hum the hum to set
	 */
	public void setHum(float hum) {
		this.Hum = hum;
		notifyObservateur();
	}

	public float getHumTemp() {
		// TODO Auto-generated method stub
		return 2*Temp+3*Hum;
	}

}
