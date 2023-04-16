def call(Map stageParms){
    
    checkout([
        $class: 'GitSCM',
        branches: [[name: stageParms.branches]],
        userRemoteConfigs: [[url: stageParms.url]]
    ])
}