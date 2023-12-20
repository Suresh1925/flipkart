pipeline {
    agent any

    environment {
        // Set the Git credentials ID
        GIT_CREDENTIALS = 'ae82f4cb-8a51-4ee3-8e17-b694feff74dc'
        // Set the branch you want to clone
        BRANCH_NAME = 'jerry'
    }
    stages {
        stage('Checkout') {
            steps {
                script {
                    // Checkout the Git repository with specific branch
                    checkout([$class: 'GitSCM',
                              branches: [[name: "refs/heads/${BRANCH_NAME}"]],
                              doGenerateSubmoduleConfigurations: false,
                              extensions: [[$class: 'CleanBeforeCheckout']],
                              submoduleCfg: [],
                              userRemoteConfigs: [[url: 'https://github.com/Suresh1925/flipkart.git',
                                                  credentialsId: "${GIT_CREDENTIALS}"]]])
                }
            }
        }
        stage('build') {
            steps{
                dir('C:\\Users\\Asus\\OneDrive\\Desktop\\RepoFolder\\flipkart\\src\\main\\java') {
    bat 'javac my_first.java'
    bat 'java my_first 2021'
}
            }
        }
    }
}
