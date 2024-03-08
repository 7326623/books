   function reg() {

        const object={  firstName :  document.getElementById(floatingName),
                        lastName : "document.getElementById(floatingInput)",
                        secondName : "document.getElementById(floatingInput)",
                        email : document.getElementById(floatingInput),
                        userName : document.getElementById(floatingLogin),
                        password : document.getElementById(floatingPassword) };

        const response = await fetch('http://localhost:8080/auth/registration',{

             method: "POST",
             body: JSON.stringify(object)
        });
        if(response==true){
        const data = await response.json();

           console.log(body);
           window.location.href ='mainpage.html';
        }

    }