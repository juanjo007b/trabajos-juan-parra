import java.util.*;

public class Biblioteca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Lista fija pero funcional
        List<Libro> catalogo = Arrays.asList(new Libro("Java"), new Libro("100 años de soledad"), new Libro("piense y hagase rico"));

        System.out.print("Nombre: ");
        Usuario user = new Usuario(sc.nextLine());

        while (true) {
            System.out.print("\n1.Ver 2.Pedir 3.Devolver 4.Salir: ");
            int op = sc.nextInt(); sc.nextLine();

            if (op == 4) break;
            if (op == 1) catalogo.forEach(System.out::println);
            else {
                System.out.print("Título: ");
                String t = sc.nextLine();
                // Buscamos el libro (si no existe, 'l' será null)
                Libro l = catalogo.stream().filter(x -> x.titulo.equalsIgnoreCase(t)).findFirst().orElse(null);

                if (l == null) System.out.println("No encontrado.");
                else if (op == 2) user.tomar(l);
                else if (op == 3) user.soltar(l);
            }
        }
        System.out.println("¡Adiós, " + user.nombre + "!");
    }
}