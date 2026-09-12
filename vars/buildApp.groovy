def call() {
    sh 'chmod +x scripts/build.sh'
    sh 'export HOME=/tmp && npm_config_cache=/tmp/.npm-cache ./scripts/build.sh'
}