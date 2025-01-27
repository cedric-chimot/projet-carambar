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
      "id": 1,
      "content": "Voici une blague existante !"
    },
    {
      "id": 2,
      "content": "Une autre blague au hasard !"
    }
  ]

### 3. **GET** `/api/blagues/{id}`
Récupérer une blague par son id.
- **Response** :
  ```json
  {
    "id": 1,
    "content": "Voici la blague demandée par son ID."
  }

### 4. **GET** `/api/blagues/random`
Récupérer une blague aléatoire.
- **Response** :
  ```json
  {
    "id": 3,
    "content": "Blague aléatoire pour égayer ta journée !"
  }

