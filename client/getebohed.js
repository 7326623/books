async function getUsers() {
  try {
    const response = await fetch(
      'http://localhost:8081/admin/book',
      {
        method: 'GET',
         headers: {
        'Authorization': 'Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxIiwiZXhwIjoxNzExOTkwMjExLCJlIjoiYWRtaW5AYWRtaW4iLCJhIjpbIlJPTEVfQURNSU4iXX0.CIN63BNcfrhlH47HwyDAwmQI_5bU9XU1H6FuEeXPCdw',
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

  const preElement = document.getElementById('json-data');

  preElement.style.fontSize = '18px';

  preElement.innerHTML = JSON.stringify(data, null, 2);
});
