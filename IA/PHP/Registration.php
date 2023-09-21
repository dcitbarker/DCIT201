<?php
class StudentRegistration {

    private $studentName;
    private $registrationDate;

	public function getStudentName() {
		return $this->studentName;
	}

	public function setStudentName($name) {
		$this->studentName = $name;
	}

	public function getRegistrationDate() {
		return $this->registrationDate;
	}

	public function setRegistrationDate($date) {
		$this->registrationDate = $date;
	}

    public function daysSinceRegistration(){
        $timestamp = strtotime($this->getRegistrationDate());
        $difference = time() - $timestamp;
        $ago = intval($difference/60/60/24);
        return $ago;
    }
}

$student = new StudentRegistration();

$student->setStudentName("Anthony Shedeur Barker");
$student->setRegistrationDate("2023-03-10 12:00 PM");

echo "Student: ".$student->getStudentName()."\n";
echo "Registration Date: ".$student->getRegistrationDate()."\n";
echo "Days Ago: ".$student->daysSinceRegistration()."\n";

?>