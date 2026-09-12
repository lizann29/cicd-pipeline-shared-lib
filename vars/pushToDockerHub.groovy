def call(String imageName, String dockerhubRepo, String tag, String credsId) {
    withCredentials([usernamePassword(credentialsId: credsId, usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASS')]) {
        sh "echo \$DOCKER_PASS | docker login -u \$DOCKER_USER --password-stdin"
        sh "docker tag ${imageName}:v1.0 ${dockerhubRepo}:${tag}"
        sh "docker push ${dockerhubRepo}:${tag}"
    }
}
