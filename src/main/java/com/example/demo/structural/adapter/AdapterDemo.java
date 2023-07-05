package com.example.demo.structural.adapter;

class AdapterDemo {

	public static void main(String[] args) {

		/** Creating maths teacher object */
		Teacher mathTeacher = new MathsTeacher();
		System.out.println(mathTeacher.teachSubject());

		/** Creating physics teacher object */
		Teacher physicsTeacher = new PhysicsTeacher();
		System.out.println(physicsTeacher.teachSubject());

		/** Creating plain head-master object */
		HeadMaster headMaster = new SchoolHeadMaster();
		System.out.println(headMaster.manageSchool());
		System.out.println(headMaster.teachSubject());

		/** Creating adapted head-master who can teach mathematics */
		HeadMaster headMasterAdapter = new SchoolHeadMasterAdapter(new MathsTeacher());
		System.out.println(headMasterAdapter.manageSchool());
		System.out.println(headMasterAdapter.teachSubject());
	}
}
