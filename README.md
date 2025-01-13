# ELK Example Setup

This repository demonstrates how to set up and run a sample ELK stack application with logging capabilities. Follow the steps below to execute the example locally.

## Prerequisites

Before you begin, ensure you have the following installed:

- [Git](https://git-scm.com/)
- [Maven](https://maven.apache.org/)
- [Docker](https://www.docker.com/)

## Steps to Execute

### 1. Clone the Repository

First, clone the repository to your local machine:

```bash
git clone https://github.com/caianajsb/ELK.git
```

### 2. Navigate to the Project Directory

Go into the project folder:

```bash
cd ELK
```

### 3. Build the Project

Compile the project using Maven:

```bash
mvn package
```

### 4. Build the Docker Image

Next, build the Docker image using the provided Dockerfile:

```bash
docker build -t caiana .
```

### 5. Start the ELK Stack with Docker Compose

Run the ELK stack services using Docker Compose:

```bash
docker-compose up
```

This command will start the following services:

- **Elasticsearch**: for storing and indexing logs.
- **Logstash**: for processing and transforming logs.
- **Kibana**: for visualizing logs and creating dashboards.

### 6. Generate Sample Logs

To generate logs for the ELK stack, visit the following URL in your browser or send a GET request using a tool like [Postman](https://www.postman.com/) or [curl](https://curl.se/):

```
http://localhost:8080/api/generate-log
```

This will generate a sample log entry in Elasticsearch.

### 7. View Logs in Kibana

Open Kibana to view and analyze the generated logs:

```
http://localhost:5601
```

In Kibana, you can create dashboards, explore logs, and use the powerful querying features to visualize your data.

---

## Troubleshooting

- If you encounter issues starting Docker services, make sure Docker is running and configured correctly on your machine.
- If Kibana doesn't show logs, verify that Logstash is properly forwarding logs to Elasticsearch.

---

Enjoy exploring the ELK stack! Feel free to contribute or reach out with any issues or questions.

