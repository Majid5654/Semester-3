<?php
$umur;

echo "<h1> No 1 </h1>";
$data = array("nama" => "jane" , "usia" => 25);
if(isset($data["nama"])) {
    echo " <p> Nama : " . $data["nama"] ;
}
else{
    echo "Variabel 'nama' tidak ditemukan dalam array ."; 
}


echo "<h1>No 2 </h1>";
if (isset($umur)&& $umur >= 18){
    echo "Anda sudah dewasa";
}

else{
    echo "<p> Anda belum dewasa atau variabel 'umur' tidak ditemukan </p>";
}


?>