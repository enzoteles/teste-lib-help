# teste-lib-help
Projeto que serve como um guia de como usar a biblioteca libhelp no seu projeto .

configurando a libhelp no projeto
1 passo:

allprojects { <\br>
    repositories {
        google()
        jcenter()
        maven { url 'https://jitpack.io' }
    }
}

2 passo: 

dependencies {
  ...
  implementation 'com.github.enzoteles:libhelp:1.0'
}

