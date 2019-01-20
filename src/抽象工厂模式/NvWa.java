package 抽象工厂模式;

public class NvWa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HumanFactory maleHumanFactory = new MaleFactory();
		HumanFactory femaleHumanFactory = new FemaleFactory();
		
		Human maleYellowHuman = maleHumanFactory.createYellowHuman();
		Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
		
		System.out.println("------生产第一个黄色女性------");
		femaleYellowHuman.getColor();
		femaleYellowHuman.getSex();
		femaleYellowHuman.talk();
		
		System.out.println("\n-------生产第一个黄色男性--------");
		maleYellowHuman.getColor();
		maleYellowHuman.getSex();
		maleYellowHuman.talk();
	}

}
