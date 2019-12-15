fun main(){

    val animalerie = Animalerie()

    animalerie.ajouterAnimal4Pattes(Chat())
    animalerie.ajouterAnimal4Pattes(Chien())
    animalerie.ajouterAnimal2Pattes(Perroquet())
    animalerie.ajouterAnimal4Pattes(Lama())

    for (race1 in animalerie.list1){
        race1.quiSuisJe()
    }

    for (race2 in animalerie.list2){
        race2.quiSuisJe()
    }

    val arr1 = arrayOf(Chat(), Chien(), Lama())
    for(race1 in arr1){
        race1.quiSuisJe()
        race1.nombrePatte()
        race1.parler()
    }

    val arr2 = arrayOf(Perroquet())
    for(race2 in arr2){
        race2.quiSuisJe()
        race2.nombrePatte()
        race2.parler()
    }
}