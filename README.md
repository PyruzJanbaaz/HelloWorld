# Hello world
I create a Maven project for Hello Word Example. You need the following tools and technologies to develop the same.
- Spring-Boot 2.1.3.RELEASE
- JavaSE 1.8
- Maven 3.3.9

# Dependencies
Open the pom.xml file fro spring boot configuration:

	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.1.3.RELEASE</version>
		<relativePath/> <!-- lookup parent from repository -->
	</parent>
	
and dpendencies:
      
	<dependency>
	    <groupId>org.springframework.boot</groupId>
	    <artifactId>spring-boot-starter</artifactId>
	</dependency>
	<dependency>
	    <groupId>org.springframework.boot</groupId>
	    <artifactId>spring-boot-starter-web</artifactId>
	</dependency>
	<dependency>
	    <groupId>org.springframework.boot</groupId>
	    <artifactId>spring-boot-starter-test</artifactId>
	    <scope>test</scope>
	</dependency>

# Usage
Run the project and go to http://localhost:8080 on your browser!
