package com.example.demo.structural.adapter;

class SchoolHeadMasterAdapter implements HeadMaster {

	private Teacher teacher;
	
	public SchoolHeadMasterAdapter(Teacher teacher) {
		super();
		this.teacher = teacher;
	}

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
		return teacher.teachSubject();
	}
}
