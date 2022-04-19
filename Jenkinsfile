pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'build in progress...'
        javac calculator.java
      }
    }
    stage ('Test') {
      steps {
        echo 'testing in progress...'
      }
    }
  }
}
