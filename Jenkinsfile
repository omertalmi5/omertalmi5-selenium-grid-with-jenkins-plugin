pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat 'docker build -t omertalmi5/tests-on-grid .'
                bat 'echo "Finished build image"'
                
                bat 'docker push omertalmi5/tests-on-grid'
                bat 'echo "Finished push image to dockerhub"'

                bat 'docker-compose up'
            }
        }
    }
}