package co.yedam.inheritance;

public class CellPhone extends Object {
	private String model;
	public String getModel() {
		return model;
	}

	private String color;
	
	CellPhone(){
	
		
	}
	public void turnOn() {
		System.out.println("전원을 켭니다");
	}
		public void turnOff() {
			System.out.println("전원을 끕니다");
		}
	
		
		public void setModel(String model) {
			this.model = model;
		}
		
		public String getColor() {
			return color;
		}
		
		public void setColor(String color) {
			this.color = color;
		}
		@Override//재정의
		public String toString() {
			//return super.toString();
			return color + ", " + model;
		}
}
