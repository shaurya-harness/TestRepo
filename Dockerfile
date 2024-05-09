# Use an official base image
FROM alpine
# FROM ubuntu:latest

# Set the working directory
# WORKDIR /app

# Copy the current directory contents into the container at /app
# COPY . /app

# Run a command
CMD ["echo", "Hello, Docker!"]
