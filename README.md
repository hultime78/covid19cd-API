# covid19cdAPI
A simple WEB API to get COVID-19 information of each province in DRC

I created this API to help disseminate about the DRC COVID-19 information.
I am updating this API from time to time.

# Features
Build anything from console widget to mobile applications,with this free and easy to use API.

* Update data every two hours 

* Provide REST API

* Get info of each provinces in DRC

* Simple data and easy to parse

* JSON Formatted

# Provinces
* Endpoint:http://covid19cdapi.herokuapp.com/provinces


<details>
<summary><b>Response</b></summary>

```json
[
  {
    "id":1,
    "name":"Kinshasa",
    "lat":54.5454,
    "lng":58.4242,
    "confirmed":8071,
    "discharge":7228,
    "deaths":177
    }
]
...
```

</details>

# Totals
* Endpoint:http://covid19cdapi.herokuapp.com/totals


<details>
<summary><b>Response</b></summary>

```json
[
  {
    "id":1,
    "name":"RDC",
    "confirmed":8071,
    "discharge":7228,
    "deaths":177
    }
]

```

</details>
