create table Pessoa(

     idpessoa serial not null,
	 nome varchar(100) not null,
	 cpf varchar(14) not null,
	 data_nascimento date not null,
	 primary key(idpessoa)

);

create table Pet(

    idpet serial not null,
	nome varchar(100) not null,
	especie varchar(50) not null,
	raca varchar(50) not null,
	porte varchar(50) not null,
	cor varchar(50) not null,
	data_nascimento date not null,
	idpessoa int references Pessoa(idpessoa)
	
);

    

