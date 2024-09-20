<?php
$a = 10;
$b = 5;

$hasilTambah = $a + $b;
$hasilKurang = $a - $b;
$hasilKali = $a * $b;
$hasilBagi = $a / $b;
$sisaBagi = $a % $b;
$pangkat = $a ** $b;


echo "Hasil Penjumlahan: $hasilTambah <br>";
echo "Hasil Pengurangan: $hasilKurang <br>";
echo "Hasil Perkalian: $hasilKali <br>";
echo "Hasil Pembagian: $hasilBagi <br>";
echo "Sisa Bagi: $sisaBagi <br>";
echo "Hasil Pangkat: $pangkat <br>";
echo "<br>";
echo "<br>";

$hasilSama = $a == $b;
$hasilTidakSama = $a != $b;
$hasilLebihkecil = $a < $b;
$hasilLebihBesar = $a > $b;
$hasilLebihKecilSama = $a <= $b;
$hasilLebihBesarSama = $a >= $b;

echo "Apakah $a sama dengan $b " . ($hasilSama ? 'true' : 'false') . "<br>";
echo "Apakah $a tidak sama dengan $b ? " . ($hasilTidakSama ? 'true' : 'false') . "<br>";
echo "Apakah $a lebih kecil dari $b ? " . ($hasilLebihkecil ? 'true' : 'false') . "<br>";
echo "Apakah $a lebih besar dari $b ? " . ($hasilLebihBesar ? 'true' : 'false') . "<br>";
echo "Apakah $a lebih kecil atau sama dengan $b ? " . ($hasilLebihKecilSama ? 'true' : 'false') . "<br>";
echo "Apakah $a lebih besar atau sama dengan $b ? " . ($hasilLebihBesarSama ? 'true' : 'false') . "<br>";

$hasilAnd = $a && $b;
$hasilOr = $a || $b;
$hasilNotA = !$a;
$hasilNotB = !$b;
echo "<br>";
echo "<br>";
echo "Hasil AND: " . ($hasilAnd ? 'true' : 'false') . "<br>";
echo "Hasil OR: " . ($hasilOr ? 'true' : 'false') . "<br>";
echo "Hasil NOT A: " . ($hasilNotA ? 'true' : 'false') . "<br>";
echo "Hasil NOT B: " . ($hasilNotB ? 'true' : 'false') . "<br>";
echo "<br>";
echo "<br>";
$a += $b;
echo "After addition $a += $b : a = $a<br>";
$a -= $b;
echo "After subtraction $a -= $b : a = $a<br>";
$a *= $b;
echo "After multiplication $a *= $b : a = $a<br>";
$a /= $b;
echo "After division $a /= $b : a = $a<br>";
$a %= $b;
echo "After modulus $a %= $b : a = $a<br>";
echo "<br>";
echo "<br>";
$hasilIdentik = $a === $b;
echo "Are $a and $b identical? " . ($hasilIdentik ? 'Yes' : 'No') . "<br>";
$hasilTidakIdentik = $a !== $b;
echo "Are $a and $b non-identical? " . ($hasilTidakIdentik ? 'Yes' : 'No') . "<br>";

?>