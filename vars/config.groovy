def call(String filePath, Closure closure) {
    def request = libraryResource 'globalconfig.yml'
    println "$request"
    def map =  readYaml text: request
    println map
    
    def file_exist = findFiles (glob: filePath)
   // println file_exist.length
    
    
    //def var = new File(".").getAbsolutePath()
    //def access_status = new File(var + "/" + filePath).exists()
    
    //println var
    //println access_status
    
    if (file_exist.length == 1){
        def map1 = readYaml file: filePath
        println map1
        map.putAll(map1)
    }

    MavenBuilder builder = new MavenBuilder(map_var: map)
    closure.delegate = builder
    closure.resolveStrategy = Closure.DELEGATE_FIRST
    closure()
}

