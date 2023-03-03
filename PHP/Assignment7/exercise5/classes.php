<?php
class Vehicle {
    private $make;
    private $model;
    private $year;
    private $color;
    private $engine;

	public function getMake() {
		return $this->make;
	}

	public function setMake($value) {
		$this->make = $value;
	}

	public function getModel() {
		return $this->model;
	}

	public function setModel($value) {
		$this->model = $value;
	}

	public function getYear() {
		return $this->year;
	}

	public function setYear($value) {
		$this->year = $value;
	}

	public function getColor() {
		return $this->color;
	}

	public function setColor($value) {
		$this->color = $value;
	}

	public function getEngine() {
		return $this->engine;
	}

	public function setEngine($value) {
		$this->engine = $value;
	}
}

class Engine {
    private $type;
    private $displacement;
    private $horsePower;

	public function getType() {
		return $this->type;
	}

	public function setType($value) {
		$this->type = $value;
	}

	public function getDisplacement() {
		return $this->displacement;
	}

	public function setDisplacement($value) {
		$this->displacement = $value;
	}

	public function getHorsePower() {
		return $this->horsePower;
	}

	public function setHorsePower($value) {
		$this->horsePower = $value;
	}
}

?>