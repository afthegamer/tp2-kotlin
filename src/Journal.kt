class Journal(
    titre: String,
    dateDeParution: String
) : Media(titre, dateDeParution), Consultable {

    override fun consulter() {
        println("Le journal '$titre' du '$dateDeParution' est consulté sur place.")
    }

    override fun afficher() {
        println(" - Journal: Titre = '$titre', Date de parution = '$dateDeParution'")
    }
}
