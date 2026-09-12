def call(String imageName, String port) {
    sh "docker build --build-arg PORT=${port} -t ${imageName}:v1.0 ."
}
