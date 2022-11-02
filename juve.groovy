pipeline {
    agent { "*"
      }
    triggers {
        pollSCM '*'
    }
    stages {
        stage('Build') {
            steps {
                echo "Building.."
                sh '''
                cd git-tutorial-code/jenkins-101
                touch mamma.txt
                '''
           }
        }
    }
}
