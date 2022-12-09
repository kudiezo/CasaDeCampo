[ENUNCIADO]
 
Numa casa de campo existem vários animais. 
Alguns animais são domésticos: cães, gatos e pássaros (canários, etc.). Os donos acreditam em 
dar liberdade completa aos animais, o que causa alguns problemas de interacção nem sempre 
do agrado geral. 
Outros animais, embora vivam na casa ou perto dela, não são oficialmente considerados 
animais domésticos: ratos, cobras, insectos, aranhas, etc. Estes animais também se deslocam 
pela propriedade, livre, mas nem sempre impunemente. 
Todos os animais podem correr (e os pássaros voar), consumindo energia para o efeito. 
Quando a energia termina, não podem correr mais e têm de dormir para recuperar forças. 
Além do repouso, os cães e os gatos podem recuperar energia comendo ratos. Um rato 
devorado perde, claro está, toda a energia (é transferida para o predador). Os gatos, por 
serem ágeis, também conseguem comer pássaros (com efeitos muito semelhantes aos da 
relação gato-rato). 
Por vezes, os cães perdem a paciência e atacam os gatos. Ambos perdem energia no processo. 
Modele os conceitos "cão", "gato", "pássaro" e "rato". Além da energia, os cães e os gatos têm 
nome (uma cadeia de caracteres). 
Considere que a energia disponível inicialmente para os cães, gatos, pássaros e ratos é, 
respectivamente, de 1000, 500, 20 e 50 unidades. Quando os animais correm, gastam, 
respectivamente, 50, 25, 5 e 2 unidades. Um pássaro, quando voa, gasta apenas 2 unidades. 
Um cão que ataque um gato gasta 100 unidades e faz com que o gato perca 25. 
Para um predador comer uma presa tem de a perseguir para a capturar (podendo a 
perseguição ser ou não bem-sucedida). Um cão consegue capturar um rato em cada 25 
tentativas. Para os gatos, o rácio é 1 em 5 (ratos) e 1 em 10 (pássaros). A perseguição consome 
a mesma energia que correr (para cada interveniente), mas a presa recebe um bónus de 5 
unidades se escapar. Se a presa estiver a dormir, é apanhada 1 em cada 2 tentativas. 
Construa uma aplicação onde existem 2 cães ("Piloto" e "Átila"), 3 gatos ("Tareco", "Pantufa" e 
"Kitty"), 20 pássaros e 50 ratos (os pássaros e ratos podem ser organizados em arrays). 
Neste cenário, os gatos correm, perseguem pássaros e ratos e são atacados pelos cães, que 
também podem correr e perseguir e comer ratos. Os animais dormem automaticamente se 
ficam sem energia (excepto quando são devorados: nesse caso devem ser considerados 
mortos). 
Apresente o estado inicial dos animais (métodos toString) e o estado final (depois de algumas 
interacções).