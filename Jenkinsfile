pipeline {

    agent any
    tools {
        maven 'Maven 3'
    }
    stages {
        stage("checkout"){
            steps{
              git branch: 'master', url: 'https://github.com/Gautam-26/SeleniumPracticeRepo.git'
            }
        }

        stage("test") {

            steps {
              sh 'mvn test'
            }
        }
       
    }
}
