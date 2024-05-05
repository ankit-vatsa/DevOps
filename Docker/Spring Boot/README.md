- Develop a Spring Boot Application - Simple RESTful Web Services API.
- Click on Project -> Run as -> Maven Install

Create a file named "Dockerfile" in the same directory as project.

- <a href="Dockerfile">Dockerfile</a>

- To build the image:
  
docker build -t ankit/springbootcalculator:1.0.0 .

- To build and run the container:

docker run -p 8090:8080 --name springbootCalculator ankit/springbootcalculator:1.0.0

- To tag the image (before PUSH to repository):

>> NOTE: You need to include the namespace for Docker Hub to associate it with your account. The namespace is the same as your Docker Hub account name. You need to rename the image to YOUR_DOCKERHUB_NAME/docker-whale.

docker tag ankit/springbootcalculator:1.0.0 ankitvatsa/springbootcalculator

- To push the image to repository:

docker push ankitvatsa/springbootcalculator
