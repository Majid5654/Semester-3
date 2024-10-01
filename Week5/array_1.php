<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h2> Array Terindeks</h2>
    <?php
    $Listdosen=["Elok Nur Hamdana","Unggul pamenang","Bagas Nugraha"];

    for($i=0;$i<count($Listdosen);$i++){
        echo $Listdosen[$i] . "<br>"   ;
    }
    ?>
</body>
</html>