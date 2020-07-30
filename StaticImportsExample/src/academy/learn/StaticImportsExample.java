package academy.learn;

import static java.lang.Math.PI;
import static java.lang.Math.min;
import static java.lang.System.out;
import static academy.learn.Config.*;

/**
 * 
 * @author Sai Paresh
 *
 */
public class StaticImportsExample {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int min = Math.min(2, 3);
		int min = min(3, 5);
		out.println(min);
//		System.out.println(Math.PI);
		out.println(PI);
//		Config.printConfig();
		printConfig();
		out.println("Name = "+ NAME); 
		out.println("Count = " + COL_COUNT);
	}

}
