<?php
    if(isset($_POST["beliNovel"]) && isset($_POST["beliBuku"])) {
        setcookie('beliNovel', $_POST["beliNovel"], time() + 60) ;
        setcookie('beliBuku', $_POST["beliBuku"], time() + 60);
        header("Location: keranjangBelanja.php");
    }
?>