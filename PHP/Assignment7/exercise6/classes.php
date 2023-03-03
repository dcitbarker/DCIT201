<?php
class Person {

    private $firstName;
    private $lastName;
    private $age;

	public function getFirstName() {
		return $this->firstName;
	}

	public function setFirstName($value) {
		$this->firstName = $value;
	}

	public function getLastName() {
		return $this->lastName;
	}

	public function setLastName($value) {
		$this->lastName = $value;
	}

	public function getAge() {
		return $this->age;
	}

	public function setAge($value) {
		$this->age = $value;
	}
}

class Student extends Person {

    private $gradeLevel;
	private $gpa;

	public function getGradeLevel() {
		return $this->gradeLevel;
	}

	public function setGradeLevel($value) {
		$this->gradeLevel = $value;
	}

	public function getGpa() {
		return $this->gpa;
	}

	public function setGpa($value) {
		$this->gpa = $value;
	}
}

class Teacher extends Person {

    private $subject;
    private $yearsTeaching;

	public function getSubject() {
		return $this->subject;
	}

	public function setSubject($value) {
		$this->subject = $value;
	}

	public function getYearsTeaching() {
		return $this->yearsTeaching;
	}

	public function setYearsTeaching($value) {
		$this->yearsTeaching = $value;
	}
}

?>