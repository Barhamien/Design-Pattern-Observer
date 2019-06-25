/**
 * 
 */
package observer;

/**
 * @author Hp
 *
 */
public class MainTesting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcretSubject con=new ConcretSubject();
		TemperatureObserver temp=new TemperatureObserver();
		HumiditeObserver hum=new HumiditeObserver();
		TempHumObserver tempHum=new TempHumObserver();
		con.Unregister(tempHum);
		con.setTemp(35);
		con.setHum(75);
	}

}
