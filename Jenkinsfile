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
        sh 'cp target/*.war /var/lib/jenkins/deploy/spark/spark.war'
      }
    }

  }
}
