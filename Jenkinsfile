pipeline {
    agent any
    stages {
        stage('git clone'){
            steps{
                echo 'cloning project'
                git 'https://github.com/Drushchyts/NoraAutotest.git'
             }
        }

        stage('update'){
            steps{
                sh 'sudo apt-get update'
             }
        }

        stage('start chrometest') {
             steps {
                sh 'sudo docker start chrometest'
                    }
                }

        stage('run test') {
            steps {
                sh 'mvn clean test'
            }
        }

        stage('stop chrometest') {
            steps {
                sh 'sudo docker stop chrometest'
            }
        }
    }
}