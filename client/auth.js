async function  auth() {

    const url = "http://localhost:8081/auth/login";
const data = { email : document.getElementById("kakshksa").value,
   password : document.getElementById("jopa").value};
    

    try {
  const response = await fetch(url, {
    method: "POST", // или 'PUT'
    body: JSON.stringify(data), // данные могут быть 'строкой' или {объектом}!
    headers: {
      "Content-Type": "application/json",
    },
  });
  const json = await response.json();
  localStorage.setItem('Bearer',  json.accessToken);
   localStorage.setItem('logged',  true);
window.location.replace("http://kaka/index.html");
} catch (error) {
  console.error("Ошибка:", error);
  localStorage.setItem('logged',  false);
}
}