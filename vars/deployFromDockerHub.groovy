def call(String dockerhubRepo, String tag, String containerName, String port) {
    sh "docker pull ${dockerhubRepo}:${tag}"
    sh "docker rm -f ${containerName} || true"
    sh "docker run -d --name ${containerName} --expose ${port} -p ${port}:${port} ${dockerhubRepo}:${tag}"
}
