multibranchPipelineJob('CI-Pipelines/cart') {
    branchSources {
        github {
            id('23232355533') // IMPORTANT: use a constant and unique identifier
            scanCredentialsId('GitHub')
            repository('https://github.com/akramsalesforce/cart.git')
        }
    }
}