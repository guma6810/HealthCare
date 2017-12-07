import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CenterHR centerHR = new CenterHR();
		
		//현재시간을 위한 Quick Test이다...
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy:MM:dd-hh:ss");
		String dateTime = sdf1.format(cal.getTime());
		System.out.println(dateTime);
		
		//Login Test...
		//getArrtibute from Login page...
		String id = "s@naver.com";
		String pass = "1234";
		int type = 1; //회원을 의미
		
		CenterHR chr = new CenterHR();
		chr.AcceptLogin(id, pass, type);
		
		
	}

}
