class Animalerie {

    var list1 = mutableListOf<Animal4Pattes>()

    fun ajouterAnimal4Pattes(race1 : Animal4Pattes){
        list1.add(race1)
    }

    var list2 = mutableListOf<Animal2Pattes>()

    fun ajouterAnimal2Pattes(race2 : Animal2Pattes){
        list2.add(race2)
    }
}