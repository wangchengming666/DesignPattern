package example;

public class Message implements Cloneable {

	private String receiver;

	private String subject;

	private String content;

	public Message(Temeplate temeplate) {
		this.subject = temeplate.getSubject();
		this.content = temeplate.getContent();
	}
	
	@Override
	public Message clone() {
		Message msg = null;
		try {
			msg = (Message)super.clone();
		}catch(CloneNotSupportedException ex) {
			ex.printStackTrace();
		}
		return msg;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
