#!/bin/bash

# Update package lists
sudo apt-get update

# Install Java
sudo apt-get install -y openjdk-11-jdk

# Install Maven
sudo apt-get install -y maven

# Clone the project repository
git clone https://github.com/yourusername/MySpringProject.git

# Change to the project directory
cd MySpringProject

# Build the project using Maven
mvn clean install