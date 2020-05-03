def call(String filePath, Closure closure) {
    def request = libraryResource 'globalconfig.yml'
    println "$request"
    def map =  readYaml text: request
    println map
    
    def access_status = new File(filePath).exists()
    
    if (access_status){
        def map1 = readYaml file: filePath
        println map1
        map.putAll(map1)
    }

    MavenBuilder builder = new MavenBuilder(map_var: map)
    closure.delegate = builder
    closure.resolveStrategy = Closure.DELEGATE_FIRST
    closure()
}

