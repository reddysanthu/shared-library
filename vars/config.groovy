def call(String filePath, Closure closure) {
    def request = libraryResource 'globalconfig.yml'
    println "$request"
    def map1 =  readYaml text: request
    println map1
    
    
    def map = readYaml file: filePath
    
    println map

    MavenBuilder builder = new MavenBuilder(map_var: map)
    closure.delegate = builder
    closure.resolveStrategy = Closure.DELEGATE_FIRST
    closure()
}

