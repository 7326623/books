async function agsf() {
  const zxc = { bookLiteraryId : document.getElementById("ide1").value,
   isbn : document.getElementById("ide2").value,
   yearPublishing:document.getElementById("ide3").value,
   categories : [1,2]};
  try {
    const response = await fetch(
      'http://localhost:8081/offer-list',
      {
        method: 'POST',
        body: JSON.stringify(zxc),
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
    alert("Книги указаны");
  } catch (error) {
    console.log(error);
  }
}
