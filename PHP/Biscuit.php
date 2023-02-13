<?php
require_once "Product.php";
class Biscuit extends Product {
    
    public function __construct() {
        parent::__construct("Pikadili", "001", "Unileval");
        
    }

    public function getBarCode() {
        return "B".parent::getBarCode();
    }

    public static function myStaticMethod() {
        echo "I am static<br />";
    }

}





?>