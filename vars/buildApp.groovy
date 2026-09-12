def call() {
    sh 'chmod +x scripts/build.sh'
    sh './scripts/build.sh'
}
