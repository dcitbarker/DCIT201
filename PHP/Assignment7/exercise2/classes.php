<?php
abstract class Shape {

    private $name;

	public function getName() : string {
		return $this->name;
	}

	public function setName(string $value) {
		$this->name = $value;
	}

    abstract function calculateArea();
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

	public function getLength() : float {
		return $this->length;
	}

	public function setLength(float $value) {
		$this->length = $value;
	}

	public function getWidth() : float {
		return $this->width;
	}

	public function setWidth(float $value) {
		$this->width = $value;
	}

	public function calculateArea() {
        return $this->length * $this->width;
	}
}

?>