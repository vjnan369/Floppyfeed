## Floppyfeed
Build Sample Blog Application that enables authors to post Articles, users to view articles and comment on articles.


## REST End Points:

1. View all contents:
````
    GET http://localhost:8080/content
````

2. Show a content:
````
  GET http://localhost:8080/content/1
````

3. Create a Content:
````
    POST http://localhost:8080/content
    params: {
        "type" : "fictional",
        "title": "Percy jackson and sea of monsters",
        "description": "this is a novel about percy jackson and sea of monsters",
        "status": "drafted"
      }
````

