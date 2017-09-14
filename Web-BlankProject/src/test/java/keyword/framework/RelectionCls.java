package keyword.framework;

import java.lang.reflect.Field;

public class RelectionCls {
	static Object object;
	public static void main(String[] args) {
		 Class<?> validationClass = object.getClass();
		 for (Field field: validationClass.getDeclaredFields()) {
			 		System.out.println(field);
	        }
	
	}
}
