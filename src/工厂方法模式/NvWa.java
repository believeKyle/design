package 工厂方法模式;

public class NvWa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractHumanFactory yinYanglu = new HumanFactory();
		System.out.println("--造出的第一批人是白色人种");
		
		Human whiteHuman = yinYanglu.createHuman(WhiteHuman.class);
		whiteHuman.getColor();
		whiteHuman.talk();
		
		System.out.println("\n--造出的第二批人是黑色人种");
		Human blackHuman = yinYanglu.createHuman(BlackHuman.class);
		blackHuman.getColor();
		blackHuman.talk();
		
		System.out.println("\n--造出的第三批人是黄色人种");
		Human yellowHuman = yinYanglu.createHuman(YelloHuman.class);
		yellowHuman.getColor();
		yellowHuman.talk();
	}

}
