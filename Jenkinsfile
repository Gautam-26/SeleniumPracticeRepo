pipeline {

   agent any 
   tools {
            maven 'Maven 3'
         }
   
   stages {
      stage('checkout the project') {
           steps {
             git branch:'master', url: 'https://github.com/Gautam-26/SeleniumPracticeRepo.git'
                 } 
      }
      
      stage('Build the package') {
          steps 
            sh 'mvn clean package'
          }
      }
   
   }
 

}
