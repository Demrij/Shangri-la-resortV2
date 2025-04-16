function getWeather(){

    const apiKey = '68b0c54f38bc04e685856e5311c63301';
    
    const url = 'https://api.openweathermap.org/data/2.5/weather?q=Cancunappid=${apiKey}&units=metric'

    fetch(url) 
        .then(response => response.json())
        .then(data => {
            const temp = Math.round(data.main.temp);
            document.getElementById('.weather').textContent = `${temp}°C`;

        })

        .catch(error => {
            document.getElementById('.weather').textContent = 'N/A';
        });
        

}
getWeather();