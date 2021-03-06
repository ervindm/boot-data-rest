# I. REST Endpoints

## Access Customer sorted by Customer Name
-----------------------------------------------------------------------
GET http://localhost:8080/customers?sort=lastName&sort=firstName
In Browser with HAL Explorer: http://localhost:8080/explorer/index.html#uri=http://localhost:8080/customers?sort=lastName&sort=firstName

## Create Customer
--------------------------------------------------------------
Use Advance REST Client in Chrome or CURL in console
POST http://localhost:8080/customers
HEADER
 CONTENT-TYPE:application/json
eg BODY
{
    "firstName":"Bruce",
    "lastName":"High Waist",
    "email":"bhighwaist@g.com"
}

## Create Classes
-------------------------------------------
POST http://localhost:8080/classes
HEADER
 CONTENT-TYPE:application/json
eg BODY
{
    "serviceName":"Math Class",
    "servicePrice":500,
    "serviceDuration":40
}

## Create Relationship add (first) Class to (first) Customer
-------------------------------------------------------------
PUT http://localhost:8080/customers/1/classes
HEADER
 CONTENT-TYPE:text/uri-list
eg BODY
http://localhost:8080/classes/1


# II. Creating Docker Image and Running

## Option #1 Create DOCKER IMAGE without Docker installed
=========================================================
Create Docker Image tarBall without docker installed

### This will create jib-image.tar inside build subfolder
------------------------
```
gradlew jibBuildTar
```

### Loading and Running
Needs docker (at Least Docker Desktop if working locally)
Load docker image created with jib to docker images
-------------
```
docker load --input build/jib-image.tar
```

### Run Docker Image
---------------------
```
docker run -d -p 8080:8080 boot-data-rest:0.0.1-SNAPSHOT
```


## Option #2 Image creation with Dockerfile and running
Needs Docker (at Least Docker Desktop if working locally)
====================================================================
### Create docker image with Dockerfile (Docker should exists on local)
------------------------------------
```
docker build -t ervintest/boot-data-rest .
```

### Running in Docker using DockerImage
-------------------------------------
```
docker run -d -p 8080:8080 ervintest/boot-data-rest"# boot-data-rest" 
```
