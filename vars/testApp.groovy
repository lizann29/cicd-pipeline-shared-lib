def call() {
    sh 'chmod +x scripts/test.sh'
    sh 'export HOME=/tmp && npm_config_cache=/tmp/.npm-cache ./scripts/test.sh'
}