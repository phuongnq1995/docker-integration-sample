# Spring boot CI/CD

## Spring boot dockerize container
#### Purpose: Dockerize a spring boot application by adding a Dockerfile for create an image.
Refer documentation: https://spring.io/guides/gs/spring-boot-docker/
Look at the <b>Dockerfile</b> file.


## Github actions
#### Purpose: Trigger github repository to build, test and push an image into Docker hub.
Refer documentation: https://docs.github.com/en/actions/automating-builds-and-tests/building-and-testing-java-with-maven
Look at <b>.github</b> folder.

Alternative solution: Jenkins

## Docker hub
#### Purpose: Store docker images and notify to jenkins for fetching the newest image to ec2 and re-deploy.
Refer documentation:
<ul>
    <li><a>https://docs.github.com/en/actions/publishing-packages/publishing-docker-images</a></li>
    <li><a>https://docs.docker.com/ci-cd/github-actions/</a></li>
</ul>

## AWS EC2: 
#### Purpose: Cloud server contains jenkins and deployed spring boot application
Refer documentation:
<ul>
    <li><a>https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/get-set-up-for-amazon-ec2.html</a></li>
    <li><a>https://www.guru99.com/creating-amazon-ec2-instance.html</a></li>
</ul>

## Jenkins
#### Purpose: Fetching the docker image and deploy inside ec2
Refer documentation: 
<ul>
    <li><a>https://devopsarticle.com/how-to-install-jenkins-on-aws-ec2-ubuntu-20-04/</a></li>
    <li><a>https://turkogluc.com/jenkins-deploy-docker-images-to-amazon-ec2/</a></li>
</ul>

###
Ec2 info:
Jenkins domain:http://ec2-18-140-63-46.ap-southeast-1.compute.amazonaws.com:9999/
Spring boot: http://ec2-18-140-63-46.ap-southeast-1.compute.amazonaws.com:8080/