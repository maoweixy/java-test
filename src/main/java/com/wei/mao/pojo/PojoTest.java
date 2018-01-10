package com.wei.mao.pojo;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 毛伟
 * @Date 8/23/17  15:10
 */
public class PojoTest {
	public static void main(String args[]) throws ClassNotFoundException {
		//JSONObject object = JSONObject.parseObject("{\n" +
		//		"        \"result\": {\n" +
		//		"            \"feature_id\": 33,\n" +
		//		"            \"events_value\": null,\n" +
		//		"            \"events_name\": null,\n" +
		//		"            \"feature_value\": \"{\\\"timeused\\\": \\\"220.847\\\",\\\"tags\\\": \\\"asd\\\"}\",\n" +
		//		"            \"status\": 0\n" +
		//		"        }\n" +
		//		"    }");
		//
		//System.out.println(object.getJSONObject("result"));
		//JSONObject obi = JSONObject.parseObject(object.getJSONObject("result").getString("feature_value"));
		//obi.remove("timeused");

		//String string = "listByUserIdAndDate";
		//List<Character> list = new ArrayList<>();
		//List<Character> result = new ArrayList<>();
        //
		//for (char c:string.toCharArray()) {
		//	list.add(c);
		//}
		//System.out.println("start");
		//for (int i = 0; i < list.size(); i++) {
		//	if (Character.isUpperCase(list.get(i))){
		//		result.add(Character.toLowerCase(list.get(i)));
		//		result.add(result.size()-1,'-');
		//	}else {
		//		result.add(list.get(i));
		//	}
		//}
		//String str = "";
		//System.out.println("end");
		//for (int i = 0; i < result.size(); i++) {
		//	str += result.get(i);
		//}
		//System.out.println(str);

		String string = "get-the-day-before-info";
		List<Character> list = new ArrayList<>();
		List<Character> result = new ArrayList<>();

		for (char c:string.toCharArray()) {
			list.add(c);
		}
		result.add(list.get(0));
		for (int i = 1; i < list.size(); i++) {
			if (Character.isLetter(list.get(i))) {
				if (list.get(i - 1) == '-') {
					result.add(Character.toUpperCase(list.get(i)));
				} else {
					result.add(list.get(i));
				}
			}
		}
		String str = "";
		System.out.println("end");
		for (int i = 0; i < result.size(); i++) {
			str += result.get(i);
		}
		System.out.println(str);

	}
}
