def call(Map params) {
    echo "DeployToMaster called with anyparam: ${params.anyparam}"
    sh "docker rm -f nodemain-container || true"
    sh "docker run -d --name nodemain-container -p 3000:3000 nodemain:v1.0"
    echo "Deployment to main completed via SharedLib demo function."
}
