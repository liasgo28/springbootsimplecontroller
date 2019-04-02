# SpringBoot Web - Simple Controller

Create a simple Controller with SpringBoot.

## Let's start:

Enjoy this!

### Create a new Maven Project

	* Click: File -> New -> MavenProject

	* Check: Create a simple project(skp archtype selection)

	* Click Next

	* Type Group id, Artifact Id and click Finish

### POM Dependencies

Open pom.xml file and add the next code after the </project> tag

```
<dependencies>
	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-web</artifactId>
		<version>2.1.3.RELEASE</version>
	</dependency>
</dependencies>
```

### Create start class
* create new class file 
* add the annotation @SpringBootApplication before the class
* create a new main method and push this SpringApplication.run(Application.class, args);
* the final code will look like this
```
package br.com.diego.springbootsimplecontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
```

Run main method and see in console application was been started!

...
  o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
...

### Create a Simple Controller
* create new class file 
* add the annotation @Controller before the class
* create a new method with String return and before the method put @RequestMapping("/") and @ResponseBody annotations
* return any string
* the final code will look like this
```
package br.com.diego.springbootsimplecontroller.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SimpleController {

	@RequestMapping("/")
	@ResponseBody
	public String hello() {
		return "Hello I'm a Simple Controller";
	}
}
```

Stop application if it's running
Run main method and see in console application was been started!

In the browser open http://localhost:8080/ and see the message.

# YWC -> You are Welcome!
