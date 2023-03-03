<?php
/**
 * Index/Main File
 */
include_once("classes.php");

$circle = new Cirle;
$rectangle = new Rectangle;

$circle->setName("Cirle");
$circle->setRadius(4.9);

$rectangle->setName("Rectangle");
$rectangle->setLength(6);
$rectangle->setWidth(9);

echo $circle->getName()." of radius: ".$circle->getRadius()." has Area: ".$circle->calculateArea();
echo "<p></p>";


echo $rectangle->getName()." of Length: ".$rectangle->getLength()." and Width: ".
    $rectangle->getWidth().", will have area of: ".$rectangle->calculateArea();
?>