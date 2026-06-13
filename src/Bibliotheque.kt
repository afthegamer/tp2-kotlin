class Bibliotheque {

    val medias: MutableList<Media> = mutableListOf()
    val emprunts: MutableList<Media> = mutableListOf()

    fun ajouterMedia(media: Media) {
        medias.add(media)
    }

    fun emprunter(media: Media) {
        if (media !is Empruntable) {
            println("Le média '${media.titre}' ne peut pas être emprunté.")
            return
        }
        if (media in emprunts) {
            println("Le média '${media.titre}' est déjà emprunté.")
            return
        }
        if (media.emprunter()) {
            emprunts.add(media)
        }
    }

    fun retourner(media: Media) {
        if (media !is Empruntable) {
            println("Le média '${media.titre}' ne peut pas être retourné.")
            return
        }
        if (media !in emprunts) {
            println("Le média '${media.titre}' n'est pas emprunté.")
            return
        }
        if (media.retourner()) {
            emprunts.remove(media)
        }
    }

    fun consulter(media: Media) {
        if (media is Consultable) {
            media.consulter()
        } else {
            println("Le média '${media.titre}' ne peut pas être consulté sur place.")
        }
    }

    fun afficherEmprunts() {
        println("Emprunts en cours:")
        emprunts.forEach { it.afficher() }
    }
}
