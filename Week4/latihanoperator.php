<?php
$totalSeats = 45;
$occupiedSeats = 28;

echo "Total Seats: $totalSeats <br>"; 
echo "Occupied Seats: $occupiedSeats <br>";
$emptySeats = $totalSeats - $occupiedSeats;
echo "Empty Seats : $emptySeats <br>";

$emptyPercentage = ($emptySeats / $totalSeats) * 100;


echo "The percentage of seats still empty is " . $emptyPercentage . "%.";
?>