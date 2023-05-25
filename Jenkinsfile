def prKey = "-Dsonar.pullrequest.key=${env.CHANGE_ID}"
def prBranch = "-Dsonar.pullrequest.branch=${env.CHANGE_BRANCH}"
def prBase = "-Dsonar.pullrequest.base=${env.CHANGE_TARGET}"
def sonarBranch = "-Dsonar.branch.name=${env.BRANCH_NAME}"
def sonarSwitches = null
pipeline {
    agent any
    options {
      skipDefaultCheckout true
    }
    stages {
        stage('Source code') {
            steps {
                git url: 'https://github.com/jarcpro97/maven-basic.git',credentialsId: 'github-credentials', branch: "main"
            }
        }
        stage('Build') {
            steps {
                withMaven(maven: 'maven3_9_2') {
                    sh "mvn clean package"
                }
            }
        }
        stage('Test') {
            steps {
                withMaven(maven: 'maven3_9_2') {
                    sh "mvn clean verify"
                }
            }
        }
        stage('SonarQube analysis') {
            steps {
                withSonarQubeEnv('SonarQube') {
                   withMaven(maven: 'maven3_9_2') {
                     sh "mvn sonar:sonar"
                    }
                }
            }
        }
        stage("Quality gate") {
            steps {
               timeout(time: 1, unit: 'HOURS') {
                           // Parameter indicates whether to set pipeline to UNSTABLE if Quality Gate fails
                           // true = set pipeline to UNSTABLE, false = don't
                           waitForQualityGate abortPipeline: true
                       }
           }
        }
    }
    post {
          always {
            script {
              deleteDir();
              dir("${env.WORKSPACE}@tmp") {
                deleteDir()
              }
            }
          }
    }
}

