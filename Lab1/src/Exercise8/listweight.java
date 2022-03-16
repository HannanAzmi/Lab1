package Exercise8;

import java.util.ArrayList;
import java.util.Iterator;
import Exercise7.CalculateWeight;

public class listweight {
	public listweight(){
		CalculateWeight weight1 = new CalculateWeight(65);
		CalculateWeight weight2 = new CalculateWeight(80);
		CalculateWeight weight3 = new CalculateWeight(78);

		ArrayList<CalculateWeight> weightlist = new ArrayList<CalculateWeight>();

		weightlist.add(weight1);
		weightlist.add(weight2);
		weightlist.add(weight3);

		Iterator<CalculateWeight> weightIt = weightlist.iterator();
		while (weightIt.hasNext()) {
			weightIt.next().Calculate();
		}
	}
}
