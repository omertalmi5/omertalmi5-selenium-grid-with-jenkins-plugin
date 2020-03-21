pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat 'docker build -t omertalmi5/tests-on-grid .'

                bat 'docker push omertalmi5/tests-on-grid/${BUILD_NUMBER}'
                bat 'docker push omertalmi5/tests-on-grid/latest'
                bat 'echo "Finished push image to dockerhub"'

                bat "docker-compose up --scale chrome=3"
            }
        }
    }
}