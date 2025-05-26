A beautiful and feature-rich blogging platform built with Java Spring Boot and React.

Features

🔐 Secure user authentication and authorization
✍️ Create, edit, and delete blog posts
🎨 Rich text editor for blog content
📱 Responsive design for all devices
👤 User profiles with customizable avatars
💌 Like and comment on posts
📸 Image upload support
🔍 Search functionality
📱 Mobile-friendly interface
Tech Stack

Backend: Java Spring Boot
Frontend: React with Material-UI
Database: MySQL
Authentication: Spring Security with JWT
File Storage: AWS S3 (optional)
Prerequisites

Before you begin, ensure you have the following installed:

Java JDK 17 or higher
Node.js 16 or higher
MySQL 8.0 or higher
Maven
Git
Setup Instructions

Database Setup

Open MySQL command line or MySQL Workbench
Create a new database:
CREATE DATABASE loveblog;
Update database credentials in backend/src/main/resources/application.properties if needed
Backend Setup

cd backend
mvn clean install
mvn spring-boot:run
The backend will start at http://localhost:8080

Frontend Setup

cd frontend
npm install
npm start
The frontend will start at http://localhost:3000

Configuration

Backend Configuration

Update backend/src/main/resources/application.properties:

# Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/loveblog
spring.datasource.username=your_username
spring.datasource.password=your_password

# JWT Configuration
jwt.secret=your_secret_key
Frontend Configuration

Create .env file in the frontend directory:

REACT_APP_API_URL=http://localhost:8080/api
Usage

Open http://localhost:3000 in your browser
Register a new account
Log in with your credentials
Start creating and sharing your blog posts!
Features Guide

Creating a Post

Click "Create Post" in the navigation bar
Enter a title and content
Add images if desired
Click "Publish"
Profile Customization

Go to your profile page
Click "Edit Profile"
Update your avatar and bio
Save changes
Interacting with Posts

Like posts by clicking the heart icon
Comment on posts using the comment section
Share posts using the share button
Troubleshooting

Common Issues

Database Connection Error

Verify MySQL is running
Check database credentials in application.properties
Backend Not Starting

Ensure Java 17 is installed
Check if port 8080 is available
Frontend Not Starting

Ensure Node.js is installed
Check if port 3000 is available
Support

If you encounter any issues or have questions:

Check the troubleshooting section
Create an issue in the GitHub repository
Contact the maintainer
License

MIT License
