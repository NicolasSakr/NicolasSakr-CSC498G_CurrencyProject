<?php

include("db_info.php");



$dollar = $_GET["dollar"];

$query = $mysqli->prepare("INSERT INTO dollarrates (dollar) VALUES (? )");
$query->bind_param("ss", $dollar);
$query->execute();

$response = [];
$response["status"] = "done!!!!";

$json_response = json_encode($response);
echo $json_response;


?> 