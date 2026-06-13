class DVD(
    titre: String,
    val duree: Int,
    val genre: String,
    dateDeParution: String
) : Media(titre, dateDeParution), Empruntable {

    private var estEmprunte = false

    override fun emprunter(): Boolean {
        if (estEmprunte) return false
        estEmprunte = true
        println("Le DVD '$titre' a été emprunté.")
        return true
    }

    override fun retourner(): Boolean {
        if (!estEmprunte) return false
        estEmprunte = false
        println("Le DVD '$titre' a été retourné.")
        return true
    }

    override fun afficher() {
        println(" - DVD: Titre = '$titre', Durée = '$duree' minutes, Genre = '$genre'")
    }
}
