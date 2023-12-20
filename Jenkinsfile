pipeline {
    agent any
environment {
        GIT_CREDENTIALS = 'ae82f4cb-8a51-4ee3-8e17-b694feff74dc'
        BRANCH_NAME = 'jerry'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout([$class: 'GitSCM',
                    branches: [[name: "refs/heads/${BRANCH_NAME}"]],
                    doGenerateSubmoduleConfigurations: false,
                    extensions: [[$class: 'CleanBeforeCheckout']],
                    submoduleCfg: [],
                    userRemoteConfigs: [[url: 'https://github.com/Suresh1925/flipkart.git',
                                        credentialsId: "${GIT_CREDENTIALS}"]]])
            }
        }

       stage('Build') {
    steps {
        dir('C:\\Users\\Asus\\OneDrive\\Desktop\\RepoFolder\\flipkart\\src\\main\\java') {
            script {
                try {
                    bat 'javac my_first.java'
                    bat 'java my_first 2021'
                } catch (Exception e) {
                    currentBuild.result = 'FAILURE'
                    error "Build failed: ${e.message}"
                }
            }
        }
    }
}
    }
}
