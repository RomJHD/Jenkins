pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh '''mv clean install
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
        sh 'rm - r /var/lib/tomcat9/webapps/spark*'
        sh 'cp target/*.war /var/lib/jenkins/deploy/spark.war'
      }
    }

  }
}
