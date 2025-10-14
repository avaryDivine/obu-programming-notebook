# CIS 3623 Quiz 001
The API and server described below provide access to JSON data that stores information about OBU events.
# API
Implement a Javascript API with the following functions:
* ```addEvent```
    * Inputs 
        * event-category ("the-weekend", "stem-day", etc.)
        * event-name ("bison-day", "family-weekend", etc.)
        * sub-event-name 
        * date 
        * location
    * Outputs 
        * On success: A JSON object representing the event 
        * On failure: some indication of the reason for the failure
* ```getSubEvent```
    * Inputs
        * event-category ("the-weekend", "stem-day", etc.)
        * event-name ("bison-day", "family-weekend", etc.)
        * sub-event-name 
    * Outputs
        * On success: A JSON object representing the sub-event 
        * On failure: some indication of the reason for the failure
* ```updateSubEventLocation```
    * Inputs: 
        * event-category ("the-weekend", "stem-day", etc.)
        * event-name ("bison-day", "family-weekend", etc.)
        * sub-event-name 
        * date 
        * location
    * Outputs: 
        * On success: A JSON object representing the updated sub-event 
        * On failure: some indication of the reason for the failure
* ```deleteSubEvent```
    * Inputs 
        * event-category ("the-weekend", "stem-day", etc.)
        * event-name ("bison-day", "family-weekend", etc.)
        * sub-event-name 
    * Outputs
        * Success or failure indicator 
# Server
Using the API above, create server endpoints / routes for the following URL addresses
* ```/add-event```
    * Type: ```POST```
    * Input / request body (values in <> will be provided by the client)
        ```
        {
            event-category: <the event category>,
            event-name: <the event name>,
            name: <the name of the sub event>,
            date: <the date of the sub-event>,
            location: <the location of the sub-event>
        }
        ```
    * Output / response (values in <> will be provided by the server)
        * On success
            ```
            {
                status: "OK",
                the-new-sub-event : {
                    event-category: <the event category>,
                    event-name: <the event name>,
                    name: <the name of the sub event>,
                    date: <the date of the sub-event>,
                    location: <the location of the sub-event>
                }
            }
            ```
        * On failure
            ```
            {
                status: "FAIL",
                message : "<A message explaining the reason for the error>."
            }
            ```
* ```/get-sub-event```
    * Type: ```GET```
    * Input / request body (values in <> will be provided by the client)
        ```
        {
            event-category: <the event category>,
            event-name: <the event name>,
            name: <the name of the sub event>,
        }
        ```
    * Output / response (the value of sub-event is the actual sub-event data in JSON. what is shown is an example only. )
        * On success
            ```
            {
                status: "OK"
                faculty: {
                    "name" : "Fun on the oval",
                    "date" : "2025-10-24",
                    "location" : "The oval"
                }
            }
            ```
        * On failure
            ```
            {
                status: "FAIL",
                message : "<A message that explains the reason for the failure>."
            }
            ```
* ```/update-sub-event-location```
    * Type: ```POST```
    * Input / request body (values in <> will be provided by the client)
        ```
        {
            event-category: <the event category>,
            event-name: <the event name>,
            name: <the name of the sub event>,
            location: <the location of the new sub-event>
        }
        ```
    * Output / response (values in <> will be provided by the server)
        * On success
            ```
            {
                status: "OK"
            }
            ```
        * On failure
            ```
            {
                status: "FAIL",
                message : "<Informative message explaining the reason for the error>."
            }
            ```
* ```/delete-sub-event```
    * Type: ```POST```
    * Input / request body (values in <> will be provided by the client)
        ```
        {
            event-category: <the event category>,
            event-name: <the event name>,
            name: <the name of the sub event>,
        }
        ```
    * Output / response (values in <> will be provided by the server)
        * On success
            ```
            {
                status: "OK"
            }
            ```
        * On failure
            ```
            {
                status: "FAIL",
                message : "<A message explaining the reason for the error>."
            }
            ```
# Client
Implement a client to test your code.