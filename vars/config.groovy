def call(String filePath, Closure closure) {
    def map = readYaml file: filePath
    
    println map

    MavenBuilder builder = new MavenBuilder(map)
    closure.delegate = builder
    closure.resolveStrategy = Closure.DELEGATE_FIRST
    closure()
}
