node('workstation'){
    def x = 5
    stage('Test'){
        sh 'echo ${x}'
    }
}