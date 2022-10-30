package com.w2a.inheritance;

public class App {

	public static void main(String[] args) {
		Students s1 = new Students();
		s1.markAttendance();
		s1.doExercise();

		Teachers t = new Teachers();
		t.markAttendance();

		Staff s = new Staff();
		s.markAttendance();
		s1.breakTime();
		t.breakTime();
		s.breakTime();
		SchoolBase sb = new SchoolBase();
		sb.breakTime();
	}
}
