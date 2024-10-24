<?php
error_reporting(E_ALL);
ini_set('display_errors', 1);

$ROOM_PRICES = [
    "Standard" => 5000,
    "Superior" => 6000,
    "Deluxe" => 7000
];

if (!isset($_POST['floor'], $_POST['type'], $_POST['days'], $_POST['discount'])) {
    echo "Incomplete form submission.";
    exit;
}

$floor = (int)$_POST['floor'];
$type = $_POST['type'];
$days = (int)$_POST['days'];
$discount = $_POST['discount'];

if (!array_key_exists($type, $ROOM_PRICES)) {
    echo "Invalid room type.";
    exit;
}

$base_price = $ROOM_PRICES[$type] * $days;

$additional_charge = ($floor > 5) ? 1000 : 0;

$discount_amount = 0;
if ($discount === "Member") {
    $discount_amount = 0.10 * $base_price;
} elseif ($discount === "Birthday") {
    $discount_amount = 500;
}


$total_price = ($base_price + $additional_charge) - $discount_amount;


echo "<h3>Price Check Result</h3>";
echo "<p><strong>Floor:</strong> $floor</p>";
echo "<p><strong>Room Type:</strong> $type</p>";
echo "<p><strong>Days:</strong> $days</p>";
echo "<p><strong>Discount:</strong> $discount</p>";
echo "<hr>";
echo "<p><strong>Total Price:</strong> IDR " . number_format($total_price, 0, ',', '.') . "</p>";
?>
