pipeline {
  agent any

  environment {
    SONAR_HOST_URL = 'http://sonarqube:9000'
    SONAR_LOGIN = credentials('sonar-token')
  }

  stages {
    stage('Build & Test') {
      steps {
        sh 'mvn clean verify'
      }
    }

    stage('SonarQube Scan') {
      steps {
        withSonarQubeEnv('MySonarQube') {
          sh 'mvn sonar:sonar -Dsonar.projectKey=myapp -Dsonar.login=$SONAR_LOGIN'
        }
      }
    }

    stage('Build Docker Image') {
      steps {
        sh 'mvn package'
        sh 'docker build -t myapp:latest .'
      }
    }
  }
}
