package ch05;

class AutoSaveThread extends Thread {
	public void save() {
		System.out.println("작업 내용을 저장합니다.");
		
	}
	
	@Override
	public  void run () {
		while(true) {
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
			save();
		}
	}
	
	
}

public class DaemonEx {

	public static void main(String[] args) {
		AutoSaveThread a = new AutoSaveThread();
		a.setDaemon(true);
		a.start();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			
		}
		System.out.println("메인 쓰레드 종료");

	}

}
