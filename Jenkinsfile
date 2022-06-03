def gv

pipeline {

    agent any
    environment {
        NEW_VERSION = '1.3.0'  
    }
    parameters{
        string(name: 'VERSION(string)',defaultValue:'1.0',description:'version to deploy')
        choice(name: 'VERSION(choice)', choices: ['1.0','2.0','4.0'] , description: 'available versions')
        booleanParam(name: 'executeTest',defaultValue:true)
    }

    stages {
        stage("init"){
            steps{
                script {
                    gv = load "script.groovy"
                }
            }
        }

        stage("build") {

            steps {
               script {
                   gv.buildApp()
               }
            }
        }
        stage("test") {

            steps {
                 script {
                     gv.testApp()
                 }
            }
        }
        stage("deploy") {

            steps {
                
                script {
                    gv.deployApp()
                }
            }
        }
    }
}
