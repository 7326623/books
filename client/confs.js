async function confs() {
  try {
    const response = await fetch(
      'http://localhost:8081/user-exchange-list/set-receiving/'+document.getElementById('ide4').value,
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

    return data;
    alert("Обмен произведён");
  } catch (error) {
    console.log(error);
  }
}
