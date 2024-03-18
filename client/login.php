<?php session_start();?>
<?php
$host = 'localhost'; //имя хоста
$user = 'postgres'; //имя пользователя, по умолчанию это root
$pass = 'werfasdas'; //пароль, по умолчанию пустой
$db = 'books'; //имя базы данных
$port="5432";

 $link = pg_connect( "host=$host port=$port
           dbname=$db user=$user password=$pass");
 if ($link === false) {
  echo 'Connection failed';
  exit;
 }
 
 echo 'Connected to the database.';

if (!empty($_POST['password']) and !empty($_POST['login'])) {

$login = $_POST['login'];

$passwords = $_POST['password'];

$queryds = "SELECT * FROM users WHERE email='$login' AND password='$passwords'";

$result = pg_query($link, $queryds); 

$userf = pg_fetch_assoc($result);

if (!empty($userf)) {
$_SESSION['status']=$userf['Type'];
$_SESSION['auth'] = true;
echo '<script>window.location.href = "index.php";</script>';

} else {

echo '<script>window.location.href = "authorization.php";</script>';
}
pg_close($conn);

}
?>