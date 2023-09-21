<?php
interface ShapeInterface {

    function calculateArea();
}

abstract class Shape implements ShapeInterface {

    private $name;

	abstract function calculateArea();

	public function getName() {
		return $this->name;
	}

	public function setName($value) {
		$this->name = $value;
	}
}

class Cirle extends Shape {

    private $radius;

	public function getRadius() : float {
		return $this->radius;
	}

	public function setRadius(float $value) {
		$this->radius = $value;
	}

    public function calculateArea() {
        return M_PI * ($this->radius * $this->radius);
	}
}

class Rectangle extends Shape {
	
    private $length;
    private $width;

	public function getLength() {
		return $this->length;
	}

	public function setLength($value) {
		$this->length = $value;
	}

	public function getWidth() {
		return $this->width;
	}

	public function setWidth($value) {
		$this->width = $value;
	}

	public function calculateArea() {
		return $this->length * $this->width;
	}
}