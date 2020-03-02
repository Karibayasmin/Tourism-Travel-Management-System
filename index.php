
<?php
 $con=mysql_connect("localhost","root","")or die(mysql_error());
 $db=mysql_select_db('db_client',$con)or die(mysql_error());
     
	 $name=$_POST['name'];
     $countryname=$_POST['countryname'];
     $email=$_POST['email'];
     $gender=$_POST['gender'];
     $username=$_POST['username'];
     $password=$_POST['password'];

     if($name==''){
      echo"<script>alert('Enter Your Name')</script>";
     }
     if($countryname==''){
      echo"<script>alert('Enter Your Country Name')</script>";
     }
     if($email==''){
      echo"<script>alert('Enter Your Email')</script>";
     }
     if($gender==''){
      echo"<script>alert('Enter Your Gender')</script>";
     }
     if($username==''){
      echo"<script>alert('Enter Your User Name')</script>";
     }
     if($password==''){
      echo"<script>alert('Enter Your Password')</script>";
     }

     else{
     $query="insert into tbl_client(name,countryname,email,gender,username,password) values('$name',
     '$countryname','$email','$gender','$username','$password')";

		 if(mysql_query($query)){
		  echo"<script>alert('You are successfully Registered')</script>";

		 }
     }
 

?>