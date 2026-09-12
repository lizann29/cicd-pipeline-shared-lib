def call() {
    sh 'chmod +x scripts/test.sh'
    sh './scripts/test.sh'
}
