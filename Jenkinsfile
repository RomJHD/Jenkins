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
        sh 'cp target/*.war /home/jenkins/deploy/spark/spark.war'
        deploy adapters: [tomcat9(credentialsId: '8b7c4956-b765-42ef-b1ee-055bb8557ed9', path: '', url: '10.125.24.62:8083')], contextPath: '/spark', war: 'target/*.war'
      }
    }

  }
}
