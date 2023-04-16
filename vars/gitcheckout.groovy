def call(Map stageParms){
    
    checkout([
        $class: 'GitSCM',
        branches: [[ name: stageParms.branch ]],
        userRemoteConfigs: [[ url: stageParms.url ]]
    ])
}