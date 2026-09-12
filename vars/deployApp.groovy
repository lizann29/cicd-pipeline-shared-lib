def call(String containerName, String imageName, String port) {
    sh "docker rm -f ${containerName} || true"
    sh "docker run -d --name ${containerName} -p ${port}:${port} ${imageName}:v1.0"
}
