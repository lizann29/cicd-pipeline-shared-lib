def call() {
    sh 'chmod +x scripts/build.sh'
    sh 'npm config set cache /tmp/.npm-cache --global'
    sh './scripts/build.sh'
}