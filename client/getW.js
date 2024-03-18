async function getUsers() {
  try {
    const response = await fetch(
      'http://localhost:8081/wishlist',
      {
        method: 'GET',
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
  } catch (error) {
    console.log(error);
  }
}
getUsers().then(data => {
  console.log(data);

  const preElement = document.getElementById('json-data3');

  preElement.style.fontSize = '18px';

  preElement.innerHTML = JSON.stringify(data, null, 2);
});
