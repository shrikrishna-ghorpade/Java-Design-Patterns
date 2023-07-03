package com.example.demo.structural.adapter;

class MathsTeacher implements Teacher {

	@Override
	public String teachSubject() {
		return "I am taking maths lecture";
	}

	@Override
	public String giveAssinments() {
		return "I am giving maths assignments";
	}

	@Override
	public String takeAttendence() {
		return "I am taking attendence";
	}
}
