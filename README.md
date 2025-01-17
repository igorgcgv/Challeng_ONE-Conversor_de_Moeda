##Objetivo

Criar um Conversor de Moedas que permita a interação textual com os usuários por meio do console, oferecendo pelo menos seis opções diferentes de conversão de moedas. As taxas de conversão serão obtidas dinamicamente de uma API, garantindo que os dados sejam precisos e atualizados em tempo real para uma experiência mais eficaz.

Etapas do Projeto

Configuração do Ambiente Java: Configurar o ambiente de desenvolvimento para trabalhar com Java.

Criação do Projeto: Iniciar um novo projeto Java para o conversor de moedas.

Consumo da API: Integrar uma API para obter as taxas de câmbio em tempo real.

Análise da Resposta JSON: Processar e analisar a resposta da API em formato JSON.

Filtro de Moedas: Filtrar as moedas necessárias utilizando o código de moeda (Currency Code) presente na resposta JSON.

Exibição dos Resultados: Mostrar os resultados das conversões para os usuários no console.

Códigos das Moedas Utilizadas:

ARS - Peso Argentino

BOB - Boliviano

BRL - Real Brasileiro

CLP - Peso Chileno

COP - Peso Colombiano

USD - Dólar Americano

Recomendações Técnicas:

Gestão de Conexão HTTP: Utilize uma classe separada para lidar com a lógica de conexão HTTP.

Encapsulamento de Configurações Sensíveis: Armazene informações sensíveis, como a chave da API, em variáveis de ambiente ou arquivos de configuração para maior segurança.

Interação com o Usuário:

O programa apresentará um menu interativo no console, onde o usuário poderá selecionar a moeda desejada para conversão e visualizar os resultados.

