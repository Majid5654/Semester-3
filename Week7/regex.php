<?php
$pattern = '/[a-z]/';
$text = 'This is a Sample text.';

if (preg_match($pattern,$text)) {
    echo "<p> Huruf kecil ditemukan! </p>";
}

else{
    echo "Tidak ada huruf kecil!";
}

$pattern = '/[0-9]+/';
$text = 'There are 123 apples.';
if (preg_match($pattern,$text,$matches)) {
    echo "<p> Cocokkan : </p>" . $matches[0];
}

else {
    echo "<p>Tidak ada yang cocok</p>";
}
$pattern = '/apple/';
$replacement = 'banana';
$text = 'I like apple pie';
$new_text = preg_replace($pattern,$replacement,$text);
echo "<p>  $new_text </p>";



$pattern = '/[o]{1,3}/';
$text = 'god is good';
if (preg_match($pattern,$text,$matches)) {
    echo "<p> Cocokkan : </p>" . $matches[0];
}
else{
    echo "<p>Tidak ada yang cocok</p>";
}







?>