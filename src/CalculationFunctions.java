import java.util.ArrayList;
import java.util.List;
import javax.swing.SwingUtilities;

/**
 * 
 */

/**
 * @author Joshua
 *
 */

public class CalculationFunctions {

	static List<Double[]> sets = new ArrayList<Double[]>();
	static List<Integer> cts = new ArrayList<Integer>();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				FieldDiagramWindow.createAndShowGui(getPoints(sets, 8, Side.TWO, Location.FRONT_HASH, 50, DirectionX.OUT, DirectionY.FRONT, 0,0), cts, 18);
			}
		});
	}

	private static List<Double[]> getPoints(List<Double[]> in, int counts, Side side, Location loc, int line, DirectionX dx, DirectionY dy, double stepsx, double stepsy) {
		cts.add(counts);
		cts.add(32);
		in.clear();
		double pt2 = (double)15/(double)8;
		double pt = (double)160/pt2;
		Double[] point = {(double) 0,(double) 0};
		Double[] point2 = {(double) 100,(double) 80};
		System.out.println(pt);

		if (side == Side.TWO) {
			
			point[0] = line + dx.getValue()*stepsx*0.625;
			
		} else {
			
			point[0] = (100-line) + dx.getValue()*stepsx*-0.625;
			
		}
		point[1] = loc.getValue() + stepsy*dy.getValue();
		System.out.println(loc.getValue());
		in.add(point);
		in.add(point2);
		System.out.println(in.toString());
		return in;
	}

	private static void createText() {
		
	}
}

enum Side {
	ONE, TWO
}

enum Location {
	FRONT_HASH(((double)160/((double)15/(double)8))/(double)3), 
	BACK_HASH((((double)160/((double)15/(double)8))/(double)3)*2), 
	BACK_SIDELINE((double)160/((double)15/(double)8)), 
	FRONT_SIDELINE(0);
	
	private final double value;

	Location(double val) {
		this.value = val;
	}

	protected double getValue() {
		return value;
	}
}

enum DirectionX {
	IN(1), OUT(-1);

	private final int value;

	DirectionX(int val) {
		this.value = val;
	}

	protected int getValue() {
		return value;
	}
}

enum DirectionY {
	FRONT(-1), BEHIND(1);

	private final int value;

	DirectionY(int val) {
		this.value = val;
	}

	protected int getValue() {
		return value;
	}
}
