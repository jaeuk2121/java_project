package co.yedam.inheritance;

public class MainExe {
	
	public static void main(String[] args) {
		CellPhone cell = new CellPhone();
		cell.setModel("SM1100");
		cell.setColor("black");
		cell.turnOn();
		cell.turnOff();
		
		DmbCellPhone dmb = new DmbCellPhone();
		dmb.setModel("dmb1100");
		dmb.setColor("white");
		dmb.turnOn(); //dmb1100의 전원을 켭니다
		dmb.turnOnDmb();
		
		CellPhone cell2 = new CellPhone(); //promotion
		cell2.turnOn();
		//cell2.turnOnBmb(); //불가.
		
		
		
		if(cell2 instanceof DmbCellPhone) {
			
		DmbCellPhone dmb2 = (DmbCellPhone) cell2; //casting
		dmb2.turnOnDmb(); //자식클래스에 정의된 기능 사용. //작동안됨?;
		}
		
		if(cell instanceof DmbCellPhone) {
			DmbCellPhone dmb3 = (DmbCellPhone) cell;
			dmb3.turnOnDmb();
		}
		//
		CellPhone[] phones = new CellPhone[5];
		phones[0] = cell;
		phones[1] = dmb;
		
		phones[0].turnOn(); //CellPhone 인스턴스
		phones[1].turnOn(); //DmbCellPhone 인스턴스
		
	}
		
}
