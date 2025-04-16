function getWeather(){

    const apiKey = '68b0c54f38bc04e685856e5311c63301';

    const lat = 21.1619;
    const lon = -86.8518;
    
    const url = `https://api.openweathermap.org/data/2.5/weather?lat=${lat}&lon=${lon}&appid=${apiKey}&units=metric`;

    fetch(url) 
        .then(response => response.json())
        .then(data => {

            const temp = Math.round(data.main.temp);

            document.querySelector(".weather").textContext = `${temp}°C`;

});

.catch(error => {

    document.querySelector(".weather").textContext = "N/A";
})

}

getWeather();