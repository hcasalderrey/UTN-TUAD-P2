/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1.sistema.de.stock;

/**
 *
 * @author HERNAN CASALDERREY
 */
public class SistemaDeStock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Inventario inventario = new Inventario();

        //Crear al menos cinco productos con distintas categorías.
        Producto p1 = new Producto("P001", "Arroz", 1200, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Celular", 25000, 10, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Remera", 3000, 20, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Silla", 5000, 15, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Fideos", 1100, 40, CategoriaProducto.ALIMENTOS);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        //Listar todos los productos mostrando su información y categoría.
        System.out.println("Listado de productos:");
        inventario.listarProductos();

        //Buscar un producto por su ID y mostrarlo.
        System.out.println("\nBuscar producto por ID (P003):");
        Producto buscado = inventario.buscarProductoPorId("P003");
        if (buscado != null) buscado.mostrarInfo();
        
        //Filtrar productos por categoría específica.
        System.out.println("\nFiltrar por categoría ALIMENTOS:");
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);

        //Eliminar un producto por su ID y listar los restantes.
        System.out.println("\nEliminar producto P002:");
        inventario.eliminarProducto("P002");
        inventario.listarProductos();

        //Actualizar el stock de un producto.
        System.out.println("\nActualizar stock de P001 a 80:");
        inventario.actualizarStock("P001", 80);
        inventario.buscarProductoPorId("P001").mostrarInfo();

        //Mostrar el total de stock disponible.
        System.out.println("\nTotal de stock:");
        System.out.println(inventario.obtenerTotalStock());

        //Obtener y mostrar el producto con mayor stock.
        System.out.println("\nProducto con mayor stock:");
        Producto mayor = inventario.obtenerProductoConMayorStock();
        if (mayor != null) mayor.mostrarInfo();

        //Filtrar productos con precios entre $1000 y $3000.
        System.out.println("\nProductos entre $1000 y $3000:");
        inventario.filtrarProductosPorPrecio(1000, 3000);

        //Mostrar las categorías disponibles con sus descripciones.
        System.out.println("\nCategorías disponibles:");
        inventario.mostrarCategoriasDisponibles();


    }
    
}
