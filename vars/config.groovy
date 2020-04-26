def call(String filePath, Closure closure) {
    def map = readYaml file: filePath

    MavenBuilder builder = new MavenBuilder()
    closure.delegate = builder
    closure.resolveStrategy = Closure.DELEGATE_FIRST
    closure()
    
    println map
}
