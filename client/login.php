<?PHP
include_once("connection.php");
 if( isset($_POST['txtUsername']) && isset($_POST['txtPassword']) ) {
     $username = $_POST['txtUsername'];
     $password = $_POST['txtPassword'];

      $query = "SELECT username, password FROM tbl_client ".
        " WHERE username = '$username' AND password = '$password'";

        $result = mysqli_query($conn, $query);

        if($result->num_rows > 0){
         if(isset($_POST['mobile']) && $_POST['mobile'] == "android"){
                echo "success";
                exit;
            }

            echo "success" ;
	}

        else{
           echo "Login Failed <br/>";
        }

 }

?>

<html>
<head><title>Login|Kariba|Tahasina|Akhi</title></head>
    <body>
        <h1>Login|<a href=”http://www.kosalgeek.com”>Kariba|Tahasina|Akhi</a></h1>
        <form action="<?PHP $_PHP_SELF ?>" method="post">
            Username <input type="text" name="txtUsername" value="" /><br/>
            Password <input type="password" name="txtPassword" value="" /><br/>
            <input type="submit" name="btnSubmit" value="Login"/>
        </form>
    </body>
</html>