<?php
class Person {

    private $name;
    private $age;
    private $gender;

    public function getName() {
        return $this->name;
    }

    public function setName($name) {
        $this->name = $name;
    }

    public function getAge() {
        return $this->age;
    }

    public function setAge($age) {
        $this->age = $age;
    }

    public function getGender() {
        return $this->gender;
    }

    public function setGender($gender) {
        $this->gender = $gender;
    }
}

class Employee extends Person {

    private $id;
    private $position;
    private $salary;

    public function getId() {
        return $this->id;
    }

    public function setId($id){
        $this->id = $id;
    }

    public function getPosition() {
        return $this->position;
    }

    public function setPosition($position) {
        $this->position = $position;
    }
    public function getSalary() {
        return $this->salary;
    }

    public function setSalary($salary) {
        $this->salary = $salary;
    }
}

class Manager extends Employee {

    private $bonus;

    public function getBonus(){
        return $this->bonus;
    }

    public function setBonus($bonus){
        $this->bonus = $bonus;
    }
}
?>