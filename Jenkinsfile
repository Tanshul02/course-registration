pipeline {

    agent any

    stages {

        stage('Checkout') {
            steps {
                echo 'Course Registration source code checked out'
            }
        }

        stage('Compile') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Unit Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package'
            }
        }

    }

    post {

        success {
            echo 'Course Registration CI Pipeline completed successfully!'
        }

        failure {
            echo 'Course Registration CI Pipeline failed!'
        }
    }
}
