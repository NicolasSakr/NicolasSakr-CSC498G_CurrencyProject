<?php

include("db_info.php");

$id = $_GET["id"]; 

$query = $mysqli->prepare("SELECT dollar FROM dollarrates WHERE id = ?");
$query->bind_param("i", $id);
$query->execute();

$array = $query->get_result();

$response = [];

while($course = $array->fetch_assoc()){
    $response[] = $course;
}

$json_response = json_encode($response);
echo $json_response;

?>
