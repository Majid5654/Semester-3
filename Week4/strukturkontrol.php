<?php
$nilaiNumerik = 92;

if ($nilaiNumerik >= 90 && $nilaiNumerik <= 100){
    echo "Nilai Huruf: A";
}
else if ($nilaiNumerik >= 80 && $nilaiNumerik < 90){
echo "Nilai huruf : B";
}
else if ($nilaiNumerik >= 70 && $nilaiNumerik < 80){
    echo "Nilai huruf : C";
}
else if ($nilaiNumerik < 70){
    echo "Nilai huruf : D";
}
echo "<br>";
echo "-------------------";
echo "<br>";

$jarakSaatIni = 0;
$jarakTarget = 500;
$peningkatanHarian = 30;
$hari = 0;

echo "Jarak Saat Ini $jarakSaatIni <br>";
echo "Jarak Target $jarakTarget <br>";
echo "Peningkatan Harian $peningkatanHarian <br>";
while ($jarakSaatIni < $jarakTarget){
    $jarakSaatIni += $peningkatanHarian;
    $hari++;
}
echo "Atlet tersebut memerlukan $hari hari untuk mencapai jarak 500 kilometer.";
echo "<br>";
echo "-------------------------------------------";
echo "<br>";

$jumlahLahan = 10;
$tanamanPerLahan = 5;
$buahPerTanaman = 10;
$jumlahBuah = 0;
echo "Jumlah lahan: $jumlahLahan <br>";
echo "Tanaman per lahan: $tanamanPerLahan <br>";
echo "Buah per tanaman: $buahPerTanaman <br>";
for ($i = 1;$i <= $jumlahLahan;$i++){
$jumlahBuah += ($tanamanPerLahan * $buahPerTanaman);
}

echo "Jumlah buah yang akan dipanen adalah : $jumlahBuah";

echo "<br>";
echo "-------------------------------------------";
echo "<br>";

$skorUjian = [85,92,78,96,88];
$totalSkor = 0;
$index=0;

foreach ($skorUjian as $skor){
    $totalSkor += $skor;
    $index++;
    echo "Skor ujian ke-" . ($index ) . " : $skor <br>";
}
echo "Total skor ujian adalah : $totalSkor";

echo "<br>";
echo "-------------------------------------------";
echo "<br>";

$nilaiSiswa = [85,92,58,64,90,55,88,79,70,96];
$indexx=0;
foreach ($nilaiSiswa as $nilai){
    $indexx++;
    if ($nilai < 60 ) {
    echo "Nilai Mhs $indexx : $nilai (tidak lulus) <br>";
    continue;
    }
    echo "Nilai Mhs $indexx : $nilai (lulus) <br>";
}
?>