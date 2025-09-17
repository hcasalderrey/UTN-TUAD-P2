/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica5;

/**
 *
 * @author el_to
 */
public class Practica5 {

    public static void main(String[] args) {

        System.out.println("=== Programación II - TP5: Relaciones UML (Ej. 1 a 14) ===");

        // -----------------------
        // EJERCICIO 1: Pasaporte -> Foto (Composición); Pasaporte <-> Titular (Asociación bidireccional)
        // -----------------------
        System.out.println("\n[1] Pasaporte-Foto-Titular");
        Ex1_Titular titular1 = new Ex1_Titular("Hernán", "12345678");
        Ex1_Pasaporte pas1 = new Ex1_Pasaporte("AR-2025-0001", "2025-01-15", "img_pasaporte.jpg", "JPG");
        pas1.setTitular(titular1); // establece ambos lados
        System.out.println(pas1);
        System.out.println(titular1);

        // -----------------------
        // EJERCICIO 2: Celular - Bateria (Agregación) ; Celular <-> Usuario (Asociación bidireccional)
        // -----------------------
        System.out.println("\n[2] Celular-Bateria-Usuario");
        Ex2_Bateria bat = new Ex2_Bateria("BT-5000", 5000);
        Ex2_Celular cel = new Ex2_Celular("123456789012345", "Nokia", "1100");
        cel.setBateria(bat); // agregación: puede existir la batería independiente
        Ex2_Usuario usu2 = new Ex2_Usuario("Ana", "30111222");
        cel.setUsuario(usu2); // establece ambos lados 1-1
        System.out.println(cel);
        System.out.println(usu2);

        // -----------------------
        // EJERCICIO 3: Libro -> Autor (Asociación unidireccional); Libro -> Editorial (Agregación)
        // -----------------------
        System.out.println("\n[3] Libro-Autor-Editorial");
        Ex3_Autor autor = new Ex3_Autor("Borges", "Argentina");
        Ex3_Editorial ed = new Ex3_Editorial("Sur", "Av. X 123");
        Ex3_Libro libro = new Ex3_Libro("El Aleph", "978-1-2345-6789-7", autor, ed);
        System.out.println(libro);

        // -----------------------
        // EJERCICIO 4: TarjetaDeCredito <-> Cliente (Asociación bidireccional); TarjetaDeCredito -> Banco (Agregación)
        // -----------------------
        System.out.println("\n[4] TarjetaDeCredito-Cliente-Banco");
        Ex4_Banco banco = new Ex4_Banco("Banco Río", "30-11111111-9");
        Ex4_TarjetaDeCredito tdc = new Ex4_TarjetaDeCredito("4509-1234-5678-9010", "12/28", banco);
        Ex4_Cliente cli4 = new Ex4_Cliente("Luis", "22222333");
        tdc.vincularCliente(cli4); // establece ambos lados
        System.out.println(tdc);
        System.out.println(cli4);

        // -----------------------
        // EJERCICIO 5: Computadora -> PlacaMadre (Composición); Computadora <-> Propietario (Asociación bidireccional)
        // -----------------------
        System.out.println("\n[5] Computadora-PlacaMadre-Propietario");
        Ex5_Propietario prop = new Ex5_Propietario("María", "22333444");
        Ex5_Computadora pc = new Ex5_Computadora("Lenovo", "SN-001", "B550", "AMD");
        pc.setPropietario(prop);
        System.out.println(pc);
        System.out.println(prop);

        // -----------------------
        // EJERCICIO 6: Reserva -> Cliente (Asociación unidireccional); Reserva -> Mesa (Agregación)
        // -----------------------
        System.out.println("\n[6] Reserva-Cliente-Mesa");
        Ex6_Cliente cli6 = new Ex6_Cliente("Pedro", "11-5555-6666");
        Ex6_Mesa mesa = new Ex6_Mesa(12, 4);
        Ex6_Reserva res = new Ex6_Reserva("2025-09-20", "21:30", cli6, mesa);
        System.out.println(res);

        // -----------------------
        // EJERCICIO 7: Vehiculo -> Motor (Agregación); Vehiculo <-> Conductor (Asociación bidireccional)
        // -----------------------
        System.out.println("\n[7] Vehiculo-Motor-Conductor");
        Ex7_Motor motor = new Ex7_Motor("Nafta", "MS-777");
        Ex7_Vehiculo veh = new Ex7_Vehiculo("AB123CD", "Focus");
        veh.setMotor(motor);
        Ex7_Conductor cond = new Ex7_Conductor("Sofía", "LIC-999");
        veh.setConductor(cond);
        System.out.println(veh);
        System.out.println(cond);

        // -----------------------
        // EJERCICIO 8: Documento -> FirmaDigital (Composición); FirmaDigital -> Usuario (Agregación)
        // -----------------------
        System.out.println("\n[8] Documento-FirmaDigital-Usuario");
        Ex8_Usuario usu8 = new Ex8_Usuario("Nico", "nico@mail.com");
        Ex8_Documento doc = new Ex8_Documento("Contrato", "Contenido...");
        doc.firmar("HASH-ABC123", "2025-09-17", usu8); // crea firma (composición) y la asocia al usuario (agregación)
        System.out.println(doc);

        // -----------------------
        // EJERCICIO 9: CitaMedica -> Paciente (Unidireccional); CitaMedica -> Profesional (Unidireccional)
        // -----------------------
        System.out.println("\n[9] CitaMedica-Paciente-Profesional");
        Ex9_Paciente pac = new Ex9_Paciente("Laura", "OSDE");
        Ex9_Profesional prof = new Ex9_Profesional("Dr. House", "Clínica");
        Ex9_CitaMedica cita = new Ex9_CitaMedica("2025-10-01", "08:00", pac, prof);
        System.out.println(cita);

        // -----------------------
        // EJERCICIO 10: CuentaBancaria -> ClaveSeguridad (Composición); CuentaBancaria <-> Titular (Asociación bidireccional)
        // -----------------------
        System.out.println("\n[10] CuentaBancaria-ClaveSeguridad-Titular");
        Ex10_Titular tit10 = new Ex10_Titular("Carla", "30555111");
        Ex10_CuentaBancaria cta = new Ex10_CuentaBancaria("2850590940090418135201", 125000.0, "1234", "2025-09-10");
        cta.setTitular(tit10);
        System.out.println(cta);
        System.out.println(tit10);

        // -----------------------
        // EJERCICIO 11: Cancion -> Artista (Uni); Reproductor.reproducir(Cancion) (Dependencia de uso)
        // -----------------------
        System.out.println("\n[11] Reproductor-Cancion-Artista (dependencia de uso)");
        Ex11_Artista art = new Ex11_Artista("Charly García", "Rock");
        Ex11_Cancion cancion = new Ex11_Cancion("Canción de prueba", art);
        Ex11_Reproductor rep = new Ex11_Reproductor();
        rep.reproducir(cancion);

        // -----------------------
        // EJERCICIO 12: Impuesto -> Contribuyente (Uni); Calculadora.calcular(Impuesto) (Dependencia de uso)
        // -----------------------
        System.out.println("\n[12] Calculadora-Impuesto-Contribuyente (dependencia de uso)");
        Ex12_Contribuyente cont = new Ex12_Contribuyente("Roxana", "27-30123456-7");
        Ex12_Impuesto imp = new Ex12_Impuesto(150000.0, cont);
        Ex12_Calculadora calc = new Ex12_Calculadora();
        calc.calcular(imp);

        // -----------------------
        // EJERCICIO 13: CodigoQR -> Usuario (Uni); GeneradorQR.generar(String, Usuario) (Dependencia de creación)
        // -----------------------
        System.out.println("\n[13] GeneradorQR-Usuario-CodigoQR (dependencia de creación)");
        Ex13_Usuario usu13 = new Ex13_Usuario("Diego", "d@example.com");
        Ex13_GeneradorQR gen = new Ex13_GeneradorQR();
        gen.generar("https://midominio/abc", usu13); // crea internamente CodigoQR y lo usa sin guardarlo
        // -----------------------
        // EJERCICIO 14: Render -> Proyecto (Uni); EditorVideo.exportar(String, Proyecto) (Dependencia de creación)
        // -----------------------
        System.out.println("\n[14] EditorVideo-Proyecto-Render (dependencia de creación)");
        Ex14_Proyecto proy = new Ex14_Proyecto("Demo", 3.5);
        Ex14_EditorVideo editor = new Ex14_EditorVideo();
        editor.exportar("mp4", proy); // crea Render dentro del método

        System.out.println("\n=== FIN ===");
    }

}

/* ===========================================================
 * EJERCICIO 1
 * Pasaporte -> Foto (Composición)
 * Pasaporte <-> Titular (Asociación bidireccional)
 * =========================================================== */
class Ex1_Pasaporte {

    private String numero;
    private String fechaEmision;
    private final Ex1_Foto foto;     // composición: creada dentro del Pasaporte
    private Ex1_Titular titular;     // asociación bidireccional 1-1

    public Ex1_Pasaporte(String numero, String fechaEmision, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Ex1_Foto(imagen, formato); // vida ligada al Pasaporte
    }

    public void setTitular(Ex1_Titular titular) {
        if (this.titular == titular) {
            return;
        }
        this.titular = titular;
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this);
        }
    }

    public Ex1_Titular getTitular() {
        return titular;
    }

    @Override
    public String toString() {
        return "Pasaporte{numero=" + numero + ", fechaEmision=" + fechaEmision
                + ", foto=" + foto
                + ", titular=" + (titular != null ? titular.getNombre() : "-") + "}";
    }
}

class Ex1_Foto {

    private String imagen;   // nombre/ruta de archivo a modo ilustrativo
    private String formato;  // ej: JPG, PNG

    public Ex1_Foto(String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "Foto{imagen=" + imagen + ", formato=" + formato + "}";
    }
}

class Ex1_Titular {

    private String nombre;
    private String dni;
    private Ex1_Pasaporte pasaporte; // lado opuesto de la asociación 1-1

    public Ex1_Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setPasaporte(Ex1_Pasaporte pasaporte) {
        if (this.pasaporte == pasaporte) {
            return;
        }
        this.pasaporte = pasaporte;
        if (pasaporte != null && pasaporte.getTitular() != this) {
            pasaporte.setTitular(this);
        }
    }

    public Ex1_Pasaporte getPasaporte() {
        return pasaporte;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Titular{nombre=" + nombre + ", dni=" + dni
                + ", pasaporte=" + (pasaporte != null ? pasaporte.toString() : "-") + "}";
    }
}

/* ===========================================================
 * EJERCICIO 2
 * Celular -> Bateria (Agregación)
 * Celular <-> Usuario (Asociación bidireccional)
 * =========================================================== */
class Ex2_Celular {

    private String imei;
    private String marca;
    private String modelo;
    private Ex2_Bateria bateria; // agregación
    private Ex2_Usuario usuario;  // asociación bidireccional 1-1

    public Ex2_Celular(String imei, String marca, String modelo) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void setBateria(Ex2_Bateria bateria) {
        this.bateria = bateria;
    }

    public void setUsuario(Ex2_Usuario usuario) {
        if (this.usuario == usuario) {
            return;
        }
        this.usuario = usuario;
        if (usuario != null && usuario.getCelular() != this) {
            usuario.setCelular(this);
        }
    }

    public Ex2_Usuario getUsuario() {
        return usuario;
    }

    @Override
    public String toString() {
        return "Celular{imei=" + imei + ", marca=" + marca + ", modelo=" + modelo
                + ", bateria=" + bateria + ", usuario=" + (usuario != null ? usuario.getNombre() : "-") + "}";
    }
}

class Ex2_Bateria {

    private String modelo;
    private int capacidad; // mAh

    public Ex2_Bateria(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Bateria{modelo=" + modelo + ", capacidad=" + capacidad + "mAh}";
    }
}

class Ex2_Usuario {

    private String nombre;
    private String dni;
    private Ex2_Celular celular; // asociación bidireccional

    public Ex2_Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setCelular(Ex2_Celular celular) {
        if (this.celular == celular) {
            return;
        }
        this.celular = celular;
        if (celular != null && celular.getUsuario() != this) {
            celular.setUsuario(this);
        }
    }

    public Ex2_Celular getCelular() {
        return celular;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Usuario{nombre=" + nombre + ", dni=" + dni + ", celular=" + (celular != null ? celular.toString() : "-") + "}";
    }
}

/* ===========================================================
 * EJERCICIO 3
 * Libro -> Autor (Unidireccional)
 * Libro -> Editorial (Agregación)
 * =========================================================== */
class Ex3_Libro {

    private String titulo;
    private String isbn;
    private Ex3_Autor autor;       // unidireccional
    private Ex3_Editorial editorial; // agregación

    public Ex3_Libro(String titulo, String isbn, Ex3_Autor autor, Ex3_Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{titulo=" + titulo + ", isbn=" + isbn + ", autor=" + autor + ", editorial=" + editorial + "}";
    }
}

class Ex3_Autor {

    private String nombre;
    private String nacionalidad;

    public Ex3_Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return nombre + " (" + nacionalidad + ")";
    }
}

class Ex3_Editorial {

    private String nombre;
    private String direccion;

    public Ex3_Editorial(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return nombre + " [" + direccion + "]";
    }
}

/* ===========================================================
 * EJERCICIO 4
 * TarjetaDeCredito <-> Cliente (Bidireccional)
 * TarjetaDeCredito -> Banco (Agregación)
 * =========================================================== */
class Ex4_TarjetaDeCredito {

    private String numero;
    private String fechaVencimiento;
    private Ex4_Banco banco;         // agregación
    private Ex4_Cliente cliente;     // bidireccional 1-1

    public Ex4_TarjetaDeCredito(String numero, String fechaVencimiento, Ex4_Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }

    public void vincularCliente(Ex4_Cliente cliente) {
        if (this.cliente == cliente) {
            return;
        }
        this.cliente = cliente;
        if (cliente != null && cliente.getTarjeta() != this) {
            cliente.setTarjeta(this);
        }
    }

    public Ex4_Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "Tarjeta{numero=" + numero + ", vence=" + fechaVencimiento + ", banco=" + banco + ", cliente=" + (cliente != null ? cliente.getNombre() : "-") + "}";
    }
}

class Ex4_Cliente {

    private String nombre;
    private String dni;
    private Ex4_TarjetaDeCredito tarjeta;

    public Ex4_Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setTarjeta(Ex4_TarjetaDeCredito tarjeta) {
        if (this.tarjeta == tarjeta) {
            return;
        }
        this.tarjeta = tarjeta;
        if (tarjeta != null && tarjeta.getCliente() != this) {
            tarjeta.vincularCliente(this);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public Ex4_TarjetaDeCredito getTarjeta() {
        return tarjeta;
    }

    @Override
    public String toString() {
        return "Cliente{nombre=" + nombre + ", dni=" + dni + ", tarjeta=" + (tarjeta != null ? tarjeta.toString() : "-") + "}";
    }
}

class Ex4_Banco {

    private String nombre;
    private String cuit;

    public Ex4_Banco(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }

    @Override
    public String toString() {
        return nombre + " (CUIT " + cuit + ")";
    }
}

/* ===========================================================
 * EJERCICIO 5
 * Computadora -> PlacaMadre (Composición)
 * Computadora <-> Propietario (Bidireccional)
 * =========================================================== */
class Ex5_Computadora {

    private String marca;
    private String numeroSerie;
    private final Ex5_PlacaMadre placaMadre; // composición
    private Ex5_Propietario propietario;     // bidireccional

    public Ex5_Computadora(String marca, String numeroSerie, String modeloPM, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new Ex5_PlacaMadre(modeloPM, chipset, this); // creada y ligada al todo
    }

    public void setPropietario(Ex5_Propietario propietario) {
        if (this.propietario == propietario) {
            return;
        }
        this.propietario = propietario;
        if (propietario != null && propietario.getComputadora() != this) {
            propietario.setComputadora(this);
        }
    }

    public Ex5_Propietario getPropietario() {
        return propietario;
    }

    @Override
    public String toString() {
        return "Computadora{marca=" + marca + ", serie=" + numeroSerie + ", placaMadre=" + placaMadre
                + ", propietario=" + (propietario != null ? propietario.getNombre() : "-") + "}";
    }
}

class Ex5_PlacaMadre {

    private String modelo;
    private String chipset;
    private final Ex5_Computadora computadora; // referencia al todo

    Ex5_PlacaMadre(String modelo, String chipset, Ex5_Computadora computadora) {
        this.modelo = modelo;
        this.chipset = chipset;
        this.computadora = computadora;
    }

    @Override
    public String toString() {
        return "PlacaMadre{modelo=" + modelo + ", chipset=" + chipset + "}";
    }
}

class Ex5_Propietario {

    private String nombre;
    private String dni;
    private Ex5_Computadora computadora;

    public Ex5_Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setComputadora(Ex5_Computadora computadora) {
        if (this.computadora == computadora) {
            return;
        }
        this.computadora = computadora;
        if (computadora != null && computadora.getPropietario() != this) {
            computadora.setPropietario(this);
        }
    }

    public Ex5_Computadora getComputadora() {
        return computadora;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Propietario{nombre=" + nombre + ", dni=" + dni + ", computadora=" + (computadora != null ? computadora.toString() : "-") + "}";
    }
}

/* ===========================================================
 * EJERCICIO 6
 * Reserva -> Cliente (Uni)
 * Reserva -> Mesa (Agregación)
 * =========================================================== */
class Ex6_Reserva {

    private String fecha;
    private String hora;
    private Ex6_Cliente cliente; // unidireccional
    private Ex6_Mesa mesa;       // agregación

    public Ex6_Reserva(String fecha, String hora, Ex6_Cliente cliente, Ex6_Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mesa = mesa;
    }

    @Override
    public String toString() {
        return "Reserva{" + fecha + " " + hora + ", cliente=" + cliente + ", mesa=" + mesa + "}";
    }
}

class Ex6_Cliente {

    private String nombre;
    private String telefono;

    public Ex6_Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return nombre + " (tel: " + telefono + ")";
    }
}

class Ex6_Mesa {

    private int numero;
    private int capacidad;

    public Ex6_Mesa(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Mesa " + numero + " (cap=" + capacidad + ")";
    }
}

/* ===========================================================
 * EJERCICIO 7
 * Vehiculo -> Motor (Agregación)
 * Vehiculo <-> Conductor (Bidireccional)
 * =========================================================== */
class Ex7_Vehiculo {

    private String patente;
    private String modelo;
    private Ex7_Motor motor;           // agregación
    private Ex7_Conductor conductor;   // bidireccional 1-1

    public Ex7_Vehiculo(String patente, String modelo) {
        this.patente = patente;
        this.modelo = modelo;
    }

    public void setMotor(Ex7_Motor motor) {
        this.motor = motor;
    }

    public void setConductor(Ex7_Conductor conductor) {
        if (this.conductor == conductor) {
            return;
        }
        this.conductor = conductor;
        if (conductor != null && conductor.getVehiculo() != this) {
            conductor.setVehiculo(this);
        }
    }

    public Ex7_Conductor getConductor() {
        return conductor;
    }

    @Override
    public String toString() {
        return "Vehiculo{patente=" + patente + ", modelo=" + modelo + ", motor=" + motor + ", conductor=" + (conductor != null ? conductor.getNombre() : "-") + "}";
    }
}

class Ex7_Motor {

    private String tipo;
    private String numeroSerie;

    public Ex7_Motor(String tipo, String numeroSerie) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }

    @Override
    public String toString() {
        return "Motor{tipo=" + tipo + ", nSerie=" + numeroSerie + "}";
    }
}

class Ex7_Conductor {

    private String nombre;
    private String licencia;
    private Ex7_Vehiculo vehiculo;

    public Ex7_Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public void setVehiculo(Ex7_Vehiculo vehiculo) {
        if (this.vehiculo == vehiculo) {
            return;
        }
        this.vehiculo = vehiculo;
        if (vehiculo != null && vehiculo.getConductor() != this) {
            vehiculo.setConductor(this);
        }
    }

    public Ex7_Vehiculo getVehiculo() {
        return vehiculo;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Conductor{nombre=" + nombre + ", licencia=" + licencia + ", vehiculo=" + (vehiculo != null ? vehiculo.toString() : "-") + "}";
    }
}

/* ===========================================================
 * EJERCICIO 8
 * Documento -> FirmaDigital (Composición)
 * FirmaDigital -> Usuario (Agregación)
 * =========================================================== */
class Ex8_Documento {

    private String titulo;
    private String contenido;
    private Ex8_FirmaDigital firma; // composición (creada desde Documento)

    public Ex8_Documento(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
    }

    public void firmar(String hash, String fecha, Ex8_Usuario usuario) {
        this.firma = new Ex8_FirmaDigital(hash, fecha, usuario); // creación interna
    }

    @Override
    public String toString() {
        return "Documento{titulo=" + titulo + ", firma=" + firma + "}";
    }
}

class Ex8_FirmaDigital {

    private String codigoHash;
    private String fecha;
    private Ex8_Usuario usuario; // agregación

    public Ex8_FirmaDigital(String codigoHash, String fecha, Ex8_Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Firma{hash=" + codigoHash + ", fecha=" + fecha + ", usuario=" + usuario + "}";
    }
}

class Ex8_Usuario {

    private String nombre;
    private String email;

    public Ex8_Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public String toString() {
        return nombre + " <" + email + ">";
    }
}

/* ===========================================================
 * EJERCICIO 9
 * CitaMedica -> Paciente (Uni)
 * CitaMedica -> Profesional (Uni)
 * =========================================================== */
class Ex9_CitaMedica {

    private String fecha;
    private String hora;
    private Ex9_Paciente paciente;
    private Ex9_Profesional profesional;

    public Ex9_CitaMedica(String fecha, String hora, Ex9_Paciente paciente, Ex9_Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.profesional = profesional;
    }

    @Override
    public String toString() {
        return "Cita{" + fecha + " " + hora + ", paciente=" + paciente + ", profesional=" + profesional + "}";
    }
}

class Ex9_Paciente {

    private String nombre;
    private String obraSocial;

    public Ex9_Paciente(String nombre, String obraSocial) {
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }

    @Override
    public String toString() {
        return nombre + " (OS: " + obraSocial + ")";
    }
}

class Ex9_Profesional {

    private String nombre;
    private String especialidad;

    public Ex9_Profesional(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return nombre + " [" + especialidad + "]";
    }
}

/* ===========================================================
 * EJERCICIO 10
 * CuentaBancaria -> ClaveSeguridad (Composición)
 * CuentaBancaria <-> Titular (Bidireccional)
 * =========================================================== */
class Ex10_CuentaBancaria {

    private String cbu;
    private double saldo;
    private final Ex10_ClaveSeguridad clave; // composición
    private Ex10_Titular titular;            // bidireccional

    public Ex10_CuentaBancaria(String cbu, double saldo, String codigo, String ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new Ex10_ClaveSeguridad(codigo, ultimaModificacion);
    }

    public void setTitular(Ex10_Titular titular) {
        if (this.titular == titular) {
            return;
        }
        this.titular = titular;
        if (titular != null && titular.getCuenta() != this) {
            titular.setCuenta(this);
        }
    }

    public Ex10_Titular getTitular() {
        return titular;
    }

    @Override
    public String toString() {
        return "Cuenta{CBU=" + cbu + ", saldo=" + saldo + ", clave=" + clave + ", titular=" + (titular != null ? titular.getNombre() : "-") + "}";
    }
}

class Ex10_ClaveSeguridad {

    private String codigo;
    private String ultimaModificacion;

    public Ex10_ClaveSeguridad(String codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }

    @Override
    public String toString() {
        return "Clave{codigo=" + codigo + ", ultimaMod=" + ultimaModificacion + "}";
    }
}

class Ex10_Titular {

    private String nombre;
    private String dni;
    private Ex10_CuentaBancaria cuenta;

    public Ex10_Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setCuenta(Ex10_CuentaBancaria cuenta) {
        if (this.cuenta == cuenta) {
            return;
        }
        this.cuenta = cuenta;
        if (cuenta != null && cuenta.getTitular() != this) {
            cuenta.setTitular(this);
        }
    }

    public Ex10_CuentaBancaria getCuenta() {
        return cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Titular{nombre=" + nombre + ", dni=" + dni + ", cuenta=" + (cuenta != null ? cuenta.toString() : "-") + "}";
    }
}

/* ===========================================================
 * EJERCICIO 11 (Dependencia de uso)
 * Cancion -> Artista (Uni)
 * Reproductor.reproducir(Cancion)
 * =========================================================== */
class Ex11_Reproductor {

    public void reproducir(Ex11_Cancion cancion) {
        System.out.println("Reproduciendo: " + cancion);
    }
}

class Ex11_Cancion {

    private String titulo;
    private Ex11_Artista artista; // unidireccional

    public Ex11_Cancion(String titulo, Ex11_Artista artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    @Override
    public String toString() {
        return titulo + " - " + artista;
    }
}

class Ex11_Artista {

    private String nombre;
    private String genero;

    public Ex11_Artista(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return nombre + " (" + genero + ")";
    }
}

/* ===========================================================
 * EJERCICIO 12 (Dependencia de uso)
 * Impuesto -> Contribuyente (Uni)
 * Calculadora.calcular(Impuesto)
 * =========================================================== */
class Ex12_Calculadora {

    public void calcular(Ex12_Impuesto impuesto) {
        System.out.println("Calculando impuesto de " + impuesto.getContribuyente() + " por monto " + impuesto.getMonto());
    }
}

class Ex12_Impuesto {

    private double monto;
    private Ex12_Contribuyente contribuyente;

    public Ex12_Impuesto(double monto, Ex12_Contribuyente contribuyente) {
        this.monto = monto;
        this.contribuyente = contribuyente;
    }

    public double getMonto() {
        return monto;
    }

    public Ex12_Contribuyente getContribuyente() {
        return contribuyente;
    }
}

class Ex12_Contribuyente {

    private String nombre;
    private String cuil;

    public Ex12_Contribuyente(String nombre, String cuil) {
        this.nombre = nombre;
        this.cuil = cuil;
    }

    @Override
    public String toString() {
        return nombre + " (CUIL " + cuil + ")";
    }
}

/* ===========================================================
 * EJERCICIO 13 (Dependencia de creación)
 * CodigoQR -> Usuario (Uni)
 * GeneradorQR.generar(String, Usuario)
 * =========================================================== */
class Ex13_GeneradorQR {

    public void generar(String valor, Ex13_Usuario usuario) {
        // Dependencia de creación: se crea dentro del método y no se guarda como atributo
        Ex13_CodigoQR qr = new Ex13_CodigoQR(valor, usuario);
        System.out.println("QR generado: " + qr);
    }
}

class Ex13_CodigoQR {

    private String valor;
    private Ex13_Usuario usuario; // unidireccional

    public Ex13_CodigoQR(String valor, Ex13_Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "CodigoQR{valor='" + valor + "', usuario=" + usuario + "}";
    }
}

class Ex13_Usuario {

    private String nombre;
    private String email;

    public Ex13_Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public String toString() {
        return nombre + " <" + email + ">";
    }
}

/* ===========================================================
 * EJERCICIO 14 (Dependencia de creación)
 * Render -> Proyecto (Uni)
 * EditorVideo.exportar(String, Proyecto)
 * =========================================================== */
class Ex14_EditorVideo {

    public void exportar(String formato, Ex14_Proyecto proyecto) {
        Ex14_Render render = new Ex14_Render(formato, proyecto); // creado dentro (no se conserva)
        System.out.println("Export listo: " + render);
    }
}

class Ex14_Render {

    private String formato;
    private Ex14_Proyecto proyecto; // unidireccional

    public Ex14_Render(String formato, Ex14_Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }

    @Override
    public String toString() {
        return "Render{formato=" + formato + ", proyecto=" + proyecto + "}";
    }
}

class Ex14_Proyecto {

    private String nombre;
    private double duracionMin;

    public Ex14_Proyecto(String nombre, double duracionMin) {
        this.nombre = nombre;
        this.duracionMin = duracionMin;
    }

    @Override
    public String toString() {
        return nombre + " (" + duracionMin + " min)";
    }
}
