   function auth() {
/*
    const object={         userName : document.getElementById(floatingInput),
                           password : document.getElementById(floatingPassword) };

           const response = await fetch('http://localhost:8080/auth/login',{

                method: "POST",
                body: JSON.stringify(object)
           });

          if(response==true){

           const data = await response.json();
              window.location.href ='mainpage.html';
           }*/


           // установить значение для ключа
           localStorage.test = 2;

           // получить значение по ключу
           alert( localStorage.test ); // 2

           window.location.href ='mainpage.html';
    }