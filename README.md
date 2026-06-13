# Système de Gestion de Bibliothèque — Kotlin
---

## Comment exécuter

### Option A — IntelliJ IDEA (le plus simple)

Le projet est **déjà configuré** (fichiers `.idea/` + `tp2.iml` fournis) : le dossier
`src` est marqué comme _Sources Root_, le SDK et le runtime Kotlin sont référencés. Rien à régler.

1. `File > Open…` puis sélectionner le dossier **`tp2`** (le dossier lui-même, pas un fichier).
2. Ouvrir `src/Main.kt` et cliquer sur le **triangle vert** ▶ à côté de `fun main()`.

> SDK du projet : un JDK 25 (`openjdk-25`). Le bytecode cible la JVM 1.8, donc **tout JDK ≥ 8** convient
> si tu rouvres le projet ailleurs — IntelliJ proposera d'en choisir un au premier ouvrage.

### Option B — Ligne de commande (kotlinc + java)

> **Prérequis** : `kotlinc` doit être installé et accessible dans le `PATH`. Sinon, préfère l'Option A
> (IntelliJ embarque son propre compilateur Kotlin — aucune installation requise).

```bash
# Compilation (produit un JAR exécutable)
kotlinc src -include-runtime -d bibliotheque.jar
# Exécution
[Console]::OutputEncoding = [System.Text.Encoding]::UTF8
java "-Dstdout.encoding=UTF-8" -jar bibliotheque.jar
```

> **Accents sur console Windows** : si les accents s'affichent mal (`Ã©` ou `�`), forcez l'UTF-8 :
> `java -Dstdout.encoding=UTF-8 -jar bibliotheque.jar`  (ou lancez `chcp 65001` avant).
> Dans la console d'IntelliJ, les accents s'affichent correctement par défaut.

---

## Résultat d'exécution (sortie réelle du programme)

```
Le DVD 'Inception' a été emprunté.
Le livre '1984' de 'George Orwell' a été emprunté.
Le magazine 'National Geographic', numéro '10' (2024-10-28) est consulté sur place.
Le journal 'Le Monde' du '2024-10-28' est consulté sur place.
L'enregistrement audio 'Beethoven - Symphonie No.9' a été emprunté.
Emprunts en cours:
- DVD: Titre = 'Inception', Durée = '148' minutes, Genre = 'Action'
- Livre: Titre = '1984', Auteur = 'George Orwell', Éditeur = 'Gallimard', Date de parution = '1972-01-01'
- Enregistrement Audio: Titre = 'Beethoven - Symphonie No.9', Durée = '16' minutes, Genre = 'Classical'
Le DVD 'Inception' a été retourné.
Le livre '1984' de 'George Orwell' a été retourné.
Emprunts en cours:
- Enregistrement Audio: Titre = 'Beethoven - Symphonie No.9', Durée = '16' minutes, Genre = 'Classical'
```

