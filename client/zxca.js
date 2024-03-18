async function wer() {
  const zxc = { offerList2id : document.getElementById("ide9").value,
   offerList1id : document.getElementById("ide10").value,
   wishList1id:document.getElementById("ide11").value,
   wishList2id : document.getElementById("ide12").value};
  try {
    const response = await fetch(
      'http://localhost:8081/exchange',
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
