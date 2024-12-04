create database Pizzaria;
drop database Pizzaria ;
use Pizzaria;


create table Clientes(
Id_Cliente int primary key auto_increment,
Nome_Cliente varchar (150) not null,
Telefone_Cliente varchar(30) not null,
Endereco_Cliente varchar(300) not null
);

create table Produtos(
Id_Produtos int primary key auto_increment,
Nome_Produto varchar (150) not null,
Preco_Produto double (9,2) not null,
Categoria varchar (30) not null
);

create table Pedidos(
Id_Pedido int primary key auto_increment,
Cliente_id int not null,
Forma_De_Pagamento varchar (10) not null,
Data_E_Hora_Pedido datetime not null,
Valor_Total double (9,2) not null,
foreign key (Cliente_id) references Clientes(Id_Cliente)
);

create table Detalhe_Dos_Pedidos(
Id_Detalhe_Pedido int primary key auto_increment,
Pedido_id int not null,
Produto_id int not null,
Quantidade_Produto int not null,
foreign key (Pedido_id) references Pedidos(Id_Pedido),
foreign key (Produto_id) references Produtos(Id_Produtos)
);

INSERT INTO Clientes (Nome_Cliente, Telefone_Cliente, Endereco_Cliente) VALUES
('Carlos Silva', '31999999999', 'Rua A, 123, Toledo - MG'),
('Ana Pereira', '31988888888', 'Av. Brasil, 456, Toledo - MG'),
('João Souza', '31977777777', 'Rua das Flores, 789, Toledo - MG'),
('Maria Oliveira', '31966666666', 'Rua dos Jacarandás, 101, Toledo - MG'),
('Paulo Costa', '31955555555', 'Avenida Sete, 202, Toledo - MG'),
('Fernanda Lima', '31944444444', 'Rua dos Lírios, 303, Toledo - MG'),
('Rafael Almeida', '31933333333', 'Rua das Acácias, 404, Toledo - MG'),
('Juliana Santos', '31922222222', 'Rua do Sol, 505, Toledo - MG'),
('Felipe Martins', '31911111111', 'Rua do Mar, 606, Toledo - MG'),
('Mariana Costa', '31900000000', 'Avenida Paulista, 707, Toledo - MG');

INSERT INTO Produtos (Nome_Produto, Preco_Produto, Categoria) VALUES
('Pizza Bacon', 62.00, 'Pizza'),
('Pizza de Atum', 55.00, 'Pizza'),
('Pizza de Carne Seca', 67.00, 'Pizza'),
('Pizza de Brócolis com Bacon', 58.00, 'Pizza'),
('Pizza de Alho e Óleo', 53.00, 'Pizza'),
('Pizza de Lombo Canadense', 65.00, 'Pizza'),
('Pizza Marguerita com Provolone', 59.00, 'Pizza'),
('Pizza de Frango com Bacon', 63.00, 'Pizza'),
('Pizza de Peperone com Cogumelos', 66.00, 'Pizza'),
('Pizza de Mussarela', 48.00, 'Pizza'),
('Pizza de Frango com Catupiry e Azeitona', 60.00, 'Pizza'),
('Pizza de Mexicana', 72.00, 'Pizza'),
('Pizza de Queijo Brie com Mel', 75.00, 'Pizza'),
('Pizza de Portobello', 70.00, 'Pizza'),
('Pizza de Rúcula com Presunto de Parma', 68.00, 'Pizza'),
('Pizza de Carne de Sol com Queijo Coalho', 74.00, 'Pizza'),
('Pizza de Picanha com Queijo Parmesão', 80.00, 'Pizza'),
('Pizza de Mussarela de Búfala', 65.00, 'Pizza'),
('Pizza de Camarão com Catupiry', 85.00, 'Pizza'),
('Pizza de Frutos do Mar', 90.00, 'Pizza'),
('Cerveja Skol', 10.00, 'Bebida'),
('Cerveja Brahma', 11.00, 'Bebida'),
('Cerveja Budweiser', 12.50, 'Bebida'),
('Cerveja Stella Artois', 13.00, 'Bebida'),
('Refrigerante Guaraná Antarctica', 7.00, 'Bebida'),
('Refrigerante Fanta Laranja', 6.50, 'Bebida'),
('Refrigerante Sprite', 6.50, 'Bebida'),
('Refrigerante Pepsi', 7.00, 'Bebida'),
('Água de Coco', 5.00, 'Bebida'),
('Suco Natural de Laranja', 8.00, 'Bebida');

INSERT INTO Pedidos (Cliente_id, Forma_De_Pagamento, Data_E_Hora_Pedido,Valor_Total) VALUES
(2,"Pix",current_timestamp,120);

INSERT INTO Detalhe_Dos_Pedidos (Pedido_id,Produto_id,Quantidade_Produto) VALUES
(2,3,1),
(2,27,1);


select * from Clientes;

select * from Produtos;

select * from Pedidos;

select * from Detalhe_Dos_Pedidos;

Select p.Id_Pedido,
c.Nome_Cliente,
c.Endereco_Cliente,
pd.Nome_Produto,
pd.Preco_Produto AS "Valor Unitario",
d.Quantidade_Produto,
d.Quantidade_Produto * pd.Preco_Produto As "Valor total"

from Pedidos p
join Clientes c on p.Cliente_id = c.Id_Cliente
join Detalhe_Dos_Pedidos d on d.Pedido_id = p.Id_Pedido
join Produtos pd on pd.Id_Produtos = d.Produto_id
where p.Id_pedido = 2;


SELECT
    p.Id_Pedido,
    c.Nome_Cliente,
    pd.Nome_Produto,
    d.Quantidade_Produto,
    pd.Preco_Produto * d.Quantidade_Produto AS ValorTotal
FROM
    Pedidos p
INNER JOIN Clientes c ON p.Cliente_id = c.Id_Cliente
INNER JOIN Detalhe_Dos_Pedidos d ON d.Pedido_id = p.Id_Pedido
INNER JOIN Produtos pd ON pd.Id_Produtos = d.Produto_id;
