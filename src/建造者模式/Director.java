package 建造者模式;

import java.util.ArrayList;

public class Director {
	private ArrayList<String> sequence = new ArrayList();
	private BenzBuilder benzBuilder = new BenzBuilder();
	private BMWBuilder bmwBuilder = new BMWBuilder();
	
	public BenzModel getABenzModel() {
		this.sequence.clear();
		this.sequence.add("start");
		this.sequence.add("stop");
		this.benzBuilder.setSequence(this.sequence);
		return (BenzModel)this.benzBuilder.getCarModel();
	}
}
