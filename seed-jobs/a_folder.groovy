multibranchPipelineJob('CI-Pipelines/cart') {
    branchSources {
        github {
            id('3535352323') // IMPORTANT: use a constant and unique identifier
            repository('https://github.com/akramsalesforce/cart.git')
        }
    }
}