package org.formula;

public class Main {
    public static void main(String[] args) throws Exception {

        Endereco[] enderecos = new Endereco[0];
        Endereco enderecoCep = null;

        if (args.length > 0) {
            String str = args[0];

            switch (str) {
                case "cep":
                    enderecoCep = ServicoDeCep.buscaEnderecoPeloCep(args[1]);
                    break;
                case "other":
                    enderecos = ServicoDeCep.buscaEnderecoPeloUFCidadeLogradouro(args[1], args[2], args[3]);
                    ;
                    break;
            }

        }
////        System.out.print("Informe seu CEP: ");
////        String cep = new Scanner(System.in).nextLine();
//        String cep = "88337120";
//        Endereco enderecoCep = ServicoDeCep.buscaEnderecoPeloCep(cep);
//        System.out.println("");
//        System.out.println("Logradouro: " + enderecoCep.getLogradouro());
//        System.out.println("Bairro: " + enderecoCep.getBairro());
//        System.out.println("Localidade: " + enderecoCep.getLocalidade());
//        System.out.println("Estado: " + enderecoCep.getUf());
//        System.out.println("CEP: " + enderecoCep.getCep());
//        System.out.println("--------------------------------");




//        System.out.print("Informe seu CEP: ");
//        String cep = new Scanner(System.in).nextLine();
//        Endereco[] enderecos = ServicoDeCep.buscaEnderecoPeloCep(cep);


//        System.out.print("Informe seu UF: ");
//        String uf = new Scanner(System.in).nextLine();
//        System.out.print("Informe seu Cidade: ");
//        String cidade = new Scanner(System.in).nextLine();
//        System.out.print("Informe seu Logradouro: ");
//        String logradouro = new Scanner(System.in).nextLine();

//        String uf = "SC";
//        String cidade = "Balneario";
//        String logradouro = "Jaime";
//
//
//
//        enderecos = ServicoDeCep.buscaEnderecoPeloUFCidadeLogradouro(uf,cidade,logradouro);

        if (enderecos.length > 1) {
            for (Endereco endrecoArray : enderecos) {
                System.out.println("");
                System.out.println("Logradouro: " + endrecoArray.getLogradouro());
                System.out.println("Bairro: " + endrecoArray.getBairro());
                System.out.println("Localidade: " + endrecoArray.getLocalidade());
                System.out.println("Estado: " + endrecoArray.getUf());
                System.out.println("CEP: " + endrecoArray.getCep());
                System.out.println("--------------------------------");
            }
        }else{
            System.out.println("");
            System.out.println("Logradouro: " + enderecoCep.getLogradouro());
            System.out.println("Bairro: " + enderecoCep.getBairro());
            System.out.println("Localidade: " + enderecoCep.getLocalidade());
            System.out.println("Estado: " + enderecoCep.getUf());
            System.out.println("CEP: " + enderecoCep.getCep());
            System.out.println("--------------------------------");

        }








    }
}
