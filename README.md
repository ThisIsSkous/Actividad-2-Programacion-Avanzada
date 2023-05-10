git clone [https://github.com/ThisIsSkous/Actividad-2-Programacion-Avanzada]
git branch

git branch ramanueva
git checkout ramanueva
# agregar la solución en Python
git add .
git commit -m"agregar cambios en la rama nueva"
git push --set-upstream origin ramanueva # solo en la primera ocasión

git checkout main
# agrego la solución en Java
git add .
git commit -m"agregar cambios en la rama main"
git push
