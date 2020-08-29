import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 
 */

/** 
 * @ClassName test22
 * @Description 
 * @author Nuclear
 */
public class UserTest {

	public static void main(String[] args) {
		User user=new User();
		user.setName("ÂíÔÆ");
		user.setAge(50);
		
		List<User> lists=new ArrayList<User>();
		for (int i = 0; i < 1000; i++) {
			lists.add(user);
		}
		
		long timestart=new Date().getTime();
		for (User u : lists) {
			u.setName("¶«¸ç");
			u.setAge(48);
		}
		System.out.println(new Date().getTime());
	}
}
