<?php
/**
 * Index/Main File
 */
include_once("classes.php");

$users = array();

$user1 = new User();
$user2 = new User();
$user3 = new User();
$user4 = new User();

$admin = new Admin;
$admin->createUser($user1, "Tony Shedeur 1", "abarker@st.ug.edu.gh");
$users[] = $admin->each_users;
$admin->createUser($user2, "Tony Shedeur 2", "abarker@st.ug.edu.gh");
$users[] = $admin->each_users;
$admin->createUser($user3, "Tony Shedeur 3", "abarker@st.ug.edu.gh");
$users[] = $admin->each_users;
$admin->createUser($user4, "Tony Shedeur 4", "abarker@st.ug.edu.gh");
$users[] = $admin->each_users;

echo "<strong>Array After Creating Some Users:</strong><br />";
for($i=0; $i<count($users); $i++) {
    echo $users[$i]->getName()." - ".$users[$i]->getEmail()."<br />";
}

echo "<p></p>";
echo "<strong>Array After Deleting 3rd User:</strong><br />";

$users = $admin->deleteUser($user3, $users);

for($i=0; $i<count($users); $i++) {
    echo $users[$i]->getName()." - ".$users[$i]->getEmail()."<br />";
}

echo "<p></p>";
echo "<strong>Array After Updating 2rd User:</strong><br />";
$users = $admin->updateUser($user2, $users, "Anthony Barker", "pcshedeur@gmail.com");

for($i=0; $i<count($users); $i++) {
    echo $users[$i]->getName()." - ".$users[$i]->getEmail()."<br />";
}

?>