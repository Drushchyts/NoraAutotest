pipeline {
    agent any
    stages {
        stage('git clone'){
            steps{
                echo 'cloning project'
                git 'https://github.com/Drushchyts/NoraAutotest.git'
                sh 'sudo apt-get update'
             }
        }

        stage('update'){
            steps{
                sh 'sudo apt-get update'
             }
        }

        stage('Build') {
            steps {
                sh 'sudo docker start chrometest'
                sh 'mvn clean test'
            }
        }

        stage('stop chrome') {
            steps {
                sh 'sudo docker stop chrometest'
            }
        }
    }
}