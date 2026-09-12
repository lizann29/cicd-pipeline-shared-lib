def call() {
    sh 'chmod +x scripts/test.sh'
    sh 'npm config set cache /tmp/.npm-cache --global'
    sh './scripts/test.sh'
}