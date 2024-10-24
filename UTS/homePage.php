<?php
session_start(); // Start the session at the beginning

// Check if the user is logged in
if (!isset($_SESSION['username'])) {
    header("Location: Login.php");
    exit(); // Exit after redirecting
}
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ABC Hotel</title>
    <style>
        body, html {
            margin: 0;
            padding: 0;
            height: 100%;
            overflow-x: hidden;
            font-family: Arial, sans-serif;
        }

        .navbar {
            background-color: #333;
            color: white;
            padding: 5px;
            position: fixed;
            top: 0;
            left: 0;
            width: 100%;
            display: flex;
            justify-content: flex-end;
            z-index: 1000;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        }

        .navbar a {
            color: white;
            text-decoration: none;
            font-size: 18px;
            padding: 10px 15px;
            margin: 0 15px;
        }

        .navbar a:hover {
            background-color: orange;
            border-radius: 5px;
        }

        .section {
            height: 100vh; 
            width: 100%;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            color: white;
            text-align: center;
            position: relative;
            background-size: cover;
            background-position: center;
            background-repeat: no-repeat;
        }

        h1, p {
            text-shadow: 2px 2px 5px rgba(0, 0, 0, 0.5);
        }

        h1 {
            margin-bottom: 20px;
            font-size: 3rem; 
            transition: font-size 0.2s ease; 
        }

        p {
            font-size: 1.5rem;
            transition: font-size 0.2s ease; 
        }

        .slideshow-container {
            width: 100%;
            height: 100vh;
            position: relative;
            overflow: hidden;
        }

        .slideshow-container img {
            width: 100%;
            height: 100vh;
            object-fit: cover;
            display: none;
        }

        .slideshow-container img.active {
            display: block;
        }

        .prev, .next {
        cursor: pointer;
        position: absolute;
        top: 50%;
        width: auto;
        padding: 10px; 
        color: white;
        font-weight: bold;
        font-size: 20px; 
        transition: 0.6s ease;
        user-select: none;
        background-color: rgba(0, 0, 0, 0.5);
        border-radius: 50%; 
}

.next {
    right: 20px; 
    transform: translateY(-50%);
}

.prev {
    left: 20px;
    transform: translateY(-50%);
}

.prev:hover, .next:hover {
    background-color: rgba(0, 0, 0, 0.8);
}
       
        .text-content {
            position: absolute;
            top: 50%;
            left: 50%;
            transform: translate(-50%, -50%);
            text-align: center;
        }

        
        .section-2 {
            background-image: url('image2.jpg');
        }

        .section-3 {
            background-image: url('image3.jpeg');
        }
    </style>
</head>
<body>
    <div class="navbar">
        <?php
            echo '<a href="homePage.php">Home</a>';
            echo '<a href="PriceCheck.php">Booking</a>';
            echo '<a href="logout.php">Logout</a>';
        ?>
    </div>

    <div class="section section-1">
        <div class="slideshow-container">
            <img src="image1.jpg" alt="Slide 1" class="active">
            <img src="image4.jpg" alt="Slide 2">
            <img src="image5.jpg" alt="Slide 3">
            
            <a class="prev" onclick="changeSlide(-1)">&#10094;</a>
            <a class="next" onclick="changeSlide(1)">&#10095;</a>
        </div>
        <div class="text-content">
            <h1><?php echo "Welcome, " . htmlspecialchars($_SESSION['username']) . " to SABANGSA HOTEL"; ?></h1>
            <p>Experience luxury and top-tier comfort at Sabangsa Hotel, the perfect destination for travelers seeking tranquility, 
                comfort, and high-quality service. Located in the heart of the city with easy access to various tourist, business, and 
                entertainment spots, Sabangsa Hotel offers a blend of modern luxury and traditional hospitality..</p>
        </div>
    </div>

    <div class="section section-2">
        <h1 class="dynamic-text">Relax and Unwind</h1>
        <p>Discover the serenity of our peaceful environment.</p>
    </div>

    <div class="section section-3">
        <h1 class="dynamic-text">Experience Luxury</h1>
        <p>Your comfort is our top priority. Let us take care of you.</p>
    </div>


    <script>
        let currentSlide = 0;
        const slides = document.querySelectorAll('.slideshow-container img');

        function changeSlide(n) {
            slides[currentSlide].classList.remove('active');
            currentSlide = (currentSlide + n + slides.length) % slides.length; 
            slides[currentSlide].classList.add('active');
        }

        setInterval(() => {
            changeSlide(1);
        }, 5000); 

        window.onscroll = function() {
            var scrollPosition = window.pageYOffset || document.documentElement.scrollTop;
            var textElements = document.querySelectorAll('.dynamic-text'); 

            textElements.forEach(function(text) {
                var scaleFactor = 1 + scrollPosition / 1000; 
                text.style.fontSize = 3 * scaleFactor + "rem"; 
            });
        };
    </script>
</body>
</html>
