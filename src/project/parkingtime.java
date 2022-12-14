package project;
import java.util.Random;

public class parkingtime {
	
	public static void main(String[] args) {
	    Random random = new Random();

	    // 產生 100 筆隨機時間
	    for (int i = 0; i < 100; i++) {
	      // 產生隨機小時 (0-23) 和分鐘 (0-59)
	      int hour = random.nextInt(24);
	      int minute = random.nextInt(60);

	      // 將小時和分鐘格式化為時間字串 (例如: 22:15)
	      String time = String.format("%02d:%02d", hour, minute);
	      System.out.println(time);
	    }
	  }
}