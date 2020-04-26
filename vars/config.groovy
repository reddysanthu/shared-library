def call(String filePath, Closure closure) {
    def map = readYaml file: filePath
    println map
    //MavenBuilder builder = new MavenBuilder()
    //closure.delegate = builder
}
