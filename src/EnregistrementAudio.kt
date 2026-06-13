class EnregistrementAudio(
    titre: String,
    val duree: Int,
    val genre: String,
    dateDeParution: String
) : Media(titre, dateDeParution), Empruntable {

    private var estEmprunte = false

    override fun emprunter(): Boolean {
        if (estEmprunte) return false
        estEmprunte = true
        println("L'enregistrement audio '$titre' a été emprunté.")
        return true
    }

    override fun retourner(): Boolean {
        if (!estEmprunte) return false
        estEmprunte = false
        println("L'enregistrement audio '$titre' a été retourné.")
        return true
    }

    override fun afficher() {
        println(" - Enregistrement Audio: Titre = '$titre', Durée = '$duree' minutes, Genre = '$genre'")
    }
}
