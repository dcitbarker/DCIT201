<?php
/**
 * Index/Main File
 */
include_once("classes.php");

$person = new Person;
$person->setFirstName("Anthony");
$person->setLastName("Barker");
$person->setAge(22);

echo "Fullname: ".$person->getFirstName()." ".$person->getLastName().", Age: ".$person->getAge()."<p></p>";

$student = new Student;
$student->setFirstName("Anthony");
$student->setLastName("Barker");
$student->setAge(25);
$student->setGradeLevel(200);
$student->setGpa(3.38);

echo "<strong>STUDENT</strong><br />";
echo "Fullname: <b>".$student->getFirstName()." ".$student->getLastName()."</b><br />";
echo "Age: <b>".$student->getAge()."</b><br />";
echo "Grade Level: <b>".$student->getGradeLevel()."</b><br />";
echo "GPA: <b>".$student->getGpa()."</b><p></p>";

$teacher = new Teacher;
$teacher->setFirstName("Tony");
$teacher->setLastName("Shedeur");
$teacher->setAge(35);
$teacher->setSubject("DCIT104, DCIT201, Math223");
$teacher->setYearsTeaching(15);


echo "<strong>TEACHER</strong><br />";
echo "Fullname: <b>".$teacher->getFirstName()." ".$teacher->getLastName()."</b><br />";
echo "Age: <b>".$teacher->getAge()."</b><br />";
echo "Subjects: <b>".$teacher->getSubject()."</b><br />";
echo "Years of Teaching: <b>".$teacher->getYearsTeaching()."</b><br />";

?>