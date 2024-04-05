# Réalisations du Projet de Gestion de Tâches en Java

Ce document récapitule les réalisations effectuées dans le cadre du TP de gestion de tâches en Java.

## Fonctionnalités implémentées

### Ajout d'une tâche

- [ ] Formulaire de saisie des détails de la tâche.
- [ ] Bouton "Ajouter".
- [ ] Test unitaire associé.

(Explication et justification de ce qui a été fait...)

### Modification d'une tâche

- [ ] Mécanisme de sélection et de modification de la tâche.
- [ ] Bouton "Modifier".
- [ ] Test unitaire associé.

(Explication et justification de ce qui a été fait...)

### Suppression d'une tâche

- [ ] Mécanisme de sélection et de suppression de la tâche.
- [ ] Bouton "Supprimer".
- [ ] Test unitaire associé.

(Explication et justification de ce qui a été fait...)

### Visualisation des tâches

- [ ] Affichage des détails des tâches existantes.
- [ ] Mécanisme de filtrage ou de tri des tâches.
- [ ] Test unitaire associé.

(Explication et justification de ce qui a été fait...)

### Gestion des priorités

- [ ] Possibilité de définir la priorité lors de l'ajout ou de la modification de la tâche.
- [ ] Test unitaire associé.

(Explication et justification de ce qui a été fait...)

### Possibilité d'évolution

- [ ] Description claire des fonctionnalités potentielles à ajouter dans le futur pour améliorer l'application.
- [ ] Réflexion sur la modularité et la scalabilité de l'application pour faciliter les évolutions futures.

(Explication et justification de ce qui a été fait...)

## Bonus

### Implémentation de la sérialisation des tâches

- [ ] Sauvegarde des tâches lors de la fermeture de l'application.
- [ ] Chargement des tâches lors de l'ouverture de l'application.
- [ ] Test unitaire associé.

(Explication et justification de ce qui a été fait...)

Ce qui je devais faire c'est qu'il va avoir une fenêtre avec 3 scène possible :
- une scène principale qui va avoir la consigne pour ajouter un article et des boutons pour aller vers les autres scène
- une scène ou l'on pourra visualiser les taches avec tout les éléments et ou l'on pourra en supprimer une en rentrent le numéro de la tache
- la dernière scène qui permettra de modifier une valeur

Mon idée était de créer des tableau de string.
Que chaque tableau a ça spécificité (le nom, la description,...)

# Les différentes classes
- classes Vue : permettra de mettre la methode pour afficher la fenètre et mettra aussi les 3 scènes :
  - Scène 1 (main) : 
    - Un text ou on aura les consignes (Pour ajouter une consigne il faut le mettre comme l'exemple "<nom de la tache>.<description de la tache>.<date de la tache>"; ne pas mettre de valeur si rien a mettre mais toujours garder la structure comme l'exemple) #5
    - Une zone de text ou l'on va écrire écrire avec la bonne norme pour ajouter les éléments #4
    - Un bouton cliquable qui permet de valider la sélection et qui appelle une méthode pour prendre le texte et le séparer par rapport a l'ordre demander et le placer dans les différents tableau #1
    - Un bouton qui permet d'appeler une methode pour changer pour la scène qui permet de visualiser les taches #2
    - Un bouton qui permet d'appeler une methode pour changer pour la scène qui permet de modifier les taches #3
  - Scène 2 (suppression et visualisation des taches) :
    - Une zone de text ou l'on aura mettre le numéro de la tache a supprimer complètement #6
    - Un bouton cliquable qui permet d'appeler un méthode pour la suppression pour chaque table du numéro d'emplacement de la taches #7
    - Un tableau avec 4 colones #8:
      - Colone de l'emplacement des éléments
      - Colone nom taches
      - Colone Description taches
      - Colone date expiration taches
  - Scène 3 (modification éléments de taches):
    - #10
    - Un bouton qui permet d'appeler une méthode pour changer la valeur de la methode de modification de table suivant ce que vous avez mis dans la zone de texte #10. #11
    - #12
    - 
- classe Model : On aura tous les tableau de string
- classe Controler : On aura les méthodes qui sont:
  - une méthode pour 