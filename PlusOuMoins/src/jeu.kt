fun main(args: Array<String>) {
    println("CHOISIR UN NOMBRE ENTRE 1 ET 100")
    println()
    println("Joueur 1:")
    println("Entrer votre nombre: ")
    val nombreJuste: Int = readLine()!!.toInt()
    var essai: Int = 0
    var check: String
    var nombreCherche: Int = 0
    //println("Votre nombre est: $nombreJuste")
    println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n")


    do{
        println()
        println("Joueur 2:")
        println( "Appuyer sur 'c' pour continuer ou 'q' pour quitter:")
        check = readLine()!!

        if (check == "q"){

            println("Dommage le nombre était : $nombreJuste")
            println("Nombre d'essais : $essai")
            break

        }else if (check == "c"){
            println("Entrer votre nombre:")
            nombreCherche = readLine()!!.toInt()
            essai++

        when{
            nombreCherche != nombreJuste -> println("Nombre d'essais : $essai")
        }

        when{
            nombreCherche > nombreJuste -> println("C'est plus bas,")
            nombreCherche < nombreJuste -> println("C'est plus haut,")
            else -> println("Vous avez trouvé le nombre, Bravo !!")
        }

        when(nombreCherche){
            in nombreJuste..nombreJuste -> println()
            in nombreJuste-5..nombreJuste+5 -> println("Tu chauffes beaucoup !!")
            in nombreJuste-15..nombreJuste+15 -> println("Tu chauffes !")
            in nombreJuste-25..nombreJuste+25 -> println("Tu es moyen !")
            in nombreJuste-35..nombreJuste+35 -> println("Tu es froid !")
            in nombreJuste-45..nombreJuste+45 -> println("Tu es très froid !!")
        }

        }


    }while (nombreCherche != nombreJuste)
}