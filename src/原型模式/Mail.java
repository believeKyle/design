package 原型模式;

import java.util.Collection;

public class Mail implements Cloneable{
	private String reveiver;
	private String subject;
	private String appellation;
	private String context;
	private String tail;
	
	public Mail(AdvTemplate advTemplate) {
		this.context = advTemplate.getAdvContext();
		this.subject = advTemplate.getAdvSubject();
	}
	
	@Override
	public Mail clone() {
		Mail mail = null;
		try {
			mail = (Mail)super.clone();
		}catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return mail;
	}
	
	public String getReveiver() {
		return reveiver;
	}
	public void setReveiver(String reveiver) {
		this.reveiver = reveiver;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getAppellation() {
		return appellation;
	}
	public void setAppellation(String appellation) {
		this.appellation = appellation;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public String getTail() {
		return tail;
	}
	public void setTail(String tail) {
		this.tail = tail;
	}
	
}
