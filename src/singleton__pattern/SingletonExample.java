package singleton__pattern;

import java.io.Serializable;

public class SingletonExample implements Serializable, Cloneable {

	private static final long serialVersionUID = 1852106042811392725L;
	private static SingletonExample instance;
	
	private SingletonExample() {
		
	}
	
	public static SingletonExample getInstance() {
		if(instance == null) {
			synchronized(SingletonExample.class) {
				if(instance == null) {
					instance = new SingletonExample();
				}				
			}
		}
		return instance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		throw new CloneNotSupportedException();
	}
	
	protected Object readResolve() {
		return instance;
	}

}
