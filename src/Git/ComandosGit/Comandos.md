# Comandos Importantes en Git

## Inicialización y Clonación

- **`git init`**:
    - Inicializa un nuevo repositorio Git en el directorio actual.

- **`git clone [url]`**:
    - Clona un repositorio remoto a un nuevo directorio local.

## Estado y Registro

- **`git status`**:
    - Muestra el estado actual del repositorio, incluyendo cambios sin seguimiento y archivos en el área de preparación (staging area).

- **`git log`**:
    - Muestra el historial de commits en el repositorio.

## Añadir y Confirmar Cambios

- **`git add [archivo]`**:
    - Agrega un archivo al área de preparación (staging area) para ser incluido en el próximo commit.

- **`git commit -m "mensaje"`**:
    - Realiza un commit con los cambios en el área de preparación y añade un mensaje descriptivo.

## Enviar y Recibir Cambios

- **`git push`**:
    - Sube los commits locales a un repositorio remoto.

- **`git pull`**:
    - Descarga y fusiona cambios desde un repositorio remoto al repositorio local.

- **`git fetch`**:
    - Descarga datos desde un repositorio remoto pero no los fusiona automáticamente en el repositorio local.

## Ramas

- **`git branch`**:
    - Lista las ramas disponibles en el repositorio o crea una nueva rama.

- **`git checkout [branch]`**:
    - Cambia a la rama especificada.

- **`git checkout -b [branch]`**:
    - Crea y cambia a una nueva rama.

- **`git merge [branch]`**:
    - Fusiona la rama especificada con la rama actual.

## Diferencias y Reseteo

- **`git diff`**:
    - Muestra las diferencias entre archivos en el área de trabajo y el área de preparación o entre commits.

- **`git reset [archivo]`**:
    - Remueve el archivo del área de preparación pero mantiene los cambios en el directorio de trabajo.

- **`git reset --hard [commit]`**:
    - Resetea el índice y el directorio de trabajo al estado del commit especificado, eliminando todos los cambios posteriores.

## Guardar y Aplicar Cambios Temporales

- **`git stash`**:
    - Guarda temporalmente los cambios en el directorio de trabajo que aún no están listos para ser commitados.

- **`git stash apply`**:
    - Aplica los cambios guardados en el último stash al directorio de trabajo.

## Remotos

- **`git remote`**:
    - Muestra los repositorios remotos configurados o permite añadir/quitar repositorios remotos.

## Etiquetas

- **`git tag`**:
    - Crea, lista o elimina etiquetas en el repositorio.

## Rebase y Cherry-Pick

- **`git rebase`**:
    - Reaplica commits sobre una base diferente, permitiendo mantener un historial más lineal.

- **`git cherry-pick [commit]`**:
    - Aplica los cambios de un commit específico en la rama actual.

## Eliminar y Mover Archivos

- **`git rm [archivo]`**:
    - Elimina un archivo del índice y del directorio de trabajo.

- **`git mv [archivo_actual] [archivo_nuevo]`**:
    - Mueve o renombra un archivo en el repositorio.

## Bisect

- **`git bisect`**:
    - Utiliza una búsqueda binaria para encontrar el commit específico que introdujo un error.
