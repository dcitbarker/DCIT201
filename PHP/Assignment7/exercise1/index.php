<?php
/**
 * Index/Main File
 */
include_once("classes.php");

$employee1 = new Employee;
$employee2 = new Employee;

$employee1->setName("Tony Shedeur");
$employee1->setAge(20);
$employee1->setGender("Male");
$employee1->setId("10981589");
$employee1->setPosition("C.E.O");
$employee1->setSalary(4500.50);

$employee2->setName("Anthony Barker");
$employee2->setAge(21);
$employee2->setGender("Male");
$employee2->setId("10981589");
$employee2->setPosition("SEO");
$employee2->setSalary(2500.50);

echo "<h2>Employer 1</h2>";
echo "Name: ".$employee1->getName()."<br />";
echo "Age: ".$employee1->getAge()."<br />";
echo "Gender: ".$employee1->getGender()."<br />";
echo "ID: ".$employee1->getId()."<br />";
echo "Position: ".$employee1->getPosition()."<br />";
echo "Salary: ".$employee1->getSalary()."<br />";

echo "<h2>Employer 2</h2>";
echo "Name: ".$employee2->getName()."<br />";
echo "Age: ".$employee2->getAge()."<br />";
echo "Gender: ".$employee2->getGender()."<br />";
echo "ID: ".$employee2->getId()."<br />";
echo "Position: ".$employee2->getPosition()."<br />";
echo "Salary: ".$employee2->getSalary()."<br />";
?>
