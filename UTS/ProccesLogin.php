<?php
session_start(); 

$response = [];

if (isset($_POST['username']) && isset($_POST['password'])) {
    $username = $_POST['username'];
    $password = $_POST['password'];


    if (empty($username)) {
        $response['usernameError'] = "Username must be filled.";
    }

    if (empty($password)) {
        $response['passwordError'] = "Password must be filled.";
    } elseif (strlen($password) < 5) {
        $response['passwordError'] = "Password is at least 5 characters.";
    } elseif (!preg_match('/[0-9]/', $password) || !preg_match('/[a-zA-Z]/', $password)) {
        $response['passwordError'] = "Password must consist of letters and numbers.";
    }

    if (empty($response)) {
        if ($username == 'Majid' && $password == 'Erwan12345') {
            $_SESSION['username'] = $username;
            $response['success'] = true;
        } else {
            $response['passwordError'] = "Incorrect username or password.";
        }
    }
} else {
    $response['usernameError'] = "Please submit the form first.";
}
echo json_encode($response);
?>
