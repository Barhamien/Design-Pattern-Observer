/**
 * 
 */
package observer;

import java.util.List;
import java.util.Observer;

/**
 * @author ADAMA SOW
 *
 */
public interface Observateur {
	//private List <Observer> observers;
	public void Register(IObserver o);
	public void Unregister(IObserver o);
	public void notifyObservateur();
	//public void notify();
}
