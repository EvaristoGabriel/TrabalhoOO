package brufjfdcc025.trabalhooo.control;

import brufjfdcc025.trabalhooo.model.Cliente;
import brufjfdcc025.trabalhooo.model.Endereco;
import brufjfdcc025.trabalhooo.model.PessoaFisica;
import brufjfdcc025.trabalhooo.model.PessoaJuridica;
import java.io.BufferedReader;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Arquivo {
    public static List<Cliente> lerArquivo(String caminho) throws FileNotFoundException{
        List<Cliente> clientes = new ArrayList();
        List<String> strings = new ArrayList();
        try {
            FileReader reader = new FileReader(caminho);  
            BufferedReader buffer = new BufferedReader(reader);
            String linha = "";
            
            while ((linha = buffer.readLine()) != null ) {
                if(linha != null && !linha.isEmpty())
                    strings.add(linha);
            }
            reader.close();
            buffer.close();
            for(String s : strings){
                String[] user = s.split(";");
                if(user[0].equals("F")){
                    PessoaFisica p = new PessoaFisica(user[4], user[6], user[7], user[5], user[3], user[1], user[2]);
                    p.getConta().setNumero(user[8]);
                    p.getConta().setSaldo(Float.parseFloat(user[9]));
                    Endereco end = new Endereco(user[10], user[11], user[12], user[13], Integer.parseInt(user[14]), user[15]);
                    p.setEndereco(end);
                    clientes.add(p);
                }
                else{
                    System.out.println(s);
                    PessoaJuridica p = new PessoaJuridica(user[4], user[3], user[1], user[2]);
                    p.getConta().setNumero(user[5]);
                    p.getConta().setSaldo(Float.parseFloat(user[6]));
                    //;jUIZ sw for\;tres;Centro;369784;0;1
                    Endereco end = new Endereco(user[7], user[8], user[9], user[10], Integer.parseInt(user[11]), user[12]);
                    p.setEndereco(end);
                    clientes.add(p);
                }
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }finally{
            return clientes;
        }
        
//        StringBuilder conteudo = new StringBuilder();
//        
//        File arquivo = new File(caminho);
//        
//        Scanner leitor = new Scanner(arquivo);
//        
//        while (leitor.hasNextLine()) {
//            conteudo.append(leitor.nextLine()).append("\n");
//        }
//        
//        return conteudo.toString();
    }
    
    public static void escreverArquivo(String caminho, List<Cliente> clientes) throws IOException{
        
        try {
            FileWriter writer = new FileWriter(caminho);
            PrintWriter print = new PrintWriter(writer);

            for(Cliente c : clientes){
                if(c.getTipo().equals("F")){
                    PessoaFisica p = (PessoaFisica) c;
                    print.println(p.toString());
                }
                else{
                    PessoaJuridica p = (PessoaJuridica) c;
                    print.println(p.toString());
                }
            }
            print.flush();
            print.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
//        FileWriter fwArquivo;
//        BufferedWriter bwArquivo;
//
//        File arquivo = new File(caminho);
//            
//        fwArquivo = new FileWriter(arquivo,false);
//        bwArquivo = new BufferedWriter(fwArquivo);
//            
//        bwArquivo.write(conteudo);
//            
//        bwArquivo.close();
//        fwArquivo.close();
            
    }
}
