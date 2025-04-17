package kadai_015;

public class Car_Chapter15 {

	private int gear = 1; //初期ギア
	private int speed = 10; //初期速度

	//ギアチェンジメソッド
	public void gearChange(int afterGear) {
		System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");
		this.gear = afterGear;
		
		
		//ギアが1～5の範囲なら、そのギアに応じた速度
		if (afterGear >= 1 && afterGear <= 5) {
			this.speed = afterGear * 10;
		}else {
			
			//範囲外なら時速10km
			this.speed = 10;
		}
		
	}

	//走行メソッド
	public void run() {
		System.out.println("速度は時差" + this.speed + "kmです");
	}
	

}
