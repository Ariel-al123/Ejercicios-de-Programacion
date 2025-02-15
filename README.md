# Instalación de Wsl

#### Ejecuta primero el comando

```sh
    wsl --install
```

#### Después ejecuta

```sh
    wsl --install -d ubuntu
```

## Error 0x8000ffff

Verifica que el kernel que está instalado

```sh
    wsl --statuswsl --status
```

Actualiza wsl

```sh
   wsl.exe --update
```

Verificá La lista de OS que puedes instalar

```sh
   wsl --list --online
```

Vuelve a ejecutar el comando de...

```sh
   wsl --install -d < OS seleccionado >
```

## Instalación de GCC

#### Primero ejecuta este comando...

Sirve para actualizar toda la lista de paquetes de Linux

```sh
sudo apt update
```

#### Después ejecuta el siguiente comando...

Instala todos los paquetes necesario para ejecutar C

```sh
sudo apt install gcc
```

<hr>

### Compilación Y Ejecución...

1-. Abre VS Code y crea un archivo de C 
(para sea más fácil te dejo el Hola Mundo)

```C:
#include <stdio.h>

int main(){
    printf("Hola Mundo \n");

    return 0;
}
```

2-. Abre la terminal con Ctrl+ Ñ  y selecciona la terminal  Ubuntu (WSL).

3-. Verifica que este tu archivo con...

```sh
    ls
```

4-. Ya que este el programa guardado, compilas el programa.

```sh
    gcc archivo.c -o archivo
```

5-. Después ejecutas el programa con...

```sh
    ./ archivo
```
