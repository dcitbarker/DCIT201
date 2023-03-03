<?php

class User {

    private $name;
    private $email;

	public function getName() {
		return $this->name;
	}

	public function setName($value) {
		$this->name = $value;
	}

	public function getEmail() {
		return $this->email;
	}

	public function setEmail($value) {
		$this->email = $value;
	}
}

class Admin extends User {

    public $each_users = array();

    public function deleteUser($user, $users) {
        $index = array_search($user, $users);
        unset($users[$index]);
        $users = array_values($users); // reset the index to fix null pointer error
        $this->each_users = $user;
        return $users;
    }

    public function createUser($user, $name, $email) {
        $user->setName($name);
        $user->setEmail($email);
        $this->each_users = $user;
    }

    public function updateUser($user, $users, $name, $email) {
        // aa tricky one - first, I find the index of the current object and
        // use the index to update by simply replacing
        $index = array_search($user, $users);
        if($index > -1) {
            $new_record = $users[$index];
            $new_record->setName($name);
            $new_record->setEmail($email);
            $users[$index] = $new_record;
            $this->each_users = $users;
            return $users;
        }
    }
}

?>