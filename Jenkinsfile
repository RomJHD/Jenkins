pipeline {
  agent {
    label 'agent1'
  }
  stages {
    stage('Build') {
      steps {
        sh '''mvn clean install
'''
      }
    }

    stage('Test') {
      steps {
        echo 'Test'
      }
    }

    stage('Post Build') {
      steps {
        archiveArtifacts '*/*.war'
      }
    }

    stage('Deploy') {
      steps {
        deploy adapters: [tomcat9(credentialsId: 'c4c1f9b1-20af-417c-aaf3-b3b430e40c84', path: '', url: 'http://192.168.0.20:8080')], contextPath: '/sparkjavoux', war: 'target/*war'
      }
    }

  }
}
