<p align="center"><img src="/doc/logo-api.png"></p>

<h1 align="center">MarsRoverAPI</h1>

<h3 align="center">API REST de código aberto fornecido e mantido pela  National Aeronautics and Space Administration (NASA) com o objetivo de disseminar informações e distribuir conhecimento cientifico sobre o planeta marte </h3>

<p align="center">
<a href="https://www.travis-ci.com/github/Mario23junior/MarsRover-API"><img src="https://img.shields.io/github/workflow/status/r-spacex/SpaceX-API/Test?style=flat-square"></a>
<a href="https://en.wikipedia.org/wiki/Representational_state_transfer"><img src="https://img.shields.io/badge/interface-REST-brightgreen.svg?longCache=true&style=flat-square"></a>
</p>




## Teste a API 
 
```
https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=1000&page=2&api_key=DEMO_KEY
```

## Etapas para testar ou reproduzir

Primeiro execute o maven 
 
```
 mvn package
```
Em seguida faça
```
java -jar target/MarsRoverAPI-1.0-SNAPSHOT.jar

```
## Uso

```
http://localhost:8080/api/v1/nasa/mars/?marsRoverData=&camera=rhaz&marsSol=1000&page=35&robomars=curiosity
```

## Dados de retorno

```
"photos":[
   {
      "id":103387,
      "sol":1000,
      "camera":{
         "id":26,
         "name":"NAVCAM",
         "rover_id":5,
         "full_name":"Navigation Camera"
      },
      "rover":{
         "id":5,
         "name":"Curiosity",
         "landing_date":"2012-08-06T00:00:00.000+00:00"
      },
      "img_src":"http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/01000/opgs/edr/ncam/NLB_486265119EDR_S0481570NCAM00546M_.JPG",
      "earth_date":"2015-05-30"
   },
   {
      "id":103388,
      "sol":1000,
      "camera":{
         "id":26,
         "name":"NAVCAM",
         "rover_id":5,
         "full_name":"Navigation Camera"
      },
      "rover":{
         "id":5,
         "name":"Curiosity",
         "landing_date":"2012-08-06T00:00:00.000+00:00"
      },
      "img_src":"http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/01000/opgs/edr/ncam/NLB_486265046EDR_S0481570NCAM00546M_.JPG",
      "earth_date":"2015-05-30"
   },
   {
      "id":103389,
      "sol":1000,
      "camera":{
         "id":26,
         "name":"NAVCAM",
         "rover_id":5,
         "full_name":"Navigation Camera"
      },
      "rover":{
         "id":5,
         "name":"Curiosity",
         "landing_date":"2012-08-06T00:00:00.000+00:00"
      },
      "img_src":"http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/01000/opgs/edr/ncam/NLB_486264973EDR_S0481570NCAM00546M_.JPG",
      "earth_date":"2015-05-30"
   },
   {
      "id":409063,
      "sol":1000,
      "camera":{
         "id":26,
         "name":"NAVCAM",
         "rover_id":5,
         "full_name":"Navigation Camera"
      },
      "rover":{
         "id":5,
         "name":"Curiosity",
         "landing_date":"2012-08-06T00:00:00.000+00:00"
      },
      "img_src":"http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/01000/opgs/edr/ncam/NRB_486272784EDR_F0481570NCAM00415M_.JPG",
      "earth_date":"2015-05-30"
   },
   {
      "id":409064,
      "sol":1000,
      "camera":{
         "id":26,
         "name":"NAVCAM",
         "rover_id":5,
         "full_name":"Navigation Camera"
      },
      "rover":{
         "id":5,
         "name":"Curiosity",
         "landing_date":"2012-08-06T00:00:00.000+00:00"
      },
      "img_src":"http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/01000/opgs/edr/ncam/NRB_486271176EDR_F0481570NCAM00322M_.JPG",
      "earth_date":"2015-05-30"
   },
   {
      "id":409065,
      "sol":1000,
      "camera":{
         "id":26,
         "name":"NAVCAM",
         "rover_id":5,
         "full_name":"Navigation Camera"
      },
      "rover":{
         "id":5,
         "name":"Curiosity",
         "landing_date":"2012-08-06T00:00:00.000+00:00"
      },
      "img_src":"http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/01000/opgs/edr/ncam/NRB_486270860EDR_F0481570NCAM00323M_.JPG",
      "earth_date":"2015-05-30"
   }
]
}
```
