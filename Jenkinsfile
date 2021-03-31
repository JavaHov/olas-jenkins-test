pipeline {
    agent any

    tools {
        maven 'Maven 3.6.3'
    }

    stages {

        stage('build') {

            steps {

                echo 'Hello World!'
                sh 'mvn clean compile'
            }
        }

        stage('test') {

            steps {

                sh 'mvn test'
            }

        }
    }

}