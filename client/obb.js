async function conch() {
  try {
    const response = await fetch(
      'http://localhost:8081/exchange/confirm/'+document.getElementById('ide').value,
      {
        method: 'PUT',
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
 alert("Обмен произведён");
    return data;
  } catch (error) {
    console.log(error);
  }

}

