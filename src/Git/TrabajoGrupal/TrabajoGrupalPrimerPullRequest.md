# esto es un repaso porque yo ya lo termine pero aqui iran los pasos de como hacer un pull request
# con tus amigos

1. primero busca a tus amigos 
2. segundo crea tu repositorio en git hub y vinculalo con el repositorio local al remoto 
3. ya una vez vinculala create una rama con tu nombre  en mi caso le pondre juanito con el comando -** `git checkout -b juanit`**:
4. listo una vez eso creas un documento con tu nombre y punto md ejemplo: juanito.md
5. perfecto una vez echo eso subes los cambios pero por si no sabes como subir los cambios con otra rama aqui un video:https://www.youtube.com/watch?v=0ErDzT_1yNo&t=305s
6. una vez echo eso y ya subido el repo agregas a tu amigo como colaborador despues todo sera problema del amigo xddd

# Para el amisho

## Paso 1: Clonar el repositorio

1. Primero, clona el repositorio del proyecto a tu máquina local:git clone [URL_DEL_REPOSITORIO]

## Paso 2: Crear una nueva rama
Crea una nueva rama para trabajar en tu contribución. Es una buena práctica nombrar la rama de manera descriptiva:git checkout -b agregar-receta-pizza

## Paso 3: Hacer cambios en el archivo
Edita o crea el archivo que contiene los pasos para hacer una pizza. Usa Markdown para darle formato al contenido.

Por ejemplo, crea un archivo llamado tuNombre.md y añade lo siguiente:
//esto es un ejemplo no lo vallan a copiar
# Cómo Hacer una Pizza
## Ingredientes

- 500g de harina
- 300ml de agua
- 10g de sal
- 20g de aceite de oliva
- 25g de levadura fresca
- Salsa de tomate
- Queso mozzarella
- Ingredientes al gusto (pepperoni, champiñones, etc.)

## Pasos

1. **Preparar la masa**:
   - Mezcla la harina, sal, y levadura en un bol.
   - Añade el agua y el aceite de oliva.
   - Amasa hasta obtener una mezcla homogénea.
   - Deja reposar la masa durante 1 hora.

2. **Preparar la base**:
   - Extiende la masa con un rodillo sobre una superficie enharinada.
   - Coloca la masa en una bandeja para hornear.

3. **Añadir ingredientes**:
   - Extiende la salsa de tomate sobre la masa.
   - Añade el queso mozzarella y otros ingredientes al gusto.

4. **Hornear**:
   - Precalienta el horno a 220°C.
   - Hornea la pizza durante 15-20 minutos o hasta que esté dorada y crujiente.

5. **Servir**:
   - Saca la pizza del horno.
   - Deja enfriar durante unos minutos, corta en porciones y sirve.

¡Disfruta tu pizza casera!

## Paso 4: Añadir cambios al área de preparación
Añade los archivos modificados al área de preparación: git add .

Paso 5: Hacer un commit de los cambios
Haz un commit de los cambios con un mensaje descriptivo:git commit -m "Agregar receta de cómo hacer una pizza de tuNombre"

## Paso 6: Subir la rama al repositorio remoto
Sube la rama con tus cambios al repositorio remoto:git push origin agregar-receta-pizza


## Paso 7: Crear un Pull Request
Ve a la página del repositorio en GitHub.
Haz clic en el botón "Compare & pull request" que aparece después de subir la rama.
Completa el formulario del Pull Request con un título descriptivo y un comentario detallando los cambios realizados.
Haz clic en "Create pull request" para enviar la solicitud.
Resumen de comandos y pasos:


1) Clonar el repositorio:
git clone [URL_DEL_REPOSITORIO]
2) Crear una nueva rama:
git checkout -b agregar-receta-pizza
3) Hacer cambios en el archivo:
Crear/editar receta_pizza.md con el contenido en Markdown.
4) Añadir cambios al área de preparación:
git add receta_pizza.md
5) Hacer un commit de los cambios:
git commit -m "Agregar receta de cómo hacer una pizza"
6) Subir la rama al repositorio remoto:
git push origin agregar-receta-pizza
7) Crear un Pull Request en GitHub:
Ve al repositorio en GitHub.
Haz clic en "Compare & pull request".
Completa y envía el formulario del Pull Request.
    