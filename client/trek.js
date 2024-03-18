async function treck() {
  try {
    const response = await fetch(
      'http://localhost:8081/user-exchange-list/'+document.getElementById('ide3').value,
      {
        method: 'PUT',
        body: document.getElementById('ide2').value,
         headers: {
        'Authorization': 'Bearer '+ localStorage.getItem("Bearer"),
          'Content-type': 'application/json; charset=UTF-8'
    }
      },
    );

    if (!response.ok) {
      throw new Error(`Error! status: ${response.status}`);
    }

    const data = await response.json();

    return data;
    alert("Трек номер :" + document.getElementById('ide2').value);
  } catch (error) {
    console.log(error);
  }
}
