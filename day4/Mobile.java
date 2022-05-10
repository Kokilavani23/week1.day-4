package Week1.day4;

public class Mobile {

	public void audioCall() {
		System.out.println("audioCall");
	}
	private void videoCall() {
		System.out.println("videoCall");
	}
	protected void shareDocument() {
		System.out.println("shareDocument");
	}
	void chat() {
		System.out.println("chat");
	}
	public static void main(String[]args) {
		Mobile mob=new Mobile();
		mob.audioCall();
		mob.videoCall();
		mob.shareDocument();
		mob.chat();
		
	}
	

}


