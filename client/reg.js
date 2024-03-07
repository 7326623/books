   function reg() {
        console.log("reg fetch start!");
        const response = await fetch('http://localhost:8080/auth/registration');
        if(response==true){
         const data = await response.json();

           console.log(data);
           window.location.href ='mainpage.html';
        }

    }