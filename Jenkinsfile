pipeline {
    agent any
    
    environment {
        GIT_CREDENTIALS = 'ae82f4cb-8a51-4ee3-8e17-b694feff74dc'
        BRANCH_NAME = 'jerry'
    }

    stages {
        stage('Checkout') {
            steps {
                script {
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

        stage('Build') {
            steps {
                script {
                    try {
                        dir('C:\\Users\\Asus\\OneDrive\\Desktop\\RepoFolder\\flipkart\\src\\main\\java') {
                            bat 'javac my_first.java'
                            bat 'java my_first 2021'
                            bat 'default.txt'
                            bat 'index.html'
                        }
                    } catch (Exception e) {
                        currentBuild.result = 'FAILURE'
                        error "Build failed: ${e.message}"
                    }
                }
            }
        }
    }
}
