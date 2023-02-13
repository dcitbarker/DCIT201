<?php
//require "Product.php"
require_once "Biscuit.php";

//include "Product.php";
//include_once "Product.php";


//$product = new Product("S21ddsdddddd", "123", "Samsung");

$product = new Biscuit();

echo Biscuit::myStaticMethod();
?>
<html>

<head>
    <title>DCIT 201 - PHP</title>
</head>

<body>

    <?php
$variable = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11];
//echo $variable[1]."<br />";
foreach($variable as $key => $value) {
    echo $key. " - ".$value."<br />";
}
?>
    <table border="1">
        <thead>
            <tr>
                <th>Name</th>
                <th>Name</th>
                <th>Name</th>
                </th>
        </thead>
        <tbody>
            <tr>
                <?php
// $color = "";
// if(strlen($product->name) > 10) {
//     $color = "#0f0";
// }
// else {
//     $color = "#F00";
// }
// or
// $result = condition ? valueWhenTrue : value when false
// condistions can be chained together with && or ||
$color = strlen($product->name) <= 10 ? "#F00" : "#0f0";
$color = strlen($product->name) <= 10 ? "#F00" : ($product->getBarCode() == "123" ? "#990" : "#524");


?>
                <td style="color:<?php echo $color;?>"><?php echo $product->getName();?></td>
                <td><?php echo $product->getBarCode();?></td>
                <td><?php echo $product->getManufacturer();?></td>
            </tr>
            <?php
$i = 0;
while($i <= 10) {
    $i++;
//    echo "<tr><td>".$i."</td></tr>";
}

?>

        </tbody>

    </table>

</body>

</html>