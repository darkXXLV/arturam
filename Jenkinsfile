pipeline {
  agent any
  stages {
    stage('Git Pull') {
      steps {
        git branch: "main", url: "https://github.com/darkXXLV/arturam"
      }
    }
    stage ('Test') {
      steps {
        echo 'testing in progress...'
        sh 'mvn clean test'
      }
    }
  }
}
