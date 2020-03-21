pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat 'docker build -t tests .'
                bat 'echo "Finish build image"'
            }
        }
    }
}