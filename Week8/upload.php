<?php
if (isset($_POST["submit"])) {
    $targetdir = "uploads/"; // Directory to save uploaded files
    $allowedExtensions = array("txt", "pdf", "doc", "docx");
    $maxsize = 3 * 1024 * 1024; // 3 MB maximum file size

    // Loop through each file being uploaded
    foreach ($_FILES['file']['name'] as $key => $file_name) {
        $targetfile = $targetdir . basename($file_name);
        $fileType = strtolower(pathinfo($targetfile, PATHINFO_EXTENSION));
        $file_size = $_FILES['file']['size'][$key];
        $file_tmp = $_FILES['file']['tmp_name'][$key];

        // Validate file extension and size
        if (in_array($fileType, $allowedExtensions) && $file_size <= $maxsize) {
            if (move_uploaded_file($file_tmp, $targetfile)) {
                echo "File $file_name berhasil diunggah.<br>";
            } else {
                echo "Gagal mengunggah file $file_name.<br>";
            }
        } else {
            echo "File $file_name tidak valid atau melebihi ukuran maksimum yang diizinkan.<br>";
        }
    }
}
?>
