pipeline {

   agent any 
   tools {
            maven 'Maven 3'
         }
   
   stages {
     
       stage('Hello World') {
           steps {
echo "Hello Wold"
                 } 
      }
      stage('checkout the project') {
           steps {
             git url: 'https://github.com/Gautam-26/SeleniumPracticeRepo.git', branch: 'master'
                 } 
      }
      
      stage('Build the package') {
         steps {
            sh 'mvn clean package'
          }
      }
   
   }
 

}
