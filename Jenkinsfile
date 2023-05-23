pipeline {
    agent any
    tools{
        maven "maven3.8.6"
    }
    stages {
        stage('拉取代码') {
            steps {
                 git  branch: '$gitbranch', url: 'https://gitee.com/grandpa/spring-example.git'
            }
        }
        stage('编译构建') {
            steps {
                 sh label: '',script: 'mvn clean package'
            }
        }
        stage('镜像构建'){
            steps {
                 sh """
                 cd $PWD/src/main/docker
                 docker build -t spring-example:latest
                 """
            }
        }
        stage('运行容器'){
            steps {
                 sh """
                 docker run -d -p80:80 --name spring-example spring-example:latest
                 """
            }
        }
    }

    post {
        // Clean after build
        always {
            cleanWs(cleanWhenNotBuilt: false,
                    deleteDirs: true,
                    disableDeferredWipeout: true,
                    notFailBuild: true,
                    patterns: [[pattern: '.gitignore', type: 'INCLUDE'],
                               [pattern: '.propsfile', type: 'EXCLUDE']])
        }
    }
}
