pipeline {
    agent any
    tools {
        maven 'Maven 3'
        jdk 'Java 8'
    }
    options {
        buildDiscarder(logRotator(artifactNumToKeepStr: '2'))
    }
    stages {
        stage ('Build') {
            steps {
                sh 'mvn clean package'
            }
            post {
                success {
                    archiveArtifacts artifacts: 'target/plugin-archetype-*.jar', fingerprint: true
                }
            }
        }

        stage ('Deploy') {
            when {
                branch "dev/2.0"
            }
            steps {
                sh 'mvn deploy -DskipTests'
            }
        }
    }

    post {
        always {
            deleteDir()
        }
    }
}