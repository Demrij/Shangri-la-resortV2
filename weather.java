function getWeather(){
    const apiKey = 'dd715d9ec4ce8c060f5b6aa040416057';
    const city = 'Cancun, MX';
    const url = `https://api.openweathermap.org/data/2.5/weather?q=${city}&appid${apiKey}&units=metric`;

    fetch(url) 
        .then(response => response.json())
        .then(data => {
            const temp = Math.round(data.main.temp);
            document.getElementById('weather-display').textContent = `${temp}°C`;

        })

        .catch(error => {
            document.getElementById('weather-display').textContent = 'N/A';
        });
        
}

getWeather();