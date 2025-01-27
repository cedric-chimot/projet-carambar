# Blagues Carambar - API

## Description
Blagues Carambar est une application qui permet d'ajouter, de consulter et de récupérer des blagues aléatoires. Cette API expose plusieurs endpoints permettant d'interagir avec la base de données des blagues.

## Fonctionnalités de l'API
- **Ajouter une blague** : Ajouter une nouvelle blague à la base de données.
- **Consulter toutes les blagues** : Récupérer la liste de toutes les blagues enregistrées.
- **Récupérer une blague par ID** : Récupérer une blague spécifique par son identifiant.
- **Récupérer une blague aléatoire** : Récupérer une blague choisie au hasard.

## Endpoints de l'API

### 1. **POST** `/api/blagues/create`
Ajouter une nouvelle blague.
- **Request body** :
  ```json
  {
    "content": "Voici une nouvelle blague !"
  }

### 2. **GET** `/api/blagues/all`
Récupérer toutes les blagues.
- **Response** :
  ```json
  [
    {
        "id": id de la blague,
        "content": "contenu d'une blague existante"
    },
    etc...
  ]

### 3. **GET** `/api/blagues/{id}`
Récupérer une blague par son id.
- **Response** :
  ```json
  {
      "id": id de la blague recherchée,
      "content": "contenu de la blague trouvée si elle existe"
  }

### 4. **GET** `/api/blagues/random`
Récupérer une blague aléatoire.
- **Response** :
  ```json
  {
      "id": id de la blague,
      "content": "contenu d'ue blague au hasard"
  }
