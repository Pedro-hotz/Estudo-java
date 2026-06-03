# === G2 prog 3 === 


# Array # 

+ A declação de um array é: 
    tipo[] nome = new tipo[tamanho] 


+ Preencher um array: 
    for(int i = 0; i < tam.length; i++) { 
        num[i] = Scanner.nextInt();
    }


# Manipulação de String #


    - toLowerCase()                  => Tudo miúsculo 

    - toUpperCase()                  => Tudo maiúsculo  

    - XXX.length()                   => Conta a quantidade de caracteres

    - indexOf('a')                   => Retorna a posição da primeira o ocorência, se não encontra, retorna -1  

    - lastIndexOf()                  => Mesma coisa que indexOf, só que de começa do final 

    - charAt(2)                      => Retorna o caracter na posição do indice passado

    - XY.compareTo(XXX)              => Usado para comparação. 0 para iguais, -1 se vier antes, positivo vem depois 

    - XX.substring(init, end)        => Recorta a string e retorna uma nova 


+ Para acessar o último caracter da String
    chatAt(texto.length() - 1 ) // vai passar último número como índice 


# Estruturas de repetição # 

- do while => Garante que o código seja executado pelo menos uma vez

- forEach 

    String[] nome = { "Ana", "Paula"}; 
    for( String nome: nomes){}


- Palavras de controle 
    Break;  // Sai do loop 

    Continue;   // Pula um loop 



# POO # 

+ 1) Relacionamentos entre classes 

    - Assosiação                                  => Um objeto de uma classe é referênciado como atributo de outra (tipo chave estrangeira ) 

    - Agregação                                   => É instânciado fora da classe passado via constructor ou setters 

    - Composição                                  => É instanciado dentro do constructor ou pelo metódo do objeto 

    - Generalização / Especialização ( Herança )  => Extends 


+ 2)  Herança 

    - SuperClasse => Classe mais geral, define comportamento e estado comúm 

    - SupClasse => Herda da SuperClasse e pode adicionar seus atributos, metódos e manipular os estados herdados


    Ex de Herança com "extends"

        // SuperClasse 
        class Pessoa {
            String nome; 

            public Pessoa(String nome) {
                this.nome = nome;
            }
        }

        SubClasse 
        class PessoaFisica extends Pessoa {
            String cpf; 
        }


+ 3) Polimorfismo 

    É sobre escrever um metódo que vem SuperClasse usando "@Override"

    Ex. 

        // SuperClasse 
        Class animal{

            public void som(){
                System.out.print("Animal faz barulho")
            }
        }

        // SubClasse 
        public Cachorro extends animal {
            @Override
            public void som(){ 
                System.out.print("au au!")
            }
        }

+ Encapsulamento 

    - Protegenos dados fazendo ser acessados apenas por gets e sets

         private String nome;
         public String getNome(){ return nome; }
         public void setNome(String nome){ this.nome = nome; }


# Swing # 

- Para criar uma janela, deve se estender a classe Jframe. Representa a janela principal do aplicativo 

+ Components 
    
    + Jpanel => container generico e leve 

    + Jlabel => Exibir icones ou textos que o users no pode editar 

    + JTextField => input Text

    + JPasswordField => input senha 

    + JRadionButton => unica opção 

    + JCheckBox => zero ou mais opç~çoes 

    + ButtonGroup => compenente lógico, agrupa instancias de JRadioButton 

    + Jbutton => dispara ação sempre que clicado 

    + JComboBox => Dropdow que permite selecionar usuários em uma lista 


# MVC # 

- Controle => coneta o view com o model | Caso de Uso 

- Vizualizacao => interface gráfica 

- Modelo => Conexão com o DAO, metodos | Classes   


# Java bens # 

Constructor, setts and gets, atributos privados.





