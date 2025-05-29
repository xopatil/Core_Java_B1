package chp11;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Emp {

	String name;
	int age;

	public Emp(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", age=" + age + "]";
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

}

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp("soham", 1);
		System.out.println();

		System.out.println(emp.getClass());
		Method methods[] = emp.getClass().getMethods();
		for (int j = 0; j < methods.length; j++) {
			System.out.println(methods[j]);

		}

		Constructor constructor[] = emp.getClass().getConstructors();
		for (int i = 0; i < constructor.length; i++) {
			System.out.println(constructor[i]);
		}

		Field field[] = emp.getClass().getFields();
		for (int i = 0; i < field.length; i++) {
			System.out.println(field[i]);

		}

	}

}