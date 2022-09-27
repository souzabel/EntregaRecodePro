USE agencia_vousuave;

INSERT INTO tipos_passagem (passagem_onibus,passagem_aviao,passagem_cruzeiro)
    VALUES
        (TRUE,FALSE,FALSE),
        (FALSE,TRUE,FALSE),
        (FALSE,FALSE,TRUE);
        
INSERT INTO Passagem (origem,destino,id_tp,caminho,descricao,desc_preco,preco_antigo,preco_atual)
    VALUES
        ("Rio de Janeiro-RJ","Salvador-",2,"imagens/Salvador.jpg","Agende sua viagem para Salvador agora mesmo","Passagens a partir de","639","525"),
        ("Rio de Janeiro-RJ","Maceió",2,"imagens/Maceió.jpg","Agende sua viagem para Maceió agora mesmo","Passagens a partir de","639","525"),
        ("Rio de Janeiro-RJ","Fortaleza",2,"imagens/Fortaleza.jpg","Agende sua viagem para Fortaleza agora mesmo","Passagens a partir de","639","525"),
        ("Rio de Janeiro-RJ","Foz do Iguaçu",2,"imagens/FozDoIguaçu.jpg","Agende sua viagem para Foz do Iguaçu agora mesmo","Passagens a partir de","639","525"),
        ("Rio de Janeiro-RJ","Recife",2,"imagens/Recife.jpg","Agende sua viagem para Recife agora mesmo","Passagens a partir de","639","525"),
        ("Rio de Janeiro-RJ","São Paulo",2,"imagens/SãoPaulo.jpg","Agende sua viagem para São Paulo agora mesmo","Passagens a partir de","639","525"),
        ("Rio de Janeiro-RJ","Belo Horizonte",1,"imagens/BeloHorizonte.jpg","Agende sua viagem para Belo Horizonte agora mesmo","Passagens a partir de","639","525"),
        ("Rio de Janeiro-RJ","Vila Velha",1,"imagens/VilaVelha.jpg","Agende sua viagem para Vila Velha agora mesmo","Passagens a partir de","639","525"),
        ("Rio de Janeiro-RJ","Natal",1,"imagens/Natal.jpg","Agende sua viagem para Natal agora mesmo","Passagens a partir de","639","525"),
        ("Rio de Janeiro-RJ","Curitiba",1,"imagens/Curitiba.jpg","Agende sua viagem para Curitiba agora mesmo","Passagens a partir de","639","525"),
        ("Rio de Janeiro-RJ","Manaus",1,"imagens/Manaus.jpg","Agende sua viagem para Manaus agora mesmo","Passagens a partir de","639","525"),
        ("Rio de Janeiro-RJ","Campinas",1,"imagens/Campinas.jpg","Agende sua viagem para Campinas agora mesmo","Passagens a partir de","639","525"),
        ("Rio de Janeiro(RJ)","Rio de Janeiro(RJ)",3,"imagens/cruzeiro1.jpg","Primeiro hóspede a partir de","Em até 12x sem juros de","1539","128,25"),
        ("Santos(SP)","Santos(SP)",3,"imagens/cruzeiro2.jpg","Primeiro hóspede a partir de","Em até 12x sem juros de","1559","129,92"),
        ("Rio de Janeiro(RJ)","Itajaí(BC)",3,"imagens/cruzeiro3.jpg","Primeiro hóspede a partir de","Em até 12x sem juros de","1835 ","153,25");

        
INSERT INTO Hotel (nome_hotel)
    VALUES
		("Deluxe"),
		("Medieval"),
		("Top 1"),
		("Copacabana Palace"),
        
INSERT INTO Pacote(destino,diaria,caminho,preco,id_hotel,guia_turismo,internacional)
	VALUES
		("Gramado",3,"imagens/Gramado.jpg",1879,2,TRUE,FALSE),
		("Pernambuco",5,"imagens/Pernambuco1.jpg",1879,3,TRUE,FALSE),
		("Bonito",4,"imagens/Bonito1.png",1879,1,TRUE,FALSE),
		("Tóquio",5,"imagens/Tóquio.jpg",2159,4,TRUE,TRUE),
		("Bali",3,"imagens/Bali.jpg",2159,5,TRUE,TRUE),
		("Barcelona",4,"imagens/Barcelona.jpg",2159,1,TRUE,TRUE),
		("Disney",4,"imagens/Disney.jpg",2159,2,TRUE,TRUE),
		("Buenos Aires",5,"imagens/BuenosAires.jpg",2159,4,TRUE,TRUE),
		("Roma",3,"imagens/Roma.jpg",2159,5,TRUE,TRUE);
                
