package lista01.q02;

public class Banco {
        Cliente[] clientes = new Cliente[2];

        public Cliente[] cadastrarClientes() {
            Cliente c1 = new Cliente("Alan turing", "122.872,165.44", 1500, 3323);
            Cliente c2 = new Cliente("Ada Love", "123.543.232-23", 3232);
            clientes[0] = c1;
            clientes[1] = c2;

            return clientes;
        }

    public void operacoes(){
        clientes[0].saque(200);
        System.out.println(clientes[0].getSaldo());
        clientes[0].deposito(400);
        System.out.println(clientes[0].getSaldo());


        clientes[1].deposito(1000);
        System.out.println(clientes[1].getSaldo());
        clientes[1].saque(400);
        System.out.println(clientes[1].getSaldo());

    }
    public static void main(String[] args) {
        Banco banco = new Banco();

        banco.cadastrarClientes();
        banco.operacoes();
    }

}
