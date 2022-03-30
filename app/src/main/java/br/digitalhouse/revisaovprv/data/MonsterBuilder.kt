package br.digitalhouse.revisaovprv.data

class MonsterBuilder {

    var listaDeMonstros = mutableListOf<Monster>()

    //cria o objeto monstro a partir dos parâmetros recebidos
    // na assinatura da função e adiciona na lista
    fun add(imagem : Int, nome : String, id : String){
        var monster = Monster(imagem,nome, id)
        listaDeMonstros.add(monster)
    }

}