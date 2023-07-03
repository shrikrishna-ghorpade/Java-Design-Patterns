package com.example.demo.structural.adapter;

class PhysicsTeacher implements Teacher {

	@Override
	public String teachSubject() {
		return "I am taking physics lecture";
	}

	@Override
	public String giveAssinments() {
		return "I am giving physics assignments";
	}

	@Override
	public String takeAttendence() {
		return "I am taking attendence";
	}

}
