package Day08;

public class Car {
	
	// 1.필드
	private int speed;
	private boolean stop;
	
	// 2. 생성자
	
	
	//3. 메소드
	public int getSpeed() {
		return speed; 
		
	}
	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed =0;
			return;
		}else {
			this.speed =speed;
		}
		
	}
	public boolean isStop() {
		return stop;
	}
		public void setStop(boolean stop) {
			
			this.stop =stop;
			this.speed = 0;
		}
	
} // c e
