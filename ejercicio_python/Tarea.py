class Universidad:
    def __init__(self, nombre, ubicacion):
        self.nombre = nombre
        self.ubicacion = ubicacion

class Carrera:
    def __init__(self, nombre, universidad):
        self.nombre = nombre
        self.universidad = universidad

# Ejemplo de uso
mi_universidad = Universidad("UTPL", "Ciudad de Loja")
mi_carrera = Carrera("Tranformacion Digital De Empresas", mi_universidad)

# Acceder a los atributos
print(mi_universidad.nombre)
print(mi_carrera.nombre)
print(mi_carrera.universidad.nombre)