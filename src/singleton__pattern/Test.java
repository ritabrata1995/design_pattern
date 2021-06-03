package singleton__pattern;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) {
		SingletonExample s1 = SingletonExample.getInstance();
		SingletonExample s2 = SingletonExample.getInstance();
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("singleton.dat")))){
			
			oos.writeObject(s1);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("singleton.dat"))){
			
			s2 = (SingletonExample) ois.readObject();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println(s1 == s2);
	}

}
