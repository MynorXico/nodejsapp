job('Aplicacion Node.js DSL') {
    description('Aplicación Node JS DSL para el curso de Jenkins')
    scm {
        git('https://github.com/MynorXico/nodejsapp.git', 'master') { node ->
            node / gitConfigName('MynorXico')
            node / gitConfigEmail('mynorottoniel.xico2@gmail.com')
        }
    }
    triggers {
        scm('H/7 * * * *')
    }
    wrappers {
        nodejs('nodejs')
    }
    steps {
        shell("npm install")
    }
}
