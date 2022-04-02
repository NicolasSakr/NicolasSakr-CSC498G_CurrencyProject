<?php

include("db_info.php");

$dollar = $_POST["dollar"];

$query = $mysqli->prepare("INSERT INTO courses (dollar) VALUES (?)");
$query->bind_param("s", $dollar);
$query->execute();

$response = [];
$response["status"] = "done!!!";

$json_response = json_encode($response);
echo $json_response;


?>