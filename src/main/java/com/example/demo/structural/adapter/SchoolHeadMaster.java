package com.example.demo.structural.adapter;

class SchoolHeadMaster implements HeadMaster {

	@Override
	public String manageSchool() {
		return "I am managing school";
	}

	@Override
	public String manageTeachers() {
		return "I am managing teachers";
	}

	@Override
	public String manageAdminssionProcess() {
		return "I am managing adminssion process";
	}

	@Override
	public String teachSubject() {
		return "I am teaching unknown subject";
	}
}
