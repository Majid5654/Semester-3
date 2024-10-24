<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> SABANGSA HOTEL - Price Check</title>
    <style>
        .navbar {
            background-color: #333;
            color: white;
            padding: 5px;
            position: fixed;
            top: 0;
            left: 0;
            width: 10%;
            display: flex;
            justify-content: flex-end;
            z-index: 1000;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        }
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-image: url('image1.jpg');
            background-size: cover;
            background-position: center;
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            position: relative;
        }

        body::before {
            content: "";
            position: absolute;
            top: 0;
            left: 0;
            right: 0;
            bottom: 0;
            background-color: rgba(0, 0, 0, 0.5); 
            z-index: 1;
        }

        .container {
            width: 400px;
            padding: 20px;
            border-radius: 10px;
            background-color: rgba(249, 249, 249, 0.9); 
            z-index: 2; 
        }

        input, select {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border-radius: 5px;
            border: 1px solid #ccc;
            box-sizing: border-box;
        }

        .btn {
            background-color: orange;
            color: white;
            border: none;
            padding: 10px;
            cursor: pointer;
            width: 100%;
            border-radius: 5px;
        }
        .btn1 {
            background-color: orange;
            color: white;
            border: none;
            padding: 10px;
            cursor: pointer;
            width: 50%;
            border-radius: 5px;
        }

        .result {
            margin-top: 20px;
            background-color: #e6ffe6;
            padding: 10px;
            border-radius: 5px;
        }

        h2 {
            color: black;
            text-align: center;
        }
    </style>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script>
        $(document).ready(function () {
            $("#priceCheckForm").on("submit", function (event) {
                event.preventDefault(); 

                $.ajax({
                    url: "price_Calculation.php", 
                    method: "POST",
                    data: $(this).serialize(), 
                    success: function (response) {
                        $("#result").html(response); 
                    },
                    error: function (xhr, status, error) {
                        console.error("Error: " + error); 
                        alert("An error occurred! Please try again.");
                    }
                });
            });
        });
    </script>
</head>
<body>
    <div class="navbar">
        <?php

            echo '<a href="homePage.php" class="btn1">Back to Home</a>';

        ?>
    </div>
    

<div class="container">
    <h2>SABANGSA HOTEL - Price Check</h2>
    <form id="priceCheckForm">
        <label for="floor">Floor (1-10):</label>
        <input type="number" id="floor" name="floor" min="1" max="10" required>

        <label for="type">Room Type:</label>
        <select id="type" name="type" required>
            <option value="Standard">Standard</option>
            <option value="Superior">Superior</option>
            <option value="Deluxe">Deluxe</option>
        </select>

        <label for="days">Number of Days:</label>
        <input type="number" id="days" name="days" min="1" required>

        <label for="discount">Discount:</label>
        <select id="discount" name="discount" required>
            <option value="None">None</option>
            <option value="Member">Member</option>
            <option value="Birthday">Birthday</option>
        </select>

        <button type="submit" class="btn">CHECK</button>
    </form>

    <div id="result" class="result"></div> 
</div>


</body>
</html>
