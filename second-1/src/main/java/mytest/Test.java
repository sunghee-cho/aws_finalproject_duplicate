package mytest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Test {
	
	public static void test() {
		List<Map<String, String>> attendancelist = new ArrayList();
		
		for(int i= 1; i <=3; i++) {
			for(int j = 1; j <= 2; j++) {
			Map<String, String> atten = new HashMap();
			atten.put("Attendance_Time", "08:30:2"+i);
			atten.put("User_Name", "김o미"+j);
			atten.put("Attendance_etc", "");
			atten.put("Attendance_Status", "1");
			atten.put("Attendance_Date", "2021-03-1"+i);
			attendancelist.add(atten);
			}
		}
		//초기데이터확인
		for(Map<String, String> one : attendancelist) {
			System.out.println(one);
		}
		
		
		Set<String> nameset = new HashSet();
		//User_Name 만 추출하여 Set으로 저장
		for(Map<String, String> one : attendancelist) {
			nameset.add(one.get("User_Name"));
		}
		
		//nameset만큼 Map 생성		
		List<Map<String, Object>> resultlist = new ArrayList();
		for(String onename :nameset) {
			Map<String, Object> namemap = new HashMap();
			namemap.put("User_name", onename);
			Map<String, String> atten = new HashMap();
			for(Map<String, String> one : attendancelist) {
				if(onename.equals(one.get("User_Name"))) {
					atten.put("Attendance_Date_Time", 
							one.get("Attendance_Date")+" "+one.get("Attendance_Time"));
				}
				namemap.put("Attendance", atten);
			}//inner for
			resultlist.add(namemap);
		}//outer for
		
		System.out.println("==>"+resultlist.size());
		//결과확인
		for(Map<String, Object> one : resultlist) {
			System.out.println(one.get("User_name"));
			System.out.println(one.get("Attendance"));
		}
	}
	public static void main(String args[]) {
		test();
	}
}
