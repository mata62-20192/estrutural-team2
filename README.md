## Decorator (pacote `ufba.decorator`)

O código representa uma biblioteca de gerenciamento de usuários (pacote `ufba.decorator.lib`) e um sistema que usa essa biblioteca (pacote `ufba.decorator.app`). Cada usuário possui username, email e nome completo.

A classe `UsuarioDAO` é responsável por gravar os usuários em algum sistema de armazenamento. `UsuarioDAO` possui operações para apagar todos os usuários, inserir um usuário ou consultar um usuário a partir de seu username. Existem duas subclasses de `UsuarioDAO`: `UsuarioMemoriaDAO` grava os usuários na memória volátil do sistema, e `UsuarioArquivoDAO` grava os usuários em um arquivo.

Crie dois decorators para `UsuarioDAO`:

- `UsuarioDAOAutenticacaoDecorator` é criado com um IP, e só permite executar as operações de um `UsuarioDAO` se o IP for de um administrador. Use `UsuarioUtils.ehAdministrador()`.
- `UsuarioDAOFiltroDecorator` filtra os caracteres do usuário antes de executar as operações de `UsuarioDAO`, removendo vírgulas (caractere especial). Use `UsuarioUtils.filtraEntrada()`.

No método `main` da classe `Main`, crie um `UsuarioDAO` decorado com ambos os decorators e execute algumas operações como administrador.

**Não modifique** nenhum arquivo do pacote `ufba.decorator.lib`.

## Composite (pacote `ufba.composite`)

No código, os conceitos `Pessoa` e `Equipe` são separados; por isso, ao calcular o custo de um projeto, **diferenciam-se dois casos**: há um método para calcular o custo de projetos de uma pessoa só, e outro método para projetos de equipes de pessoas.

Inicialmente, equipes continham apenas pessoas, mas com o tempo os projetos ficaram tão grandes que há equipes de equipes. Por isso, `Equipe` possui **dois métodos**: `addPessoa` e `addEquipe`.

Os dois problemas em negrito contribuem para tornar o código difícil de manter. Use o padrão de projeto `Composite` para resolver os dois problemas. Na sua solução, deve existir uma classe chamada `Membro`, que engloba os conceitos de pessoa, programador, designer, equipe.

OBS.: a coleção usada na classe `Equipe` deve ser representada por um atributo do tipo `ArrayList` (se o tipo for `Collection`, a ferramenta de detecção de padrões não detecta o padrão corretamente).
