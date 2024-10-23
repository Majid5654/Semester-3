<?php
// Lokasi penyimpanan file yang diunggah
$targetDirectory = "images/";

// Periksa apakah direktori penyimpanan ada, jika tidak maka buat
if (!file_exists($targetDirectory)) {
    mkdir($targetDirectory, 0777, true);
}

// Check if files were uploaded
if (isset($_FILES['images']) && $_FILES['images']['name'][0]) {
    $totalFiles = count($_FILES['images']['name']);

    // Loop through all uploaded files
    for ($i = 0; $i < $totalFiles; $i++) {
        $fileName = $_FILES['images']['name'][$i];
        $targetFile = $targetDirectory . $fileName;
        $fileType = strtolower(pathinfo($targetFile, PATHINFO_EXTENSION));

        // Only allow certain image file types
        $allowedExtensions = array("jpg", "jpeg", "png", "gif");

        if (in_array($fileType, $allowedExtensions)) {
            // Move uploaded file to the target directory
            if (move_uploaded_file($_FILES['images']['tmp_name'][$i], $targetFile)) {
                echo "File $fileName berhasil diunggah.<br>";
            } else {
                echo "Gagal mengunggah file $fileName.<br>";
            }
        } else {
            echo "File $fileName memiliki tipe tidak valid. Hanya file JPG, JPEG, PNG, dan GIF yang diizinkan.<br>";
        }
    }
} else {
    echo "Tidak ada file yang diunggah.";
}
?>
