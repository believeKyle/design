package 原型模式;

import java.util.Random;

public class Client {
	private static int MAX_COUNT = 6;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		Mail mail = new Mail(new  AdvTemplate());
		mail.setTail("xxxy银行版权所有");
		while(i < MAX_COUNT) {
			Mail cloneMail = mail.clone();
			//cloneMail.setAppellation(appellation);
			mail.setAppellation(getRandString(5) +"先生(女士");
			mail.setReveiver(getRandString(5)+"@ddddd");
			sendMail(mail);
			i++;
		}
	}
	
	public static void sendMail(Mail mail) {
		System.out.println("标题："+mail.getSubject()+"\t收件人："+mail.getReveiver()+"\t...发送成功!");
	}
	
	public static String getRandString(int maxLength) {
		String source = "sdfsdfsdfdsgfgerg";
		StringBuffer sb = new StringBuffer();
		Random random = new Random();
		for(int i = 0;i < maxLength;i++) {
			sb.append(source.charAt(random.nextInt(source.length())));
		}
		return sb.toString();
	}

}
