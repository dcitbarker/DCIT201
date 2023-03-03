<?php
/**
 * Index/Main File
 */
include_once("classes.php");

$vehicle = new Vehicle;
$vehicle->setMake("Toyota");
$vehicle->setModel("RAV4");
$vehicle->setColor("Silver");
$vehicle->setYear(2018);

$engine = new Engine;
$engine->setType("2.5L");
$engine->setDisplacement(3.7);
$engine->setHorsepower(250);

// set engine instance to Vehicle
$vehicle->setEngine($engine);

// printing all details of Vehicle
echo "<strong>Vehicle Details With Engine Records:</strong><br />";
echo "Make: ".$vehicle->getMake()."<br />";
echo "Model: ".$vehicle->getModel()."<br />";
echo "year: ".$vehicle->getYear()."<br />";
echo "Color: ".$vehicle->getColor()."<p></p>";

echo "<strong>Engine Record:</strong><br />";
echo "Type: ".$vehicle->getEngine()->getType()."<br />";
echo "Displacement: ".$vehicle->getEngine()->getDisplacement()."<br />";
echo "HorsePower: ".$vehicle->getEngine()->getHorsepower();

?>