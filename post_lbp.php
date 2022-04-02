<?php

include("db_info.php");

$lbp = $_POST["lbp"];

$query = $mysqli->prepare("INSERT INTO dollarrates (lbp) VALUES (?)");
$query->bind_param("s", $lbp);
$query->execute();

$response = [];
$response["status"] = "done!!!";

$json_response = json_encode($response);
echo $json_response;


?>