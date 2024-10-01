<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        table {
            width: 50%;
            border-collapse: collapse;
            margin: 20px auto;
            font-family: Arial, sans-serif;
            font-size: 16px;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
            font-weight: bold;
        }
        tr:nth-child(even) {
            background-color: #f9f9f9;
        }
        tr:hover {
            background-color: #e2e2e2;
        }
    </style>
</head>
<body>
    <?php
    $Dosen  = [
        'nama' => 'Elok Nur Hamdana',
        'domisili' => 'Malang',
        'jenis_kelamin' => 'Perempuan'];

        echo "<table>
        <tr>
            <th>Attribute</th>
            <th>Value</th>
        </tr>
        <tr>
            <td>Nama</td>
            <td>{$Dosen['nama']}</td>
        </tr>
        <tr>
            <td>Domisili</td>
            <td>{$Dosen['domisili']}</td>
        </tr>
        <tr>
            <td>Jenis Kelamin</td>
            <td>{$Dosen['jenis_kelamin']}</td>
        </tr>
      </table>";
    ?>
</body>
</html>