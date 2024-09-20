<?php
$grades = [85, 92, 78, 64, 90, 75, 88, 79, 70, 96];

echo "Grades all : ";
foreach($grades as $gradeall){
    echo "$gradeall  ";
}

$highest1 = $grades[0]; 
$highest2 = $grades[0];
$lowest1 = $grades[0];
$lowest2 = $grades[0];

foreach ($grades as $grade) {
    if ($grade > $highest1) {
        $highest1 = $grade;
    }
    if ($grade < $lowest1) {
        $lowest1 = $grade;
    }
}
foreach ($grades as $grade) {
    if ($grade > $highest2 && $grade != $highest1) {
        $highest2 = $grade;
    }
    if ($grade < $lowest2 && $grade != $lowest1) {
        $lowest2 = $grade;
    }
}

$total = 0;
foreach ($grades as $grade) {
    $total += $grade;
}
echo "<br>";
echo "<br>";

echo "Grades after removing the two highest and two lowest: ";

$removedCount = 0; // To count how many grades are removed (2 highest and 2 lowest)

foreach ($grades as $grade) {
    if (($grade == $highest1 || $grade == $highest2 || $grade == $lowest1 || $grade == $lowest2) && $removedCount < 4) {
        // Skip the highest and lowest values (but only skip two occurrences)
        $removedCount++;
        continue;
    }
    echo "$grade ";
}
echo "<br>";
echo "<br>";
$total -= ($highest1 + $highest2 + $lowest1 + $lowest2);
echo "Total after removing two highest and two lowest grades: " . $total . "<br>";
$average = $total / (count($grades) - 4);
echo "Average after removing two highest and two lowest grades: " . $average . "<br>";
?>