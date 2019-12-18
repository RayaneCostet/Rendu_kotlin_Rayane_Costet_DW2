fun main(){

    var jeSuisUnChien: Animal = Chien()
    jeSuisUnChien.parler()
    jeSuisUnChien.quiSuisJe()


    var animalerie = Animalerie()
    var shiro: Animal  = Chat()
    var toscane: Animal = Chien()
    animalerie.add2(shiro)
    animalerie.add2(toscane)

    animalerie.affiche()

}
