<?php
$price = 120000;

$discountPercentage = 20;

if ($price > 100000) {
   
    $discountAmount = ($discountPercentage / 100) * $price;
    
    $finalPrice = $price - $discountAmount;
    
    echo "Original Price: Rp " . $price . "<br>";
    echo "This product get Discount: " . $discountPercentage . "%<br>";
    echo "Price after discount: Rp " . $finalPrice . "<br>";
} else {
    echo "No discount applied. Price to be paid: Rp " . $price . "<br>";
}
?>