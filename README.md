# Tests Unitaires et Intégration Continue avec Spring Boot

## Description
Cet application Spring Boot effectue des tests unitaires de l'intégration continue via GitHub Actions.

## Technologies utilisées
- **Spring Boot 3.2.0** 
- **H2 Database** - Base de données en mémoire pour les tests
- **JUnit & Mockito** 
- **Maven** 
- **GitHub Actions**

## Base de données
Le projet utilise **H2**, une base de données en mémoire configurée dans `src/test/resources/application.properties`.
Les tables sont créées automatiquement à chaque lancement des tests et supprimées à la fin.

## Repositories
Les repositories utilisent l'annotation **@NativeQuery** pour exécuter des requêtes SQL natives :


## Tests Unitaires
Les tests se trouvent dans le chemin suivant `src/test/java/` :
- **ProductServiceTest** 
- **ProductControllerTest** 

## Intégration Continue
Le projet utilise **GitHub Actions** (au lieu de GitLab CI) avec le fichier `.github/workflows/ci.yml`.

Pipeline avec 2 jobs :
1. **build** : Compilation du projet
2. **test** : Exécution des tests unitaires

Le pipeline se déclenche automatiquement à chaque push sur la branche `main`.