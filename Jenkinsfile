pipeline {
    agent any
    stages {
        stage('git clone'){
            steps{
                git 'https://github.com/Drushchyts/NoraAutotest.git'
             }
        }
        stage('Build') {
            steps {
                sh 'ls -la'
                sh 'sudo docker-compose build'
                sh 'sudo docker-compose up'
            }
        }
    }
}
