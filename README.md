🧮 Unit Converter Web App

A simple, user-friendly Spring Boot + Thymeleaf web application that converts:

✅ Length
✅ Weight
✅ Temperature

The app features a clean UI, tabbed navigation, and real-time unit conversion using form submissions.

🚀 Features

✅ Convert between multiple unit types
✅ Modern, styled interface (no external CSS)
✅ Tab-based navigation
✅ Instant calculation results
✅ MVC architecture with Thymeleaf templating
✅ Fully server-side (no JavaScript frameworks needed)

📂 Technologies Used
Layer	Technology
Backend	Java, Spring Boot
Frontend	HTML5, CSS, Thymeleaf
Build Tool	Maven
Server	Embedded Tomcat


📁 Project Structure
src/
 └─ main/
     ├─ java/
     │   └─ com.converter.unitconverter
     │        ├─ controller/
     │        │    └─ ConverterController.java
     │        └─ convertService/
     │             └─ ConvertService.java
     └─ resources/
         ├─ templates/
         │    └─ index.html
         └─ application.properties

▶️ How to Run
✅ Prerequisites
Java 17+ (or your project’s target version)
Maven

✅ Steps
Clone the repo:
git clone https://github.com/your-username/unit-converter.git
Navigate into the project:
cd unit-converter
Run the application:
mvn spring-boot:run

Open your browser and visit:
http://localhost:8080/


You're ready to convert units! 🎉

🖥️ How It Works
User selects a conversion type tab (Length, Weight, Temperature)
Inputs a value and selects units
Form submits a POST request
Controller processes the conversion
Thymeleaf displays the result on the same page
