fetch("https://localhost:63342/book-response" ,{
headers:{
	Authorization: 'Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxIiwiZXhwIjoxNzEyNjY5MjYzLCJlIjoiYWRtaW5AYWRtaW4iLCJhIjpbIlJPTEVfQURNSU4iXX0.rEpJ_iSTYzAKKPMrZ7SgauGhVIUbb7Vi-9EgTihGUA4'
}


})
.then(res => console.log(res.json()))
.then(data=> console.log(data))