<?php
class Product {
    public string $name;
    public $barcode;
    private $manufacturer;

    public function __construct($name, $barcode, $manufacturer) {
        $this->name = $name;
        $this->barcode = $barcode;
        $this->manufacturer = $manufacturer;
    }

    function getName() {
        return $this->name;
    }

    function getBarCode() {
        return $this->barcode;
    }

    function getManufacturer() {
        return $this->manufacturer;
    }


}

?>