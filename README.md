# boot-front

### 1. SOBRE O AMBIENTE DE QUEM FAZ BUILD E DEPLOY ###
É necessário que a máquina tenha instalado no mínimo:
- Docker
- Ansible
- Maven

O primeiro passo é buildar o projeto com o maven para que ele crie a imagem docker na máquina que irá fazer o deploy.

Para fazer o deploy, basta rodar o arquivo deploy.sh que está na raiz do projeto. 
É necessário editar o arquivo deploy.sh, adicionando o caminho do arquivo .pem para se conectar na máquina EC2 na amazon. 

Na raiz deste projeto existe um arquivo em ansible/hosts que carrega as configurações de IP e usuário da máquina EC2, portanto é necessário editar este arquivo com as informações corretas.


### 2. SOBRE O AMBIENTE DE DESENVONVIMENTO ###
O desenvolvedor não precisa executar o docker para testar a aplicação. 
Também não precisa ter nem o docker nem o ansible instalados para trabalhar.
Este projeto é um projeto spring-boot e, ao ser executado, o único requisito é passar como argumento adicional o caminho do arquivo de configuração com o clientId e o accessToken da pier. Este arquivo não está versionado por motivos de segurança e deve ser criado manualmente.
Caso o desenvolvedor utilize a IDE Eclipse, basta ir em Run Configurations e adicionar o seguinte parametro nas configurações de execução da aplicação java:

--spring.config.location=[MEU_DIRETORIO]/[MEU_ARQUIVO].properties
