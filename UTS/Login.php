<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Form with AJAX and Bootstrap</title>
    
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
    
    <style>
        .error {
            color: red;
            font-size: 12px;
        }
        body {
            background: linear-gradient(rgba(0, 0, 0, 0.6), rgba(0, 0, 0, 0.6)), url('image1.jpg');
            background-size: cover;
            background-position: center;
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }
        .form-container {
            max-width: 400px;
            margin: 0 auto;
            padding: 20px;
            border-radius: 10px;
            background-color: rgba(255, 255, 255, 0.8); /* Semi-transparent background */
        }
    </style>

    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script>
        $(document).ready(function() {
            $("form").on("submit", function(event) {
                event.preventDefault(); 
                $(".error").text("");

                var username = $("input[name='username']").val();
                var password = $("input[name='password']").val();
                
                $.ajax({
                    url: "ProccesLogin.php",
                    type: "POST",
                    data: { username: username, password: password },
                    success: function(response) {
                        var result = JSON.parse(response);

                        if (result.usernameError) {
                            $("#usernameError").text(result.usernameError);
                        }
                        if (result.passwordError) {
                            $("#passwordError").text(result.passwordError);
                        }
                        if (result.success) {
                            window.location.href = "homePage.php";
                        }
                    }
                });
            });
        });
    </script>
</head>
<body>

<div class="container">
    <div class="form-container shadow">
        <h3 class="text-center">Login</h3>
        <form action="ProccesLogin.php" method="post">
            <div class="mb-3">
                <label for="username" class="form-label">Username</label>
                <input type="text" class="form-control" id="username" name="username" placeholder="Enter your username" required>
                <div id="usernameError" class="error"></div>
            </div>

            <div class="mb-3">
                <label for="password" class="form-label">Password</label>
                <input type="password" class="form-control" id="password" name="password" placeholder="Enter your password" required>
                <div id="passwordError" class="error"></div>
            </div>

            <button type="submit" class="btn btn-primary w-100">Log in</button>
        </form>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.min.js"></script>

</body>
</html>
