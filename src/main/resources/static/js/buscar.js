let input = document.getElementById("input");
var filtro = input.value.toLowerCase(); 
var filas = document.getElementsByClassName('fila');
  
  var botonesOrden = document.getElementsByClassName('ordenar');

  for (let i = 0; i < botonesOrden.length; i++) {
    botonesOrden[i].addEventListener('click', function() {
      let columna = this.parentNode.cellIndex; // Obtener el índice de la columna del encabezado
      let tipoOrden = this.getAttribute('data-sort'); // Obtener el tipo de orden del botón

      // Obtener todas las filas de la tabla
      var filas = Array.from(document.getElementsByClassName('fila'));

      // Ordenar las filas según la columna seleccionada y el tipo de orden
      filas.sort(function(a, b) {
        let contenidoA = a.cells[columna].textContent.toLowerCase();
        let contenidoB = b.cells[columna].textContent.toLowerCase();

        if (tipoOrden === 'asc') {
          return contenidoA.localeCompare(contenidoB);
        } else {
          return contenidoB.localeCompare(contenidoA);
        }
      });

      // Actualizar la tabla con las filas ordenadas
      let tabla = document.getElementsByClassName('productos')[0];
      for (var j = 0; j < filas.length; j++) {
        tabla.appendChild(filas[j]);
        filas[j].classList.add("productos");
        filas[j].classList.add("fila");
      }

      // Cambiar el tipo de orden del botón
      if (tipoOrden === 'asc') {
        this.setAttribute('data-sort', 'desc');
      } else {
        this.setAttribute('data-sort', 'asc');
      }
    });
  }