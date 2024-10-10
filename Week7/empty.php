<?php
$myArray = array();
echo "<h1> No 1 </h1>";
echo "<p>";
if(empty($myArray)){
    echo "Array tidak terdefinisi atau kosong";
}

else{
    echo "Array terdefinisi dan tidak kosong";
}
echo "</p>";

echo " <h1> No 2 </h1> ";
echo "<p>";
if (empty($nonExistentVar)) {
    echo "Variable tidak terdefinisi atau kosong";
}
else{
    echo "Variabel terdefinisi dan tidak kosong.";
}
echo "</p>";
?>