def call(String branchName) {
    if (branchName == 'main') {
        build job: 'Deploy_to_main', wait: false
    } else if (branchName == 'dev') {
        build job: 'Deploy_to_dev', wait: false
    }
}
