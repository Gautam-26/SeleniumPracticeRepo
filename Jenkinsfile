pipeline {
    agent any

    tools {
        
        maven "Maven 3"
    }

    stages {
        stage('Build') {
            steps {
               
                git 'https://github.com/Gautam-26/MasterSeleniumFramework.git'

                
                bat "mvn -Dmaven.test.failure.ignore=true clean package"

               
            }

            post {
             
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
    }
}
