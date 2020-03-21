pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'echo "cool"'
               // archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
            }
        }
    }
}