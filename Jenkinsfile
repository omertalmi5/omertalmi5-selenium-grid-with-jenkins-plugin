pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                TEST_NAME    = 'tests'
                sh 'docker build -t ${TEST_NAME} .'
            }
        }
    }
}