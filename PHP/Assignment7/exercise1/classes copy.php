<?php
class Person {

    private $name;
    private $age;
    private $gender;

	public function getName() {
		return $this->name;
	}

	public function setName($value) {
		$this->name = $value;
	}

	public function getAge() {
		return $this->age;
	}

	public function setAge($value) {
		$this->age = $value;
	}

	public function getGender() {
		return $this->gender;
	}

	public function setGender($value) {
		$this->gender = $value;
	}
}