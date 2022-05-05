def build(){
    echo 'building in a groovy way...'
    sh 'pwd'
    sh 'ls'
}
def test(){
    echo 'testing in a groovy way...'    
}
def deploy(){
    echo 'deploying in a groovy way...'    
}

return this